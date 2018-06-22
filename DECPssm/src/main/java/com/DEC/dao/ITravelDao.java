package com.DEC.dao;

import java.util.List;

import com.DEC.entity.Travel;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelDao {
	
	public List<Travel> findAllTravel();
	public List<Travel> findTravelByCid(int cid);
	public List<Travel> findTravelByType(int ttid);
	public List<Travel> findTravelByScenic(int tsid);
	public Travel findTravelByTid(int tid);
	public int addTravel(Travel t);
	public int editTravel(Travel t);
	public int delTravel(int tid);
}
