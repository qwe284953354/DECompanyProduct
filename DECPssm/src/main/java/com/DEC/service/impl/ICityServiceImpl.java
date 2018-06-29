package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.ICityDao;
import com.DEC.entity.City;

/**
 * <p>Description: CityService实现类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
@Service("cityService")
public class ICityServiceImpl implements com.DEC.service.ICityService {
	@Resource
	private ICityDao cityDao;
	
	/** 
	 * <p>Title: findCityByPid</p>  
	 * <p>Description: 通过省市编号查询</p>
	 * @param pid 省市编号
	 * @return List<City>
	 * @see com.DEC.service.ICityService#findCityByPid(int)
	 */
	public List<City> findCityByPid(int pid) {
		return cityDao.findCityByPid(pid);
	}

}
