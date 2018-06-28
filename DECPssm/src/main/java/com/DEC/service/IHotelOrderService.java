package com.DEC.service;

import java.util.List;

import com.DEC.entity.HotelOrder;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface IHotelOrderService {
	
	public List<HotelOrder> findAllHotelOrder();
	public List<HotelOrder> findHotelOrderByUid(int uid);
	public List<HotelOrder> findHotelOrderByHid(int hid);
	public HotelOrder findHotelOrderByHoid(int hoid);
	public boolean addHotelOrder(HotelOrder hotelOrder);
	public boolean editHotelOrder(HotelOrder hotelOrder);
	public boolean delHotelOrder(int hoid);
}
