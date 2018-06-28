package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.IProvinceDao;
import com.DEC.entity.Province;

/**
 * <p>Description: ProvinceDao实现类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
@Repository("provinceDao")
public class IProvinceDaoImpl extends SqlSessionDaoSupport implements IProvinceDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findAllProvince</p>  
	 * <p>Description: 查找所有</p>
	 * @return List<Province>
	 * @see com.DEC.dao.IProvinceDao#findAllProvince()
	 */
	public List<Province> findAllProvince() {
		sqlSession = this.getSqlSession();
		List<Province> plist = sqlSession.selectList("findAllProvince");
		return plist;
	}

}
