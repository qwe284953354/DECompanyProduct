package com.DEC.dao;

import java.util.List;

import com.DEC.entity.Province;

/**
 * <p>Description: ProvinceDao接口类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IProvinceDao {
	
	public List<Province> findAllProvince();	//查找所有省份
}
