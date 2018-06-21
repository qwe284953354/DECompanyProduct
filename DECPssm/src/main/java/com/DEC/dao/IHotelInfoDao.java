package com.DEC.dao;

import java.util.List;

import com.DEC.entity.HotelInfo;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IHotelInfoDao {
	
	public List<HotelInfo> findAllHotelInfo();
	public HotelInfo findHotelInfoByHid(int hid);
	public int addHotelInfo(HotelInfo hotelInfo);
	public int editHotelInfo(HotelInfo hotelInfo);
	public int delHotelInfo(int hiid);
}
