package com.DEC.service;

import java.util.List;

import com.DEC.entity.TravelOrder;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelOrderService {

	public List<TravelOrder> findAllTravelOrder();
	public List<TravelOrder> findTravelOrderByUid(int uid);
	public List<TravelOrder> findTravelOrderByTid(int tid);
	public TravelOrder findTravelOrderByToid(int toid);
	public boolean addTravelOrder(TravelOrder travelOrder);
	public boolean editTravelOrder(TravelOrder travelOrder);
	public boolean delTravelOrder(int toid);
}
