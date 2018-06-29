package com.DEC.dao;

import java.util.List;

import com.DEC.entity.HotelOrder;

/**
 * <p>Description: HotelOrderDao接口类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IHotelOrderDao {
	
	public List<HotelOrder> findAllHotelOrder();				//查找所有酒店订单
	public List<HotelOrder> findHotelOrderByUid(int uid);		//通过用户编号查找酒店订单
	public List<HotelOrder> findHotelOrderByHid(int hid);		//通过酒店编号查找酒店订单
	public HotelOrder findHotelOrderByHoid(int hoid);			//通过编号查找订单
	public int addHotelOrder(HotelOrder hotelOrder);			//添加		
	public int editHotelOrder(HotelOrder hotelOrder);			//修改
	public int delHotelOrder(int hoid);							//删除
	
}
