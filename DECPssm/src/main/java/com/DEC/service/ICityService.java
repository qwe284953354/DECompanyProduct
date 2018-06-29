package com.DEC.service;

import java.util.List;

import com.DEC.entity.City;

/**
 * <p>Description: CityService接口类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface ICityService {

	public List<City> findCityByPid(int pid);	//通过省市编号查找城市
	public City findCityByCname(String cname); //通过城市名查找城市
}
