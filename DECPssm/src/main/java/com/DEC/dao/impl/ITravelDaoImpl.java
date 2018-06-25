package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.ITravelDao;
import com.DEC.entity.Travel;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Repository("travelDao")
public class ITravelDaoImpl extends SqlSessionDaoSupport implements ITravelDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findAllTravel</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.dao.ITravelDao#findAllTravel()
	 */
	public List<Travel> findAllTravel() {
		sqlSession = this.getSqlSession();
		List<Travel> tlist = sqlSession.selectList("findAllTravel");
		return tlist;
	}

	/** 
	 * <p>Title: findTravelByCid</p>  
	 * <p>Description: </p>
	 * @param cid
	 * @return 
	 * @see com.DEC.dao.ITravelDao#findTravelByCid(int)
	 */
	public List<Travel> findTravelByCid(int cid) {
		sqlSession = this.getSqlSession();
		List<Travel> tlist = sqlSession.selectList("findTravelByCid", cid);
		return tlist;
	}

	/** 
	 * <p>Title: findTravelByType</p>  
	 * <p>Description: </p>
	 * @param ttid
	 * @return 
	 * @see com.DEC.dao.ITravelDao#findTravelByType(int)
	 */
	public List<Travel> findTravelByType(int ttid) {
		sqlSession = this.getSqlSession();
		List<Travel> tlist = sqlSession.selectList("findTravelByType", ttid);
		return tlist;
	}

	/** 
	 * <p>Title: findTravelByScenic</p>  
	 * <p>Description: </p>
	 * @param tsid
	 * @return 
	 * @see com.DEC.dao.ITravelDao#findTravelByScenic(int)
	 */
	public List<Travel> findTravelByScenic(int tsid) {
		sqlSession = this.getSqlSession();
		List<Travel> tlist = sqlSession.selectList("findTravelByScenic", tsid);
		return tlist;
	}

	/** 
	 * <p>Title: findTravelByTid</p>  
	 * <p>Description: </p>
	 * @param tid
	 * @return 
	 * @see com.DEC.dao.ITravelDao#findTravelByTid(int)
	 */
	public Travel findTravelByTid(int tid) {
		sqlSession = this.getSqlSession();
		Travel travel = sqlSession.selectOne("findTravelByTid", tid);
		return travel;
	}

	/** 
	 * <p>Title: addTravel</p>  
	 * <p>Description: </p>
	 * @param t
	 * @return 
	 * @see com.DEC.dao.ITravelDao#addTravel(com.DEC.entity.Travel)
	 */
	public int addTravel(Travel t) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addTravel", t);
		return row;
	}

	/** 
	 * <p>Title: editTravel</p>  
	 * <p>Description: </p>
	 * @param t
	 * @return 
	 * @see com.DEC.dao.ITravelDao#editTravel(com.DEC.entity.Travel)
	 */
	public int editTravel(Travel t) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editTravel", t);
		return row;
	}

	/** 
	 * <p>Title: delTravel</p>  
	 * <p>Description: </p>
	 * @param tid
	 * @return 
	 * @see com.DEC.dao.ITravelDao#delTravel(int)
	 */
	public int delTravel(int tid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delTravel", tid);
		return row;
	}

}
