package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.ITravelOrderDao;
import com.DEC.entity.TravelOrder;
import com.DEC.service.ITravelOrderService;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Service("travelOrderService")
public class ITravelOrderServiceImpl implements ITravelOrderService {
	@Resource
	private ITravelOrderDao travelOrderDao;
	/** 
	 * <p>Title: findAllTravelOrder</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.service.ITravelOrderService#findAllTravelOrder()
	 */
	public List<TravelOrder> findAllTravelOrder() {
		return travelOrderDao.findAllTravelOrder();
	}

	/** 
	 * <p>Title: findTravelOrderByUid</p>  
	 * <p>Description: </p>
	 * @param uid
	 * @return 
	 * @see com.DEC.service.ITravelOrderService#findTravelOrderByUid(int)
	 */
	public List<TravelOrder> findTravelOrderByUid(int uid) {
		return travelOrderDao.findTravelOrderByUid(uid);
	}

	/** 
	 * <p>Title: findTravelOrderByTid</p>  
	 * <p>Description: </p>
	 * @param tid
	 * @return 
	 * @see com.DEC.service.ITravelOrderService#findTravelOrderByTid(int)
	 */
	public List<TravelOrder> findTravelOrderByTid(int tid) {
		return travelOrderDao.findTravelOrderByTid(tid);
	}

	/** 
	 * <p>Title: findTravelOrderByToid</p>  
	 * <p>Description: </p>
	 * @param toid
	 * @return 
	 * @see com.DEC.service.ITravelOrderService#findTravelOrderByToid(int)
	 */
	public TravelOrder findTravelOrderByToid(int toid) {
		return travelOrderDao.findTravelOrderByToid(toid);
	}

	/** 
	 * <p>Title: addTravelOrder</p>  
	 * <p>Description: </p>
	 * @param travelOrder
	 * @return 
	 * @see com.DEC.service.ITravelOrderService#addTravelOrder(com.DEC.entity.TravelOrder)
	 */
	public boolean addTravelOrder(TravelOrder travelOrder) {
		return (travelOrderDao.addTravelOrder(travelOrder) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editTravelOrder</p>  
	 * <p>Description: </p>
	 * @param travelOrder
	 * @return 
	 * @see com.DEC.service.ITravelOrderService#editTravelOrder(com.DEC.entity.TravelOrder)
	 */
	public boolean editTravelOrder(TravelOrder travelOrder) {
		return (travelOrderDao.editTravelOrder(travelOrder) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delTravelOrder</p>  
	 * <p>Description: </p>
	 * @param toid
	 * @return 
	 * @see com.DEC.service.ITravelOrderService#delTravelOrder(int)
	 */
	public boolean delTravelOrder(int toid) {
		return (travelOrderDao.delTravelOrder(toid) > 0) ? true : false;
	}

}
