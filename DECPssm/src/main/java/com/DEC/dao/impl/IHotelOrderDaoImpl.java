package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.IHotelOrderDao;
import com.DEC.entity.HotelOrder;

/**
 * <p>Description: HotelOrderDao实现类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Repository("hotelOrderDao")
public class IHotelOrderDaoImpl extends SqlSessionDaoSupport implements IHotelOrderDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findAllHotelOrder</p>  
	 * <p>Description: 查找所有</p>
	 * @return List<HotelOrder>
	 * @see com.DEC.dao.IHotelOrderDao#findAllHotelOrder()
	 */
	public List<HotelOrder> findAllHotelOrder() {
		sqlSession = this.getSqlSession();
		List<HotelOrder> holist = sqlSession.selectList("findAllHotelOrder");
		return holist;
	}

	/** 
	 * <p>Title: findHotelOrderByUid</p>  
	 * <p>Description: 通过用户编号查找</p>
	 * @param uid 用户编号
	 * @return List<HotelOrder>
	 * @see com.DEC.dao.IHotelOrderDao#findHotelOrderByUid(int)
	 */
	public List<HotelOrder> findHotelOrderByUid(int uid) {
		sqlSession = this.getSqlSession();
		List<HotelOrder> holist = sqlSession.selectList("findHotelOrderByUid", uid);
		return holist;
	}

	/** 
	 * <p>Title: findHotelOrderByHid</p>  
	 * <p>Description: 通过酒店编号查找</p>
	 * @param hid 酒店编号
	 * @return List<HotelOrder>
	 * @see com.DEC.dao.IHotelOrderDao#findHotelOrderByHid(int)
	 */
	public List<HotelOrder> findHotelOrderByHid(int hid) {
		sqlSession = this.getSqlSession();
		List<HotelOrder> holist = sqlSession.selectList("findHotelOrderByHid", hid);
		return holist;
	}

	/** 
	 * <p>Title: findHotelOrderByHoid</p>  
	 * <p>Description: 通过编号查找</p>
	 * @param hoid 酒店订单编号
	 * @return HotelOrder
	 * @see com.DEC.dao.IHotelOrderDao#findHotelOrderByHoid(int)
	 */
	public HotelOrder findHotelOrderByHoid(int hoid) {
		sqlSession = this.getSqlSession();
		HotelOrder hotelOrder = sqlSession.selectOne("findHotelOrderByHoid", hoid);
		return hotelOrder;
	}

	/** 
	 * <p>Title: addHotelOrder</p>  
	 * <p>Description: 添加</p>
	 * @param hotelOrder HotelOrder对象
	 * @return row 受到添加操作影响的行数
	 * @see com.DEC.dao.IHotelOrderDao#addHotelOrder(com.DEC.entity.HotelOrder)
	 */
	public int addHotelOrder(HotelOrder hotelOrder) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addHotelOrder", hotelOrder);
		return row;
	}

	/** 
	 * <p>Title: editHotelOrder</p>  
	 * <p>Description: 修改</p>
	 * @param hotelOrder HotelOrder对象
	 * @return row 受到修改操作影响的行数
	 * @see com.DEC.dao.IHotelOrderDao#editHotelOrder(com.DEC.entity.HotelOrder)
	 */
	public int editHotelOrder(HotelOrder hotelOrder) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editHotelOrder", hotelOrder);
		return row;
	}

	/** 
	 * <p>Title: delHotelOrder</p>  
	 * <p>Description: 删除</p>
	 * @param hoid 酒店订单编号
	 * @return row 受到删除操作影响的行数
	 * @see com.DEC.dao.IHotelOrderDao#delHotelOrder(int)
	 */
	public int delHotelOrder(int hoid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delHotelOrder", hoid);
		return row;
	}

}
