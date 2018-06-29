package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.ITravelScenicDao;
import com.DEC.entity.TravelScenic;
import com.DEC.service.ITravelScenicService;

/**
 * <p>Description: TravelScenicService实现类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Service("travelScenicService")
public class ITravelScenicServiceImpl implements ITravelScenicService {
	@Resource
	private ITravelScenicDao travelScenicDao;
	
	/** 
	 * <p>Title: findAllScenic</p>  
	 * <p>Description: 查找所有</p>
	 * @return List<TravelScenic>
	 * @see com.DEC.service.ITravelScenicService#findAllScenic()
	 */
	public List<TravelScenic> findAllScenic() {
		return travelScenicDao.findAllScenic();
	}

	/** 
	 * <p>Title: findScenicByTsid</p>  
	 * <p>Description: 通过编号查找</p>
	 * @param tsid 旅游景点编号
	 * @return TravelScenic
	 * @see com.DEC.service.ITravelScenicService#findScenicByTsid(int)
	 */
	public TravelScenic findScenicByTsid(int tsid) {
		return travelScenicDao.findScenicByTsid(tsid);
	}

	/** 
	 * <p>Title: findScenicByCid</p>  
	 * <p>Description: 通过城市编号查找</p>
	 * @param cid 城市编号
	 * @return List<TravelScenic>
	 * @see com.DEC.service.ITravelScenicService#findScenicByCid(int)
	 */
	public List<TravelScenic> findScenicByCid(int cid) {
		return travelScenicDao.findScenicByCid(cid);
	}

	/** 
	 * <p>Title: findScenicByName</p>  
	 * <p>Description: 通过名称查找</p>
	 * @param tsname 景点名称
	 * @return List<TravelScenic>
	 * @see com.DEC.service.ITravelScenicService#findScenicByName(java.lang.String)
	 */
	public List<TravelScenic> findScenicByName(String tsname) {
		return travelScenicDao.findScenicByName(tsname);
	}

	/** 
	 * <p>Title: addTravelScenic</p>  
	 * <p>Description: 添加</p>
	 * @param travelScenic TravelScenic对象
	 * @return true成功/false失败
	 * @see com.DEC.service.ITravelScenicService#addTravelScenic(com.DEC.entity.TravelScenic)
	 */
	public boolean addTravelScenic(TravelScenic travelScenic) {
		return (travelScenicDao.addTravelScenic(travelScenic) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editTravelScenic</p>  
	 * <p>Description: 修改</p>
	 * @param travelScenic TravelScenic对象
	 * @return true成功/false失败
	 * @see com.DEC.service.ITravelScenicService#editTravelScenic(com.DEC.entity.TravelScenic)
	 */
	public boolean editTravelScenic(TravelScenic travelScenic) {
		return (travelScenicDao.editTravelScenic(travelScenic) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delTravelScenic</p>  
	 * <p>Description: 删除</p>
	 * @param tsid 旅游景点编号
	 * @return true成功/false失败
	 * @see com.DEC.service.ITravelScenicService#delTravelScenic(int)
	 */
	public boolean delTravelScenic(int tsid) {
		return (travelScenicDao.delTravelScenic(tsid) > 0) ? true : false;
	}

}
