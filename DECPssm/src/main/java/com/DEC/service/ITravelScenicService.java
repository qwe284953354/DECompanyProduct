package com.DEC.service;

import java.util.List;

import com.DEC.entity.TravelScenic;

/**
 * <p>Description: TravelScenicService接口类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelScenicService {

	public List<TravelScenic> findAllScenic();					//查找所有
	public TravelScenic findScenicByTsid(int tsid);				//通过编号查找
	public List<TravelScenic> findScenicByCid(int cid);			//通过城市编号查找
	public List<TravelScenic> findScenicByName(String tsname);	//通过景点名称查找
	public boolean addTravelScenic(TravelScenic travelScenic);		//添加
	public boolean editTravelScenic(TravelScenic travelScenic);		//修改
	public boolean delTravelScenic(int tsid);						//删除
}