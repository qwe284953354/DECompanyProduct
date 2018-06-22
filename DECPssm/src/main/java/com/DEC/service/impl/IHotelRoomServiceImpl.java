package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.IHotelRoomDao;
import com.DEC.entity.HotelRoom;
import com.DEC.service.IHotelRoomService;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Service("hotelRoomService")
public class IHotelRoomServiceImpl implements IHotelRoomService {
	@Resource
	private IHotelRoomDao hotelRoomDao;
	/** 
	 * <p>Title: findHotelRoomByhid</p>  
	 * <p>Description: </p>
	 * @param hid
	 * @return 
	 * @see com.DEC.service.IHotelRoomService#findHotelRoomByhid(int)
	 */
	public List<HotelRoom> findHotelRoomByhid(int hid) {
		return hotelRoomDao.findHotelRoomByhid(hid);
	}

}
