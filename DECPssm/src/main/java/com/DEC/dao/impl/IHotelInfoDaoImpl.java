package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.IHotelInfoDao;
import com.DEC.entity.HotelInfo;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Repository("hotelInfoDao")
public class IHotelInfoDaoImpl extends SqlSessionDaoSupport implements IHotelInfoDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findAllHotelInfo</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.dao.IHotelInfoDao#findAllHotelInfo()
	 */
	public List<HotelInfo> findAllHotelInfo() {
		sqlSession = this.getSqlSession();
		List<HotelInfo> hilist = sqlSession.selectList("findAllHotelInfo");
		return hilist;
	}

	/** 
	 * <p>Title: findHotelInfoByHid</p>  
	 * <p>Description: </p>
	 * @param hid
	 * @return 
	 * @see com.DEC.dao.IHotelInfoDao#findHotelInfoByHid(int)
	 */
	public HotelInfo findHotelInfoByHid(int hid) {
		sqlSession = this.getSqlSession();
		HotelInfo hotelInfo = sqlSession.selectOne("findHotelInfoByHid", hid);
		return hotelInfo;
	}

	/** 
	 * <p>Title: addHotelInfo</p>  
	 * <p>Description: </p>
	 * @param hotelInfo
	 * @return 
	 * @see com.DEC.dao.IHotelInfoDao#addHotelInfo(com.DEC.entity.HotelInfo)
	 */
	public int addHotelInfo(HotelInfo hotelInfo) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addHotelInfo", hotelInfo);
		return row;
	}

	/** 
	 * <p>Title: editHotelInfo</p>  
	 * <p>Description: </p>
	 * @param hotelInfo
	 * @return 
	 * @see com.DEC.dao.IHotelInfoDao#editHotelInfo(com.DEC.entity.HotelInfo)
	 */
	public int editHotelInfo(HotelInfo hotelInfo) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editHotelInfo", hotelInfo);
		return row;
	}

	/** 
	 * <p>Title: delHotelInfo</p>  
	 * <p>Description: </p>
	 * @param hiid
	 * @return 
	 * @see com.DEC.dao.IHotelInfoDao#delHotelInfo(int)
	 */
	public int delHotelInfo(int hiid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delHotelInfo", hiid);
		return row;
	}

}
