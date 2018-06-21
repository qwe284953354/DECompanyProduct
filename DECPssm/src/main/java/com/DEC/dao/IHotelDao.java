package com.DEC.dao;

import java.util.List;

import com.DEC.entity.Hotel;

/**
 * <p>Description: 酒店接口类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public interface IHotelDao {
	
	public List<Hotel> findAllHotel();
	public List<Hotel> findHotelByName(String name);
	public List<Hotel> findHotelByCid(int cid);
	public List<Hotel> findHotelByStar(String star);
	public List<Hotel> findHotelByType(String type);
	public Hotel findHotelByHid(int hid);
	public int addHotel(Hotel h);
	public int editHotel(Hotel h);
	public int delHotel(int hid);
}
