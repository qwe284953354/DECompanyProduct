package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.ITravelScenicDao;
import com.DEC.entity.TravelScenic;

/**
 * <p>Description: TravelScenicDao实现类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Repository("travelScenicDao")
public class ITravelScenicDaoImpl extends SqlSessionDaoSupport implements ITravelScenicDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findAllScenic</p>  
	 * <p>Description: 查找所有</p>
	 * @return List<TravelScenic>
	 * @see com.DEC.dao.ITravelScenicDao#findAllScenic()
	 */
	public List<TravelScenic> findAllScenic() {
		sqlSession = this.getSqlSession();
		List<TravelScenic> tclist = sqlSession.selectList("findAllScenic");
		return tclist;
	}

	/** 
	 * <p>Title: findScenicByTsid</p>  
	 * <p>Description: 通过编号查找</p>
	 * @param tsid 旅游景点编号
	 * @return TravelScenic
	 * @see com.DEC.dao.ITravelScenicDao#findScenicByTsid(int)
	 */
	public TravelScenic findScenicByTsid(int tsid) {
		sqlSession = this.getSqlSession();
		TravelScenic travelScenic = sqlSession.selectOne("findScenicByTsid", tsid);
		return travelScenic;
	}

	/** 
	 * <p>Title: findScenicByCid</p>  
	 * <p>Description: 通过城市编号查找</p>
	 * @param cid 城市编号
	 * @return List<TravelScenic>
	 * @see com.DEC.dao.ITravelScenicDao#findScenicByCid(int)
	 */
	public List<TravelScenic> findScenicByCid(int cid) {
		sqlSession = this.getSqlSession();
		List<TravelScenic> tclist = sqlSession.selectList("findScenicByCid", cid);
		return tclist;
	}

	/** 
	 * <p>Title: findScenicByName</p>  
	 * <p>Description: 通过名称查找</p>
	 * @param tsname 景点名称
	 * @return List<TravelScenic>
	 * @see com.DEC.dao.ITravelScenicDao#findScenicByName(java.lang.String)
	 */
	public List<TravelScenic> findScenicByName(String tsname) {
		sqlSession = this.getSqlSession();
		List<TravelScenic> tclist = sqlSession.selectList("findScenicByName", tsname);
		return tclist;
	}

	/** 
	 * <p>Title: addTravelScenic</p>  
	 * <p>Description: 添加</p>
	 * @param travelScenic TravelScenic对象
	 * @return row 受到添加操作影响的行数
	 * @see com.DEC.dao.ITravelScenicDao#addTravelScenic(com.DEC.entity.TravelScenic)
	 */
	public int addTravelScenic(TravelScenic travelScenic) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addTravelScenic", travelScenic);
		return row;
	}

	/** 
	 * <p>Title: editTravelScenic</p>  
	 * <p>Description: 修改</p>
	 * @param travelScenic TravelScenic对象
	 * @return row 受到修改操作影响的行数
	 * @see com.DEC.dao.ITravelScenicDao#editTravelScenic(com.DEC.entity.TravelScenic)
	 */
	public int editTravelScenic(TravelScenic travelScenic) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editTravelScenic", travelScenic);
		return row;
	}

	/** 
	 * <p>Title: delTravelScenic</p>  
	 * <p>Description: 删除</p>
	 * @param tsid 旅游景点编号
	 * @return row 受到删除操作影响的行数
	 * @see com.DEC.dao.ITravelScenicDao#delTravelScenic(int)
	 */
	public int delTravelScenic(int tsid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delTravelScenic", tsid);
		return row;
	}

}
