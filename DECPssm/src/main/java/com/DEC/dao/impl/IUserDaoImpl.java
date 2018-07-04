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
 * <p>Description: UserDao实现类</p>
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
	 * <p>Description: 查找所有</p>
	 * @return List<User>
	 * @see com.DEC.dao.IUserDao#findAllUser()
	 */
	public List<User> findAllUser() {
		sqlSession = this.getSqlSession();
		List<User> ulist = sqlSession.selectList("findAllUser");
		return ulist;
	}
	
	/** 
	 * <p>Title: findAllNormalUser</p>  
	 * <p>Description: 查找所有普通用户(utype=0)</p>
	 * @return List<User>
	 * @see com.DEC.dao.IUserDao#findAllNormalUser()
	 */
	public List<User> findAllNormalUser() {
		sqlSession = this.getSqlSession();
		List<User> ulist = sqlSession.selectList("findAllNormalUser");
		return ulist;
	}

	/** 
	 * <p>Title: findUserByUid</p>  
	 * <p>Description: 通过编号查找</p>
	 * @param uid 用户编号
	 * @return User
	 * @see com.DEC.dao.IUserDao#findUserByUid(int)
	 */
	public User findUserByUid(int uid) {
		sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("findUserByUid", uid);
		return user;
	}
	
	/** 
	 * <p>Title: findUserByUname</p>  
	 * <p>Description: 通过名称查找</p>
	 * @param uname 用户名称
	 * @return User
	 * @see com.DEC.dao.IUserDao#findUserByUname(String)
	 */
	public User findUserByUname(String uname) {
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("findUserByUname", uname);
		if(user.getHotelOrderlist()==null) {
			user.setHotelOrderlist(null);
		}
		if(user.getTravelOrderlist()==null) {
			user.setTravelOrderlist(null);
		}
		return user;
	}

	/** 
	 * <p>Title: addUser</p>  
	 * <p>Description: 添加</p>
	 * @param u User对象
	 * @return row 受到添加操作影响的行数
	 * @see com.DEC.dao.IUserDao#addUser(com.DEC.entity.User)
	 */
	public int addUser(User u) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addUser", u);
		return row;
	}

	/** 
	 * <p>Title: editUser</p>  
	 * <p>Description: 修改</p>
	 * @param u User对象
	 * @return row 受到修改操作影响的行数
	 * @see com.DEC.dao.IUserDao#editUser(com.DEC.entity.User)
	 */
	public int editUser(User u) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editUser", u);
		return row;
	}

	/** 
	 * <p>Title: delUser</p>  
	 * <p>Description: 删除</p>
	 * @param uid 用户编号
	 * @return row 受到删除操作影响的行数
	 * @see com.DEC.dao.IUserDao#delUser(int)
	 */
	public int delUser(int uid) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delUser", uid);
		return row;
	}

}
