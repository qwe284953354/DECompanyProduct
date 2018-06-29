package com.DEC.service;

import java.util.List;

import com.DEC.entity.TravelOrder;

/**
 * <p>Description: TravelOrderService接口类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelOrderService {

	public List<TravelOrder> findAllTravelOrder();				//查找所有
	public List<TravelOrder> findTravelOrderByUid(int uid);		//通过用户编号查找
	public List<TravelOrder> findTravelOrderByTid(int tid);		//通过旅游项目编号查找
	public TravelOrder findTravelOrderByToid(int toid);			//通过编号查找
	public boolean addTravelOrder(TravelOrder travelOrder);		//添加
	public boolean editTravelOrder(TravelOrder travelOrder);	//修改
	public boolean delTravelOrder(int toid);					//删除
}
