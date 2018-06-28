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
	
	public List<Hotel> findAllHotel();					//查找所有酒店
	public List<Hotel> findHotelByName(String name);	//通过名称查找酒店(模糊查询)
	public List<Hotel> findHotelByCid(int cid);			//通过城市查找酒店
	public List<Hotel> findHotelByStar(String star);	//通过星级查找酒店
	public List<Hotel> findHotelByType(String type);	//通过类型查找酒店
	public Hotel findHotelByHid(int hid);				//通过酒店编号查找
	public int addHotel(Hotel h);						//添加
	public int editHotel(Hotel h);						//修改
	public int delHotel(int hid);						//删除
}
