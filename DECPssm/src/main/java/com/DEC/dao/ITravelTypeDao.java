package com.DEC.dao;

import com.DEC.entity.TravelType;

/**
 * <p>Description: 旅游项目类型接口类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelTypeDao {

	public TravelType findTravelTypeByTtid(int ttid);	//通过编号查找
}
