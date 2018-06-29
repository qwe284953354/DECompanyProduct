package com.DEC.service;

import java.util.List;

import com.DEC.entity.HotelRoom;

/**
 * <p>Description: HotelRoomService接口类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface IHotelRoomService {

	public List<HotelRoom> findHotelRoomByhid(int hid);		//通过酒店编号查找
}
