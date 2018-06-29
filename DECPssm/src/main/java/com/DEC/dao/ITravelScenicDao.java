package com.DEC.dao;

import java.util.List;

import com.DEC.entity.TravelScenic;

/**
 * <p>Description: TravelScenicDao接口类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelScenicDao {

	public List<TravelScenic> findAllScenic();					//查找所有
	public TravelScenic findScenicByTsid(int tsid);				//通过编号查找
	public List<TravelScenic> findScenicByCid(int cid);			//通过城市编号查找
	public List<TravelScenic> findScenicByName(String tsname);	//通过景点名称查找
	public int addTravelScenic(TravelScenic travelScenic);		//添加
	public int editTravelScenic(TravelScenic travelScenic);		//修改
	public int delTravelScenic(int tsid);						//删除
}
