package com.DEC.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.ITravelTypeDao;
import com.DEC.entity.TravelType;
import com.DEC.service.ITravelTypeService;

/**
 * <p>Description: </p>
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
	 * <p>Description: </p>
	 * @param ttid
	 * @return 
	 * @see com.DEC.service.ITravelTypeService#findTravelTypeByTtid(int)
	 */
	public TravelType findTravelTypeByTtid(int ttid) {
		return travelTypeDao.findTravelTypeByTtid(ttid);
	}

}
