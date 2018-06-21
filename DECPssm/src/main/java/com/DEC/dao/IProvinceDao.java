package com.DEC.dao;

import java.util.List;

import com.DEC.entity.Province;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IProvinceDao {
	
	public List<Province> findAllProvince();
}
