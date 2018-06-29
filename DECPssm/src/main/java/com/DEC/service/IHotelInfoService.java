package com.DEC.service;

import java.util.List;

import com.DEC.entity.HotelInfo;

/**
 * <p>Description: HotelInfoService接口类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface IHotelInfoService {
	
	public List<HotelInfo> findAllHotelInfo();			//查找所有
	public HotelInfo findHotelInfoByHid(int hid);		//通过编号查找
	public boolean addHotelInfo(HotelInfo hotelInfo);	//添加
	public boolean editHotelInfo(HotelInfo hotelInfo);	//修改
	public boolean delHotelInfo(int hiid);				//删除
}
