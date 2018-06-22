package com.DEC.service;

import java.util.List;

import com.DEC.entity.HotelInfo;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface IHotelInfoService {
	
	public List<HotelInfo> findAllHotelInfo();
	public HotelInfo findHotelInfoByHid(int hid);
	public boolean addHotelInfo(HotelInfo hotelInfo);
	public boolean editHotelInfo(HotelInfo hotelInfo);
	public boolean delHotelInfo(int hiid);
}
