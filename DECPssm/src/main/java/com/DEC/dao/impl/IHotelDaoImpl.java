package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.IHotelDao;
import com.DEC.entity.Hotel;

/**
 * <p>Description: HotelDao实现类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
@Repository("hotelDao")
public class IHotelDaoImpl extends SqlSessionDaoSupport implements IHotelDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findAllHotel</p>  
	 * <p>Description: 查找全部</p>
	 * @return List<Hotel>
	 * @see com.DEC.dao.IHotelDao#findAllHotel()
	 */
	public List<Hotel> findAllHotel() {
		sqlSession = this.getSqlSession();
		List<Hotel> hlist = sqlSession.selectList("findAllHotel");
		return hlist;
	}

	/** 
	 * <p>Title: findHotelByName</p>  
	 * <p>Description: 根据名称查找(模糊查询)</p>
	 * @param name 酒店名称
	 * @return List<Hotel>
	 * @see com.DEC.dao.IHotelDao#findHotelByName(java.lang.String)
	 */
	public List<Hotel> findHotelByName(String name) {
		sqlSession = this.getSqlSession();
		List<Hotel> hlist = sqlSession.selectList("findHotelByName");
		return hlist;
	}

	/** 
	 * <p>Title: findHotelByCid</p>  
	 * <p>Description: </p>
	 * @param cid
	 * @return 
	 * @see com.DEC.dao.IHotelDao#findHotelByCid(int)
	 */
	public List<Hotel> findHotelByCid(int cid) {

		return null;
	}

	/** 
	 * <p>Title: findHotelByStar</p>  
	 * <p>Description: </p>
	 * @param star
	 * @return 
	 * @see com.DEC.dao.IHotelDao#findHotelByStar(java.lang.String)
	 */
	public List<Hotel> findHotelByStar(String star) {

		return null;
	}

	/** 
	 * <p>Title: findHotelByType</p>  
	 * <p>Description: </p>
	 * @param type
	 * @return 
	 * @see com.DEC.dao.IHotelDao#findHotelByType(java.lang.String)
	 */
	public List<Hotel> findHotelByType(String type) {

		return null;
	}

	/** 
	 * <p>Title: findHotelByHid</p>  
	 * <p>Description: </p>
	 * @param hid
	 * @return 
	 * @see com.DEC.dao.IHotelDao#findHotelByHid(int)
	 */
	public Hotel findHotelByHid(int hid) {

		return null;
	}

	/** 
	 * <p>Title: addHotel</p>  
	 * <p>Description: </p>
	 * @param h
	 * @return 
	 * @see com.DEC.dao.IHotelDao#addHotel(com.DEC.entity.Hotel)
	 */
	public int addHotel(Hotel h) {

		return 0;
	}

	/** 
	 * <p>Title: editHotel</p>  
	 * <p>Description: </p>
	 * @param h
	 * @return 
	 * @see com.DEC.dao.IHotelDao#editHotel(com.DEC.entity.Hotel)
	 */
	public int editHotel(Hotel h) {

		return 0;
	}

	/** 
	 * <p>Title: delHotel</p>  
	 * <p>Description: </p>
	 * @param hid
	 * @return 
	 * @see com.DEC.dao.IHotelDao#delHotel(int)
	 */
	public int delHotel(int hid) {

		return 0;
	}

}
