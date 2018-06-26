package com.DEC.dao.impl;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.ITravelTypeDao;
import com.DEC.entity.TravelType;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Repository("travelTypeDao")
public class ITravelTypeDaoImpl extends SqlSessionDaoSupport implements ITravelTypeDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findTravelTypeByTtid</p>  
	 * <p>Description: </p>
	 * @param ttid
	 * @return 
	 * @see com.DEC.dao.ITravelTypeDao#findTravelTypeByTtid(int)
	 */
	public TravelType findTravelTypeByTtid(int ttid) {
		sqlSession = this.getSqlSession();
		TravelType travelType = sqlSession.selectOne("findTravelTypeByTtid", ttid);
		return travelType;
	}

}
