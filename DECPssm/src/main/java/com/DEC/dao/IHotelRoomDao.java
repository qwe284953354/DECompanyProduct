package com.DEC.dao;

import java.util.List;

import com.DEC.entity.HotelRoom;

/**
 * <p>Description: HotelRoomDao接口类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IHotelRoomDao {
	
	public List<HotelRoom> findHotelRoomByhid(int hid);		//通过酒店编号查找
	
}
