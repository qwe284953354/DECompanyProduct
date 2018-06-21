package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.IProvinceDao;
import com.DEC.entity.Province;
import com.DEC.service.IProvinceService;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
@Service("provinceService")
public class IProvinceServiceImpl implements IProvinceService {
	@Resource
	private IProvinceDao provinceDao;
	/** 
	 * <p>Title: findAllProvince</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.service.IProvinceService#findAllProvince()
	 */
	public List<Province> findAllProvince() {
		return provinceDao.findAllProvince();
	}

}
