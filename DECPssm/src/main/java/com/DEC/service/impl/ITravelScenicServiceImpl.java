package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.ITravelScenicDao;
import com.DEC.entity.TravelScenic;
import com.DEC.service.ITravelScenicService;

/**
 * <p>Description: </p>
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
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.service.ITravelScenicService#findAllScenic()
	 */
	public List<TravelScenic> findAllScenic() {
		return travelScenicDao.findAllScenic();
	}

	/** 
	 * <p>Title: findScenicByTsid</p>  
	 * <p>Description: </p>
	 * @param tsid
	 * @return 
	 * @see com.DEC.service.ITravelScenicService#findScenicByTsid(int)
	 */
	public TravelScenic findScenicByTsid(int tsid) {
		return travelScenicDao.findScenicByTsid(tsid);
	}

	/** 
	 * <p>Title: findScenicByCid</p>  
	 * <p>Description: </p>
	 * @param cid
	 * @return 
	 * @see com.DEC.service.ITravelScenicService#findScenicByCid(int)
	 */
	public List<TravelScenic> findScenicByCid(int cid) {
		return travelScenicDao.findScenicByCid(cid);
	}

	/** 
	 * <p>Title: findScenicByName</p>  
	 * <p>Description: </p>
	 * @param tsname
	 * @return 
	 * @see com.DEC.service.ITravelScenicService#findScenicByName(java.lang.String)
	 */
	public List<TravelScenic> findScenicByName(String tsname) {
		return travelScenicDao.findScenicByName(tsname);
	}

	/** 
	 * <p>Title: addTravelScenic</p>  
	 * <p>Description: </p>
	 * @param travelScenic
	 * @return 
	 * @see com.DEC.service.ITravelScenicService#addTravelScenic(com.DEC.entity.TravelScenic)
	 */
	public boolean addTravelScenic(TravelScenic travelScenic) {
		return (travelScenicDao.addTravelScenic(travelScenic) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editTravelScenic</p>  
	 * <p>Description: </p>
	 * @param travelScenic
	 * @return 
	 * @see com.DEC.service.ITravelScenicService#editTravelScenic(com.DEC.entity.TravelScenic)
	 */
	public boolean editTravelScenic(TravelScenic travelScenic) {
		return (travelScenicDao.editTravelScenic(travelScenic) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delTravelScenic</p>  
	 * <p>Description: </p>
	 * @param tsid
	 * @return 
	 * @see com.DEC.service.ITravelScenicService#delTravelScenic(int)
	 */
	public boolean delTravelScenic(int tsid) {
		return (travelScenicDao.delTravelScenic(tsid) > 0) ? true : false;
	}

}
