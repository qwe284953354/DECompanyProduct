package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.IHotelInfoDao;
import com.DEC.entity.HotelInfo;
import com.DEC.service.IHotelInfoService;

/**
 * <p>Description: HotelInfoService实现类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Service("hotelInfoService")
public class IHotelInfoServiceImpl implements IHotelInfoService {
	@Resource
	private IHotelInfoDao hotelInfoDao;
	
	/** 
	 * <p>Title: findAllHotelInfo</p>  
	 * <p>Description: 查找所有酒店信息</p>
	 * @return List<HotelInfo>
	 * @see com.DEC.service.IHotelInfoService#findAllHotelInfo()
	 */
	public List<HotelInfo> findAllHotelInfo() {
		return hotelInfoDao.findAllHotelInfo();
	}

	/** 
	 * <p>Title: findHotelInfoByHid</p>  
	 * <p>Description: 通过酒店编号查找</p>
	 * @param hid 酒店编号
	 * @return HotelInfo
	 * @see com.DEC.service.IHotelInfoService#findHotelInfoByHid(int)
	 */
	public HotelInfo findHotelInfoByHid(int hid) {
		return hotelInfoDao.findHotelInfoByHid(hid);
	}

	/** 
	 * <p>Title: addHotelInfo</p>  
	 * <p>Description: 添加</p>
	 * @param hotelInfo HotelInfo对象
	 * @return true成功/false失败
	 * @see com.DEC.service.IHotelInfoService#addHotelInfo(com.DEC.entity.HotelInfo)
	 */
	public boolean addHotelInfo(HotelInfo hotelInfo) {
		return (hotelInfoDao.addHotelInfo(hotelInfo) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editHotelInfo</p>  
	 * <p>Description: 修改</p>
	 * @param hotelInfo HotelInfo对象
	 * @return true成功/false失败
	 * @see com.DEC.service.IHotelInfoService#editHotelInfo(com.DEC.entity.HotelInfo)
	 */
	public boolean editHotelInfo(HotelInfo hotelInfo) {
		return (hotelInfoDao.editHotelInfo(hotelInfo) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delHotelInfo</p>  
	 * <p>Description: 删除</p>
	 * @param hiid 酒店信息编号
	 * @return true成功/false失败
	 * @see com.DEC.service.IHotelInfoService#delHotelInfo(int)
	 */
	public boolean delHotelInfo(int hiid) {
		return (hotelInfoDao.delHotelInfo(hiid) > 0) ? true : false;
	}

}
