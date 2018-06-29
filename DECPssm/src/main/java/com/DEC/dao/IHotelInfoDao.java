package com.DEC.dao;

import java.util.List;

import com.DEC.entity.HotelInfo;

/**
 * <p>Description: HotelInfoDao接口类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IHotelInfoDao {
	
	public List<HotelInfo> findAllHotelInfo();		//查找所有
	public HotelInfo findHotelInfoByHid(int hid);	//通过编号查找
	public int addHotelInfo(HotelInfo hotelInfo);	//添加
	public int editHotelInfo(HotelInfo hotelInfo);	//修改
	public int delHotelInfo(int hiid);				//删除
}
