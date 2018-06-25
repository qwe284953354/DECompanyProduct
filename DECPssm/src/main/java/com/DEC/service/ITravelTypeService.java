package com.DEC.service;

import com.DEC.entity.TravelType;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelTypeService {

	public TravelType findTravelTypeByTtid(int ttid);
}
