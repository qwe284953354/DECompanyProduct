package com.DEC.dao;

import java.util.List;

import com.DEC.entity.TravelScenic;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelScenicDao {

	public List<TravelScenic> findAllScenic();
	public TravelScenic findScenicByTsid(int tsid);
	public List<TravelScenic> findScenicByCid(int cid);
	public List<TravelScenic> findScenicByName(String tsname);
	public int addTravelScenic(TravelScenic travelScenic);
	public int editTravelScenic(TravelScenic travelScenic);
	public int delTravelScenic(int tsid);
}
