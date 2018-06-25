package com.DEC.service;

import java.util.List;

import com.DEC.entity.Travel;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelService {
	
	public List<Travel> findAllTravel();
	public List<Travel> findTravelByCid(int cid);
	public List<Travel> findTravelByType(int ttid);
	public List<Travel> findTravelByScenic(int tsid);
	public Travel findTravelByTid(int tid);
	public boolean addTravel(Travel t);
	public boolean editTravel(Travel t);
	public boolean delTravel(int tid);
}
