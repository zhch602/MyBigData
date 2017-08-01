package top.zhch602.spark


import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{Row, SQLContext}
import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.{SparkConf, SparkContext}
import org.json.JSONObject
import top.zhch602.spark.conf.ConfigurationManager
import top.zhch602.spark.constant.Constants
import top.zhch602.spark.dao.factory.DAOFactory
import top.zhch602.spark.test.MockData
import top.zhch602.spark.util.ParamUtils


class UserVisitSessionAnalyze {

}


object UserVisitSessionAnalyze {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName(Constants.SPARK_APP_NAME_SESSION).setMaster("local")

    val sc = new SparkContext(conf)

    val sqlContext = getSQLContext(sc)

    //生成模拟测试数据
    mockData(sc, sqlContext)

    //创建需要使用的DAO组件
    val taskDAO = DAOFactory.getTaskDAO

    //获取任务查询参数
    val taskid = ParamUtils.getTaskIdFromArgs(args,"123")
    val task = taskDAO.findById(taskid)
    val taskParam = new JSONObject(task.getTaskParam)

    val actionRDD = getActionRddByDateRange(sqlContext,taskParam)

    sc.stop()

  }

  def getSQLContext(sc: SparkContext): SQLContext = {
    val local = ConfigurationManager.getBoolean(Constants.SPARK_LOCAL)
    if (local)
      new SQLContext(sc)
    else
      new HiveContext(sc)
  }


  /**
    * 生成模拟数据（只有本地模式，才会去生成模拟数据）
    *
    * @param sc         sc
    * @param sqlContext SQLContext
    */
  private def mockData(sc: SparkContext, sqlContext: SQLContext) = {
    val local = ConfigurationManager.getBoolean(Constants.SPARK_LOCAL)
    if (local) MockData.mock(sc, sqlContext)
  }

  /**
    * 获取指定日期范围内的用户访问行为数据
    *
    * @param sqlContext SQLContext
    * @param taskParam  任务参数
    * @return 行为数据RDD
    */
  def getActionRddByDateRange(sqlContext: SQLContext, taskParam: JSONObject): RDD[Row] = {

    val startDate = ParamUtils.getParam(taskParam, Constants.PARAM_START_DATE)
    val endDate = ParamUtils.getParam(taskParam, Constants.PARAM_END_DATE)

    val sql = s"select * from user_visit_action where date>='$startDate' and date<='$endDate'"

    val actionDF = sqlContext.sql(sql)

    /**
      * 这里就很有可能发生上面说的问题
      * 比如说，Spark SQl默认就给第一个stage设置了20个task，但是根据你的数据量以及算法的复杂度
      * 实际上，你需要1000个task去并行执行
      *
      * 所以说，在这里，就可以对Spark SQL刚刚查询出来的RDD执行repartition重分区操作
      */

    actionDF.rdd

  }




}