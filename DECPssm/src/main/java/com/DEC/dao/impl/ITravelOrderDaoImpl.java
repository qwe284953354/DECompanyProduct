package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.ITravelOrderDao;
import com.DEC.entity.TravelOrder;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Repository("travelOrderDao")
public class ITravelOrderDaoImpl extends SqlSessionDaoSupport implements ITravelOrderDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findAllTravelOrder</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.dao.ITravelOrderDao#findAllTravelOrder()
	 */
	public List<TravelOrder> findAllTravelOrder() {
		sqlSession = this.getSqlSession();
		List<TravelOrder> tolist = sqlSession.selectList("findAllTravelOrder");
		return tolist;
	}

	/** 
	 * <p>Title: findTravelOrderByUid</p>  
	 * <p>Description: </p>
	 * @param uid
	 * @return 
	 * @see com.DEC.dao.ITravelOrderDao#findTravelOrderByUid(int)
	 */
	public List<TravelOrder> findTravelOrderByUid(int uid) {
		sqlSession = this.getSqlSession();
		List<TravelOrder> tolist = sqlSession.selectList("findTravelOrderByUid", uid);
		return tolist;
	}

	/** 
	 * <p>Title: findTravelOrderByTid</p>  
	 * <p>Description: </p>
	 * @param tid
	 * @return 
	 * @see com.DEC.dao.ITravelOrderDao#findTravelOrderByTid(int)
	 */
	public List<TravelOrder> findTravelOrderByTid(int tid) {
		sqlSession = this.getSqlSession();
		List<TravelOrder> tolist = sqlSession.selectList("findTravelOrderByTid", tid);
		return tolist;
	}

	/** 
	 * <p>Title: findTravelOrderByToid</p>  
	 * <p>Description: </p>
	 * @param toid
	 * @return 
	 * @see com.DEC.dao.ITravelOrderDao#findTravelOrderByToid(int)
	 */
	public TravelOrder findTravelOrderByToid(int toid) {
		sqlSession = this.getSqlSession();
		TravelOrder travelOrder = sqlSession.selectOne("findTravelOrderByToid", toid);
		return travelOrder;
	}

	/** 
	 * <p>Title: addTravelOrder</p>  
	 * <p>Description: </p>
	 * @param travelOrder
	 * @return 
	 * @see com.DEC.dao.ITravelOrderDao#addTravelOrder(com.DEC.entity.TravelOrder)
	 */
	public int addTravelOrder(TravelOrder travelOrder) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addTravelOrder", travelOrder);
		return row;
	}

	/** 
	 * <p>Title: editTravelOrder</p>  
	 * <p>Description: </p>
	 * @param travelOrder
	 * @return 
	 * @see com.DEC.dao.ITravelOrderDao#editTravelOrder(com.DEC.entity.TravelOrder)
	 */
	public int editTravelOrder(TravelOrder travelOrder) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editTravelOrder", travelOrder);
		return row;
	}

	/** 
	 * <p>Title: delTravelOrder</p>  
	 * <p>Description: </p>
	 * @param toid
	 * @return 
	 * @see com.DEC.dao.ITravelOrderDao#delTravelOrder(int)
	 */
	public int delTravelOrder(int toid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delTravelOrder", toid);
		return row;
	}

}
