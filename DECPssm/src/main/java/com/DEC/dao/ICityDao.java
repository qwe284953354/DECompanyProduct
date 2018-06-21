package com.DEC.dao;

import java.util.List;

import com.DEC.entity.City;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface ICityDao {
	
	public List<City> findCityByPid(int pid);
}
