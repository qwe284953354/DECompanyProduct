package com.DEC.dao;

import com.DEC.entity.TravelType;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelTypeDao {

	public TravelType findTravelTypeByTtid(int ttid);
}
