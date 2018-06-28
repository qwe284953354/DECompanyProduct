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
		List<Hotel> hlist = sqlSession.selectList("findHotelByName", name);
		return hlist;
	}

	/** 
	 * <p>Title: findHotelByCid</p>  
	 * <p>Description: 根据城市查找</p>
	 * @param cid 城市编号
	 * @return List<Hotel>
	 * @see com.DEC.dao.IHotelDao#findHotelByCid(int)
	 */
	public List<Hotel> findHotelByCid(int cid) {
		sqlSession = this.getSqlSession();
		List<Hotel> hlist = sqlSession.selectList("findHotelByCid", cid);
		return hlist;
	}

	/** 
	 * <p>Title: findHotelByStar</p>  
	 * <p>Description: 根据星级查找</p>
	 * @param star 酒店星级
	 * @return List<Hotel>
	 * @see com.DEC.dao.IHotelDao#findHotelByStar(java.lang.String)
	 */
	public List<Hotel> findHotelByStar(String star) {
		sqlSession = this.getSqlSession();
		List<Hotel> hlist = sqlSession.selectList("findHotelByStar", star);
		return hlist;
	}

	/** 
	 * <p>Title: findHotelByType</p>  
	 * <p>Description: 根据类型查找</p>
	 * @param type 酒店类型
	 * @return List<Hotel>
	 * @see com.DEC.dao.IHotelDao#findHotelByType(java.lang.String)
	 */
	public List<Hotel> findHotelByType(String type) {
		sqlSession = this.getSqlSession();
		List<Hotel> hlist = sqlSession.selectList("findHotelByType", type);
		return hlist;
	}

	/** 
	 * <p>Title: findHotelByHid</p>  
	 * <p>Description: 根据编号查找</p>
	 * @param hid 酒店编号
	 * @return Hotel
	 * @see com.DEC.dao.IHotelDao#findHotelByHid(int)
	 */
	public Hotel findHotelByHid(int hid) {
		sqlSession = this.getSqlSession();
		Hotel hotel = sqlSession.selectOne("findHotelByHid", hid);
		return hotel;
	}

	/** 
	 * <p>Title: addHotel</p>  
	 * <p>Description: </p>
	 * @param h Hotel对象
	 * @return row 受到添加操作影响的行数
	 * @see com.DEC.dao.IHotelDao#addHotel(com.DEC.entity.Hotel)
	 */
	public int addHotel(Hotel h) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addHotel", h);
		return row;
	}

	/** 
	 * <p>Title: editHotel</p>  
	 * <p>Description: </p>
	 * @param h Hotel对象
	 * @return row 受到修改操作影响的行数
	 * @see com.DEC.dao.IHotelDao#editHotel(com.DEC.entity.Hotel)
	 */
	public int editHotel(Hotel h) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editHotel", h);
		return row;
	}

	/** 
	 * <p>Title: delHotel</p>  
	 * <p>Description: </p>
	 * @param hid 酒店编号
	 * @return row 受到删除操作影响的行数
	 * @see com.DEC.dao.IHotelDao#delHotel(int)
	 */
	public int delHotel(int hid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delHotel", hid);
		return row;
	}

}
