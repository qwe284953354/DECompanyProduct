package com.DEC.dao;

import java.util.List;

import com.DEC.entity.Travel;

/**
 * <p>Description: 旅游项目接口类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface ITravelDao {
	
	public List<Travel> findAllTravel();				//查找所有
	public List<Travel> findTravelByCid(int cid);		//通过城市编号查找
	public List<Travel> findTravelByType(int ttid);		//通过类型查找
	public List<Travel> findTravelByScenic(int tsid);	//通过景点查找
	public Travel findTravelByTid(int tid);				//通过编号查找
	public int addTravel(Travel t);						//添加
	public int editTravel(Travel t);					//修改
	public int delTravel(int tid);						//删除
}
