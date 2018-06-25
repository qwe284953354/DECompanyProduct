package com.DEC.dao;

import java.util.List;

import com.DEC.entity.TravelOrder;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelOrderDao {

	public List<TravelOrder> findAllTravelOrder();
	public List<TravelOrder> findTravelOrderByUid(int uid);
	public List<TravelOrder> findTravelOrderByTid(int tid);
	public TravelOrder findTravelOrderByToid(int toid);
	public int addTravelOrder(TravelOrder travelOrder);
	public int editTravelOrder(TravelOrder travelOrder);
	public int delTravelOrder(int toid);
}
