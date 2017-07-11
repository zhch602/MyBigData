package top.zhch602.spark.dao.factory;

import top.zhch602.spark.dao.IAdBlacklistDAO;
import top.zhch602.spark.dao.IAdClickTrendDAO;
import top.zhch602.spark.dao.IAdProvinceTop3DAO;
import top.zhch602.spark.dao.IAdStatDAO;
import top.zhch602.spark.dao.IAdUserClickCountDAO;
import top.zhch602.spark.dao.IAreaTop3ProductDAO;
import top.zhch602.spark.dao.IPageSplitConvertRateDAO;
import top.zhch602.spark.dao.ISessionAggrStatDAO;
import top.zhch602.spark.dao.ISessionDetailDAO;
import top.zhch602.spark.dao.ISessionRandomExtractDAO;
import top.zhch602.spark.dao.ITaskDAO;
import top.zhch602.spark.dao.ITop10CategoryDAO;
import top.zhch602.spark.dao.ITop10SessionDAO;
import top.zhch602.spark.dao.impl.AdBlacklistDAOImpl;
import top.zhch602.spark.dao.impl.AdClickTrendDAOImpl;
import top.zhch602.spark.dao.impl.AdProvinceTop3DAOImpl;
import top.zhch602.spark.dao.impl.AdStatDAOImpl;
import top.zhch602.spark.dao.impl.AdUserClickCountDAOImpl;
import top.zhch602.spark.dao.impl.AreaTop3ProductDAOImpl;
import top.zhch602.spark.dao.impl.PageSplitConvertRateDAOImpl;
import top.zhch602.spark.dao.impl.SessionAggrStatDAOImpl;
import top.zhch602.spark.dao.impl.SessionDetailDAOImpl;
import top.zhch602.spark.dao.impl.SessionRandomExtractDAOImpl;
import top.zhch602.spark.dao.impl.TaskDAOImpl;
import top.zhch602.spark.dao.impl.Top10CategoryDAOImpl;
import top.zhch602.spark.dao.impl.Top10SessionDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {


	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}

	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
	
	public static ITop10SessionDAO getTop10SessionDAO() {
		return new Top10SessionDAOImpl();
	}
	
	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
		return new PageSplitConvertRateDAOImpl();
	}
	
	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
		return new AreaTop3ProductDAOImpl();
	}
	
	public static IAdUserClickCountDAO getAdUserClickCountDAO() {
		return new AdUserClickCountDAOImpl();
	}
	
	public static IAdBlacklistDAO getAdBlacklistDAO() {
		return new AdBlacklistDAOImpl();
	}
	
	public static IAdStatDAO getAdStatDAO() {
		return new AdStatDAOImpl();
	}
	
	public static IAdProvinceTop3DAO getAdProvinceTop3DAO() {
		return new AdProvinceTop3DAOImpl();
	}
	
	public static IAdClickTrendDAO getAdClickTrendDAO() {
		return new AdClickTrendDAOImpl();
	}
	
}
