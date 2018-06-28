package com.DEC.dao;

import java.util.List;

import com.DEC.entity.City;

/**
 * <p>Description: 城市接口类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface ICityDao {
	
	public List<City> findCityByPid(int pid);	//通过省市编号查找城市
}
