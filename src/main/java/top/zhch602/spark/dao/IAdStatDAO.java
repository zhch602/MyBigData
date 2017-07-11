package top.zhch602.spark.dao;

import java.util.List;

import top.zhch602.spark.domain.AdStat;

/**
 * 广告实时统计DAO接口
 * @author Administrator
 *
 */
public interface IAdStatDAO {

	void updateBatch(List<AdStat> adStats);
	
}
