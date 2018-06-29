package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.ITravelOrderDao;
import com.DEC.entity.TravelOrder;
import com.DEC.service.ITravelOrderService;

/**
 * <p>Description: TravelOrderService实现类</p>
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
	 * <p>Description: 查找所有</p>
	 * @return List<TravelOrder>
	 * @see com.DEC.service.ITravelOrderService#findAllTravelOrder()
	 */
	public List<TravelOrder> findAllTravelOrder() {
		return travelOrderDao.findAllTravelOrder();
	}

	/** 
	 * <p>Title: findTravelOrderByUid</p>  
	 * <p>Description: 通过用户编号查找</p>
	 * @param uid 用户编号
	 * @return List<TravelOrder>
	 * @see com.DEC.service.ITravelOrderService#findTravelOrderByUid(int)
	 */
	public List<TravelOrder> findTravelOrderByUid(int uid) {
		return travelOrderDao.findTravelOrderByUid(uid);
	}

	/** 
	 * <p>Title: findTravelOrderByTid</p>  
	 * <p>Description: 通过旅游项目编号查找</p>
	 * @param tid 旅游项目编号
	 * @return List<TravelOrder>
	 * @see com.DEC.service.ITravelOrderService#findTravelOrderByTid(int)
	 */
	public List<TravelOrder> findTravelOrderByTid(int tid) {
		return travelOrderDao.findTravelOrderByTid(tid);
	}

	/** 
	 * <p>Title: findTravelOrderByToid</p>  
	 * <p>Description: 通过编号查找</p>
	 * @param toid 旅游订单编号
	 * @return TravelOrder
	 * @see com.DEC.service.ITravelOrderService#findTravelOrderByToid(int)
	 */
	public TravelOrder findTravelOrderByToid(int toid) {
		return travelOrderDao.findTravelOrderByToid(toid);
	}

	/** 
	 * <p>Title: addTravelOrder</p>  
	 * <p>Description: 添加</p>
	 * @param travelOrder TravelOrder对象
	 * @return true成功/false失败
	 * @see com.DEC.service.ITravelOrderService#addTravelOrder(com.DEC.entity.TravelOrder)
	 */
	public boolean addTravelOrder(TravelOrder travelOrder) {
		return (travelOrderDao.addTravelOrder(travelOrder) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editTravelOrder</p>  
	 * <p>Description: 修改</p>
	 * @param travelOrder TravelOrder对象
	 * @return true成功/false失败
	 * @see com.DEC.service.ITravelOrderService#editTravelOrder(com.DEC.entity.TravelOrder)
	 */
	public boolean editTravelOrder(TravelOrder travelOrder) {
		return (travelOrderDao.editTravelOrder(travelOrder) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delTravelOrder</p>  
	 * <p>Description: 删除</p>
	 * @param toid 旅游订单编号
	 * @return true成功/false失败
	 * @see com.DEC.service.ITravelOrderService#delTravelOrder(int)
	 */
	public boolean delTravelOrder(int toid) {
		return (travelOrderDao.delTravelOrder(toid) > 0) ? true : false;
	}

}
