package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.ITravelDao;
import com.DEC.entity.Travel;
import com.DEC.service.ITravelService;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Service("travelService")
public class ITravelServiceImpl implements ITravelService {
	@Resource
	private ITravelDao travelDao;
	/** 
	 * <p>Title: findAllTravel</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.service.ITravelService#findAllTravel()
	 */
	public List<Travel> findAllTravel() {
		return travelDao.findAllTravel();
	}

	/** 
	 * <p>Title: findTravelByCid</p>  
	 * <p>Description: </p>
	 * @param cid
	 * @return 
	 * @see com.DEC.service.ITravelService#findTravelByCid(int)
	 */
	public List<Travel> findTravelByCid(int cid) {
		return travelDao.findTravelByCid(cid);
	}

	/** 
	 * <p>Title: findTravelByType</p>  
	 * <p>Description: </p>
	 * @param ttid
	 * @return 
	 * @see com.DEC.service.ITravelService#findTravelByType(int)
	 */
	public List<Travel> findTravelByType(int ttid) {
		return travelDao.findTravelByType(ttid);
	}

	/** 
	 * <p>Title: findTravelByScenic</p>  
	 * <p>Description: </p>
	 * @param tsid
	 * @return 
	 * @see com.DEC.service.ITravelService#findTravelByScenic(int)
	 */
	public List<Travel> findTravelByScenic(int tsid) {
		return travelDao.findTravelByScenic(tsid);
	}

	/** 
	 * <p>Title: findTravelByTid</p>  
	 * <p>Description: </p>
	 * @param tid
	 * @return 
	 * @see com.DEC.service.ITravelService#findTravelByTid(int)
	 */
	public Travel findTravelByTid(int tid) {
		return travelDao.findTravelByTid(tid);
	}

	/** 
	 * <p>Title: addTravel</p>  
	 * <p>Description: </p>
	 * @param t
	 * @return 
	 * @see com.DEC.service.ITravelService#addTravel(com.DEC.entity.Travel)
	 */
	public boolean addTravel(Travel t) {
		return (travelDao.addTravel(t) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editTravel</p>  
	 * <p>Description: </p>
	 * @param t
	 * @return 
	 * @see com.DEC.service.ITravelService#editTravel(com.DEC.entity.Travel)
	 */
	public boolean editTravel(Travel t) {
		return (travelDao.editTravel(t) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delTravel</p>  
	 * <p>Description: </p>
	 * @param tid
	 * @return 
	 * @see com.DEC.service.ITravelService#delTravel(int)
	 */
	public boolean delTravel(int tid) {
		return (travelDao.delTravel(tid) > 0) ? true : false;
	}

}
