package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.ICityDao;
import com.DEC.entity.City;

/**
 * <p>Description: CityDao实现类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
@Repository("cityDao")
public class ICityDaoImpl extends SqlSessionDaoSupport implements ICityDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findCityByPid</p>  
	 * <p>Description: 通过省市编号查询</p>
	 * @param pid 省市编号
	 * @return List<City>
	 * @see com.DEC.dao.ICityDao#findCityByPid(int)
	 */
	public List<City> findCityByPid(int pid) {
		sqlSession = this.getSqlSession();
		List<City> clist = sqlSession.selectList("findCityByPid", pid);
		return clist;
	}

}
