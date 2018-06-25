package com.DEC.service;

import java.util.List;

import com.DEC.entity.TravelScenic;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelScenicService {

	public List<TravelScenic> findAllScenic();
	public TravelScenic findScenicByTsid(int tsid);
	public List<TravelScenic> findScenicByCid(int cid);
	public List<TravelScenic> findScenicByName(String tsname);
	public boolean addTravelScenic(TravelScenic travelScenic);
	public boolean editTravelScenic(TravelScenic travelScenic);
	public boolean delTravelScenic(int tsid);
}
