package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.IHotelOrderDao;
import com.DEC.entity.HotelOrder;
import com.DEC.service.IHotelOrderService;

/**
 * <p>Description: HotelOrderService实现类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Service("hotelOrderService")
public class IHotelOrderServiceImpl implements IHotelOrderService {
	@Resource
	private IHotelOrderDao hotelOrderDao;
	
	/** 
	 * <p>Title: findAllHotelOrder</p>  
	 * <p>Description: 查找所有</p>
	 * @return List<HotelOrder>
	 * @see com.DEC.service.IHotelOrderService#findAllHotelOrder()
	 */
	public List<HotelOrder> findAllHotelOrder() {
		return hotelOrderDao.findAllHotelOrder();
	}

	/** 
	 * <p>Title: findHotelOrderByUid</p>  
	 * <p>Description: 通过用户编号查找</p>
	 * @param uid 用户编号
	 * @return List<HotelOrder>
	 * @see com.DEC.service.IHotelOrderService#findHotelOrderByUid(int)
	 */
	public List<HotelOrder> findHotelOrderByUid(int uid) {
		return hotelOrderDao.findHotelOrderByUid(uid);
	}

	/** 
	 * <p>Title: findHotelOrderByHid</p>  
	 * <p>Description: 通过酒店编号查找</p>
	 * @param hid 酒店编号
	 * @return List<HotelOrder>
	 * @see com.DEC.service.IHotelOrderService#findHotelOrderByHid(int)
	 */
	public List<HotelOrder> findHotelOrderByHid(int hid) {
		return hotelOrderDao.findHotelOrderByHid(hid);
	}

	/** 
	 * <p>Title: findHotelOrderByHoid</p>  
	 * <p>Description: 通过编号查找</p>
	 * @param hoid 酒店订单编号
	 * @return HotelOrder
	 * @see com.DEC.service.IHotelOrderService#findHotelOrderByHoid(int)
	 */
	public HotelOrder findHotelOrderByHoid(int hoid) {
		return hotelOrderDao.findHotelOrderByHoid(hoid);
	}

	/** 
	 * <p>Title: addHotelOrder</p>  
	 * <p>Description: 添加</p>
	 * @param hotelOrder HotelOrder对象
	 * @return true成功/false失败
	 * @see com.DEC.service.IHotelOrderService#addHotelOrder(com.DEC.entity.HotelOrder)
	 */
	public boolean addHotelOrder(HotelOrder hotelOrder) {
		return (hotelOrderDao.addHotelOrder(hotelOrder) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editHotelOrder</p>  
	 * <p>Description: 修改</p>
	 * @param hotelOrder HotelOrder对象
	 * @return true成功/false失败
	 * @see com.DEC.service.IHotelOrderService#editHotelOrder(com.DEC.entity.HotelOrder)
	 */
	public boolean editHotelOrder(HotelOrder hotelOrder) {
		return (hotelOrderDao.editHotelOrder(hotelOrder) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delHotelOrder</p>  
	 * <p>Description: 删除</p>
	 * @param hoid 酒店订单编号
	 * @return true成功/false失败
	 * @see com.DEC.service.IHotelOrderService#delHotelOrder(int)
	 */
	public boolean delHotelOrder(int hoid) {
		return (hotelOrderDao.delHotelOrder(hoid) > 0) ? true : false;
	}

}
