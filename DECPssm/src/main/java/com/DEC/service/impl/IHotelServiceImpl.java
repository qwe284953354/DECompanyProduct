package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.IHotelDao;
import com.DEC.entity.Hotel;
import com.DEC.service.IHotelService;

/**
 * <p>Description: HotelService实现类</p>
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
	 * <p>Description: 查找全部</p>
	 * @return List<Hotel>
	 * @see com.DEC.service.IHotelService#findAllHotel()
	 */
	public List<Hotel> findAllHotel() {
		return hotelDao.findAllHotel();
	}

	/** 
	 * <p>Title: findHotelByName</p>  
	 * <p>Description: 根据名称查找(模糊查询)</p>
	 * @param name 酒店名称
	 * @return List<Hotel>
	 * @see com.DEC.service.IHotelService#findHotelByName(java.lang.String)
	 */
	public List<Hotel> findHotelByName(String name) {
		return hotelDao.findHotelByName(name);
	}

	/** 
	 * <p>Title: findHotelByStar</p>  
	 * <p>Description: 根据星级查找</p>
	 * @param star 酒店星级
	 * @return List<Hotel>
	 * @see com.DEC.service.IHotelService#findHotelByCid(int)
	 */
	public List<Hotel> findHotelByCid(int cid) {
		return hotelDao.findHotelByCid(cid);
	}

	/** 
	 * <p>Title: findHotelByStar</p>  
	 * <p>Description: 根据星级查找</p>
	 * @param star 酒店星级
	 * @return List<Hotel>
	 * @see com.DEC.service.IHotelService#findHotelByStar(java.lang.String)
	 */
	public List<Hotel> findHotelByStar(String star) {
		return hotelDao.findHotelByStar(star);
	}

	/** 
	 * <p>Title: findHotelByType</p>  
	 * <p>Description: 根据类型查找</p>
	 * @param type 酒店类型
	 * @return List<Hotel>
	 * @see com.DEC.service.IHotelService#findHotelByType(java.lang.String)
	 */
	public List<Hotel> findHotelByType(String type) {
		return hotelDao.findHotelByType(type);
	}

	/** 
	 * <p>Title: findHotelByHid</p>  
	 * <p>Description: 根据编号查找</p>
	 * @param hid 酒店编号
	 * @return Hotel
	 * @see com.DEC.service.IHotelService#findHotelByHid(int)
	 */
	public Hotel findHotelByHid(int hid) {
		return hotelDao.findHotelByHid(hid);
	}

	/** 
	 * <p>Title: addHotel</p>  
	 * <p>Description: 添加</p>
	 * @param h Hotel对象
	 * @return true成功/false失败
	 * @see com.DEC.service.IHotelService#addHotel(com.DEC.entity.Hotel)
	 */
	public boolean addHotel(Hotel h) {
		return (hotelDao.addHotel(h) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editHotel</p>  
	 * <p>Description: 修改</p>
	 * @param h Hotel对象
	 * @return true成功/false失败
	 * @see com.DEC.service.IHotelService#editHotel(com.DEC.entity.Hotel)
	 */
	public boolean editHotel(Hotel h) {
		return (hotelDao.editHotel(h) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delHotel</p>  
	 * <p>Description: 删除</p>
	 * @param hid 酒店编号
	 * @return true成功/false失败
	 * @see com.DEC.service.IHotelService#delHotel(int)
	 */
	public boolean delHotel(int hid) {
		return (hotelDao.delHotel(hid) > 0) ? true : false;
	}

}
