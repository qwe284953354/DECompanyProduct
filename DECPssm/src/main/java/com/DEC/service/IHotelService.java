package com.DEC.service;

import java.util.List;

import com.DEC.entity.Hotel;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IHotelService {
	
	public List<Hotel> findAllHotel();
	public List<Hotel> findHotelByName(String name);
	public List<Hotel> findHotelByCid(int cid);
	public List<Hotel> findHotelByStar(String star);
	public List<Hotel> findHotelByType(String type);
	public Hotel findHotelByHid(int hid);
	public boolean addHotel(Hotel h);
	public boolean editHotel(Hotel h);
	public boolean delHotel(int hid);
}
