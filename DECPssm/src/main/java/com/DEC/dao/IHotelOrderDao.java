package com.DEC.dao;

import java.util.List;

import com.DEC.entity.HotelOrder;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IHotelOrderDao {
	
	public List<HotelOrder> findAllHotelOrder();
	public List<HotelOrder> findHotelOrderByUid(int uid);
	public List<HotelOrder> findHotelOrderByHoid(int hoid);
	public HotelOrder findHotelOrderByHid(int hid);
	public int addHotelOrder(HotelOrder hotelOrder);
	public int editHotelOrder(HotelOrder hotelOrder);
	public int delHotelOrder(int hoid);
	
}
