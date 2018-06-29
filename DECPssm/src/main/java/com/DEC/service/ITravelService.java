package com.DEC.service;

import java.util.List;

import com.DEC.entity.Travel;

/**
 * <p>Description: TravelService接口类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelService {
	
	public List<Travel> findAllTravel();				//查找所有
	public List<Travel> findTravelByCid(int cid);		//通过城市编号查找
	public List<Travel> findTravelByType(int ttid);		//通过类型查找
	public List<Travel> findTravelByScenic(int tsid);	//通过景点查找
	public Travel findTravelByTid(int tid);				//通过编号查找
	public boolean addTravel(Travel t);					//添加
	public boolean editTravel(Travel t);				//修改
	public boolean delTravel(int tid);					//删除
}
