package com.DEC.service;

import java.util.List;

import com.DEC.entity.Province;

/**
 * <p>Description: ProvinceService接口类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IProvinceService {
	
	public List<Province> findAllProvince();	//查找所有省份
}
