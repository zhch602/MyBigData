package top.zhch602.spark.dao.factory;

//import tech.zhangchi.spark.dao.IAdBlacklistDAO;
//import tech.zhangchi.spark.dao.IAdClickTrendDAO;
//import tech.zhangchi.spark.dao.IAdProvinceTop3DAO;
//import tech.zhangchi.spark.dao.IAdStatDAO;
//import tech.zhangchi.spark.dao.IAdUserClickCountDAO;
//import tech.zhangchi.spark.dao.IAreaTop3ProductDAO;
//import tech.zhangchi.spark.dao.IPageSplitConvertRateDAO;
//import tech.zhangchi.spark.dao.ISessionAggrStatDAO;
//import tech.zhangchi.spark.dao.ISessionDetailDAO;
//import tech.zhangchi.spark.dao.ISessionRandomExtractDAO;
import tech.zhangchi.spark.dao.ITaskDAO;
//import tech.zhangchi.spark.dao.ITop10CategoryDAO;
//import tech.zhangchi.spark.dao.ITop10SessionDAO;
//import tech.zhangchi.spark.dao.impl.AdBlacklistDAOImpl;
//import tech.zhangchi.spark.dao.impl.AdClickTrendDAOImpl;
//import tech.zhangchi.spark.dao.impl.AdProvinceTop3DAOImpl;
//import tech.zhangchi.spark.dao.impl.AdStatDAOImpl;
//import tech.zhangchi.spark.dao.impl.AdUserClickCountDAOImpl;
//import tech.zhangchi.spark.dao.impl.AreaTop3ProductDAOImpl;
//import tech.zhangchi.spark.dao.impl.PageSplitConvertRateDAOImpl;
//import tech.zhangchi.spark.dao.impl.SessionAggrStatDAOImpl;
//import tech.zhangchi.spark.dao.impl.SessionDetailDAOImpl;
//import tech.zhangchi.spark.dao.impl.SessionRandomExtractDAOImpl;
import top.zhch602.spark.dao.impl.TaskDAOImpl;
//import tech.zhangchi.spark.dao.impl.Top10CategoryDAOImpl;
//import tech.zhangchi.spark.dao.impl.Top10SessionDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {


	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}

//	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
//		return new SessionAggrStatDAOImpl();
//	}
//
//	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
//		return new SessionRandomExtractDAOImpl();
//	}
//
//	public static ISessionDetailDAO getSessionDetailDAO() {
//		return new SessionDetailDAOImpl();
//	}
//
//	public static ITop10CategoryDAO getTop10CategoryDAO() {
//		return new Top10CategoryDAOImpl();
//	}
//
//	public static ITop10SessionDAO getTop10SessionDAO() {
//		return new Top10SessionDAOImpl();
//	}
//
//	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
//		return new PageSplitConvertRateDAOImpl();
//	}
//
//	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
//		return new AreaTop3ProductDAOImpl();
//	}
//
//	public static IAdUserClickCountDAO getAdUserClickCountDAO() {
//		return new AdUserClickCountDAOImpl();
//	}
//
//	public static IAdBlacklistDAO getAdBlacklistDAO() {
//		return new AdBlacklistDAOImpl();
//	}
//
//	public static IAdStatDAO getAdStatDAO() {
//		return new AdStatDAOImpl();
//	}
//
//	public static IAdProvinceTop3DAO getAdProvinceTop3DAO() {
//		return new AdProvinceTop3DAOImpl();
//	}
//
//	public static IAdClickTrendDAO getAdClickTrendDAO() {
//		return new AdClickTrendDAOImpl();
//	}
	
}
