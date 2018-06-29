package com.DEC.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.ITravelTypeDao;
import com.DEC.entity.TravelType;
import com.DEC.service.ITravelTypeService;

/**
 * <p>Description: TravelTypeService实现类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Service("travelTypeService")
public class ITravelTypeServiceImpl implements ITravelTypeService {
	@Resource
	private ITravelTypeDao travelTypeDao;
	
	/** 
	 * <p>Title: findTravelTypeByTtid</p>  
	 * <p>Description: 通过编号查找</p>
	 * @param ttid 类型编号
	 * @return TravelType
	 * @see com.DEC.service.ITravelTypeService#findTravelTypeByTtid(int)
	 */
	public TravelType findTravelTypeByTtid(int ttid) {
		return travelTypeDao.findTravelTypeByTtid(ttid);
	}

}
