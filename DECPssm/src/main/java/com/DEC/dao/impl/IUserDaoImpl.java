package com.DEC.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.DEC.dao.IUserDao;
import com.DEC.entity.User;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Repository("userDao")
public class IUserDaoImpl extends SqlSessionDaoSupport implements IUserDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	private SqlSession sqlSession = null;
	/** 
	 * <p>Title: findAllUser</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.dao.IUserDao#findAllUser()
	 */
	public List<User> findAllUser() {
		sqlSession = this.getSqlSession();
		List<User> ulist = sqlSession.selectList("findAllUser");
		return ulist;
	}
	
	/** 
	 * <p>Title: findAllNormalUser</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.dao.IUserDao#findAllNormalUser()
	 */
	public List<User> findAllNormalUser() {
		sqlSession = this.getSqlSession();
		List<User> ulist = sqlSession.selectList("findAllNormalUser");
		return ulist;
	}

	/** 
	 * <p>Title: findUserByUid</p>  
	 * <p>Description: </p>
	 * @param uid
	 * @return 
	 * @see com.DEC.dao.IUserDao#findUserByUid(int)
	 */
	public User findUserByUid(int uid) {
		sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("findUserByUid", uid);
		return user;
	}

	/** 
	 * <p>Title: addUser</p>  
	 * <p>Description: </p>
	 * @param u
	 * @return 
	 * @see com.DEC.dao.IUserDao#addUser(com.DEC.entity.User)
	 */
	public int addUser(User u) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addUser", u);
		return row;
	}

	/** 
	 * <p>Title: editUser</p>  
	 * <p>Description: </p>
	 * @param u
	 * @return 
	 * @see com.DEC.dao.IUserDao#editUser(com.DEC.entity.User)
	 */
	public int editUser(User u) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editUser", u);
		return row;
	}

	/** 
	 * <p>Title: delUser</p>  
	 * <p>Description: </p>
	 * @param uid
	 * @return 
	 * @see com.DEC.dao.IUserDao#delUser(int)
	 */
	public int delUser(int uid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delUser", uid);
		return row;
	}

}
