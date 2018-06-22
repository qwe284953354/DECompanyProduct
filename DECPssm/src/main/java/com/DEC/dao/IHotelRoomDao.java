package com.DEC.dao;

import java.util.List;

import com.DEC.entity.HotelRoom;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IHotelRoomDao {
	
	public List<HotelRoom> findHotelRoomByhid(int hid);
	
}
