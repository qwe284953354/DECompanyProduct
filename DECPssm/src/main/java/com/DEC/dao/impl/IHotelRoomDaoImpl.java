package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.IHotelRoomDao;
import com.DEC.entity.HotelRoom;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Repository("hotelRoomDao")
public class IHotelRoomDaoImpl extends SqlSessionDaoSupport implements IHotelRoomDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findHotelRoomByhid</p>  
	 * <p>Description: </p>
	 * @param hid
	 * @return 
	 * @see com.DEC.dao.IHotelRoomDao#findHotelRoomByhid()
	 */
	public List<HotelRoom> findHotelRoomByhid(int hid) {
		sqlSession = this.getSqlSession();
		List<HotelRoom> hrlist = sqlSession.selectList("findHotelRoomByhid", hid);
		return hrlist;
	}

}
