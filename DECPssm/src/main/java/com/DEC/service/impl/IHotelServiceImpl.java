package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.IHotelDao;
import com.DEC.entity.Hotel;
import com.DEC.service.IHotelService;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月21日 
 *
 */

@Service("hotelService")
public class IHotelServiceImpl implements IHotelService {
	@Resource
	private IHotelDao hotelDao;
	/** 
	 * <p>Title: findAllHotel</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.service.IHotelService#findAllHotel()
	 */
	public List<Hotel> findAllHotel() {
		return hotelDao.findAllHotel();
	}

	/** 
	 * <p>Title: findHotelByName</p>  
	 * <p>Description: </p>
	 * @param name
	 * @return 
	 * @see com.DEC.service.IHotelService#findHotelByName(java.lang.String)
	 */
	public List<Hotel> findHotelByName(String name) {
		return hotelDao.findHotelByName(name);
	}

	/** 
	 * <p>Title: findHotelByCid</p>  
	 * <p>Description: </p>
	 * @param cid
	 * @return 
	 * @see com.DEC.service.IHotelService#findHotelByCid(int)
	 */
	public List<Hotel> findHotelByCid(int cid) {
		return hotelDao.findHotelByCid(cid);
	}

	/** 
	 * <p>Title: findHotelByStar</p>  
	 * <p>Description: </p>
	 * @param star
	 * @return 
	 * @see com.DEC.service.IHotelService#findHotelByStar(java.lang.String)
	 */
	public List<Hotel> findHotelByStar(String star) {
		return hotelDao.findHotelByStar(star);
	}

	/** 
	 * <p>Title: findHotelByType</p>  
	 * <p>Description: </p>
	 * @param type
	 * @return 
	 * @see com.DEC.service.IHotelService#findHotelByType(java.lang.String)
	 */
	public List<Hotel> findHotelByType(String type) {
		return hotelDao.findHotelByType(type);
	}

	/** 
	 * <p>Title: findHotelByHid</p>  
	 * <p>Description: </p>
	 * @param hid
	 * @return 
	 * @see com.DEC.service.IHotelService#findHotelByHid(int)
	 */
	public Hotel findHotelByHid(int hid) {
		return hotelDao.findHotelByHid(hid);
	}

	/** 
	 * <p>Title: addHotel</p>  
	 * <p>Description: </p>
	 * @param h
	 * @return 
	 * @see com.DEC.service.IHotelService#addHotel(com.DEC.entity.Hotel)
	 */
	public boolean addHotel(Hotel h) {
		return (hotelDao.addHotel(h) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editHotel</p>  
	 * <p>Description: </p>
	 * @param h
	 * @return 
	 * @see com.DEC.service.IHotelService#editHotel(com.DEC.entity.Hotel)
	 */
	public boolean editHotel(Hotel h) {
		return (hotelDao.editHotel(h) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delHotel</p>  
	 * <p>Description: </p>
	 * @param hid
	 * @return 
	 * @see com.DEC.service.IHotelService#delHotel(int)
	 */
	public boolean delHotel(int hid) {
		return (hotelDao.delHotel(hid) > 0) ? true : false;
	}

}
