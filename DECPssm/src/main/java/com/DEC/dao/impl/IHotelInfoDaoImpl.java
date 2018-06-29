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
 * <p>Description: HotelInfoDao实现类</p>
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
	 * <p>Description: 查找所有酒店信息</p>
	 * @return List<HotelInfo>
	 * @see com.DEC.dao.IHotelInfoDao#findAllHotelInfo()
	 */
	public List<HotelInfo> findAllHotelInfo() {
		sqlSession = this.getSqlSession();
		List<HotelInfo> hilist = sqlSession.selectList("findAllHotelInfo");
		return hilist;
	}

	/** 
	 * <p>Title: findHotelInfoByHid</p>  
	 * <p>Description: 通过酒店编号查找</p>
	 * @param hid 酒店编号
	 * @return HotelInfo
	 * @see com.DEC.dao.IHotelInfoDao#findHotelInfoByHid(int)
	 */
	public HotelInfo findHotelInfoByHid(int hid) {
		sqlSession = this.getSqlSession();
		HotelInfo hotelInfo = sqlSession.selectOne("findHotelInfoByHid", hid);
		return hotelInfo;
	}

	/** 
	 * <p>Title: addHotelInfo</p>  
	 * <p>Description: 添加</p>
	 * @param hotelInfo HotelInfo对象
	 * @return row 受到添加操作影响的行数
	 * @see com.DEC.dao.IHotelInfoDao#addHotelInfo(com.DEC.entity.HotelInfo)
	 */
	public int addHotelInfo(HotelInfo hotelInfo) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addHotelInfo", hotelInfo);
		return row;
	}

	/** 
	 * <p>Title: editHotelInfo</p>  
	 * <p>Description: 修改</p>
	 * @param hotelInfo HotelInfo对象
	 * @return row 受到修改操作影响的行数
	 * @see com.DEC.dao.IHotelInfoDao#editHotelInfo(com.DEC.entity.HotelInfo)
	 */
	public int editHotelInfo(HotelInfo hotelInfo) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editHotelInfo", hotelInfo);
		return row;
	}

	/** 
	 * <p>Title: delHotelInfo</p>  
	 * <p>Description: 删除</p>
	 * @param hiid 酒店信息编号
	 * @return row 受到删除操作影响的行数
	 * @see com.DEC.dao.IHotelInfoDao#delHotelInfo(int)
	 */
	public int delHotelInfo(int hiid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delHotelInfo", hiid);
		return row;
	}

}
