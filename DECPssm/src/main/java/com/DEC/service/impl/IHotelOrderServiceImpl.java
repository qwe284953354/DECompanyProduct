package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.IHotelOrderDao;
import com.DEC.entity.HotelOrder;
import com.DEC.service.IHotelOrderService;

/**
 * <p>Description: </p>
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
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.service.IHotelOrderService#findAllHotelOrder()
	 */
	public List<HotelOrder> findAllHotelOrder() {
		return hotelOrderDao.findAllHotelOrder();
	}

	/** 
	 * <p>Title: findHotelOrderByUid</p>  
	 * <p>Description: </p>
	 * @param uid
	 * @return 
	 * @see com.DEC.service.IHotelOrderService#findHotelOrderByUid(int)
	 */
	public List<HotelOrder> findHotelOrderByUid(int uid) {
		return hotelOrderDao.findHotelOrderByUid(uid);
	}

	/** 
	 * <p>Title: findHotelOrderByHoid</p>  
	 * <p>Description: </p>
	 * @param hoid
	 * @return 
	 * @see com.DEC.service.IHotelOrderService#findHotelOrderByHoid(int)
	 */
	public List<HotelOrder> findHotelOrderByHoid(int hoid) {
		return hotelOrderDao.findHotelOrderByHoid(hoid);
	}

	/** 
	 * <p>Title: findHotelOrderByHid</p>  
	 * <p>Description: </p>
	 * @param hid
	 * @return 
	 * @see com.DEC.service.IHotelOrderService#findHotelOrderByHid(int)
	 */
	public HotelOrder findHotelOrderByHid(int hid) {
		return hotelOrderDao.findHotelOrderByHid(hid);
	}

	/** 
	 * <p>Title: addHotelOrder</p>  
	 * <p>Description: </p>
	 * @param hotelOrder
	 * @return 
	 * @see com.DEC.service.IHotelOrderService#addHotelOrder(com.DEC.entity.HotelOrder)
	 */
	public boolean addHotelOrder(HotelOrder hotelOrder) {
		return (hotelOrderDao.addHotelOrder(hotelOrder) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editHotelOrder</p>  
	 * <p>Description: </p>
	 * @param hotelOrder
	 * @return 
	 * @see com.DEC.service.IHotelOrderService#editHotelOrder(com.DEC.entity.HotelOrder)
	 */
	public boolean editHotelOrder(HotelOrder hotelOrder) {
		return (hotelOrderDao.editHotelOrder(hotelOrder) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delHotelOrder</p>  
	 * <p>Description: </p>
	 * @param hoid
	 * @return 
	 * @see com.DEC.service.IHotelOrderService#delHotelOrder(int)
	 */
	public boolean delHotelOrder(int hoid) {
		return (hotelOrderDao.delHotelOrder(hoid) > 0) ? true : false;
	}

}
