package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.IUserDao;
import com.DEC.entity.User;
import com.DEC.service.IUserService;

/**
 * <p>Description: UserService实现类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	
	/** 
	 * <p>Title: findAllUser</p>  
	 * <p>Description: 查找所有</p>
	 * @return List<User>
	 * @see com.DEC.service.IUserService#findAllUser()
	 */
	public List<User> findAllUser() {
		return userDao.findAllUser();
	}
	
	/** 
	 * <p>Title: findAllNormalUser</p>  
	 * <p>Description: 查找所有普通用户(utype=0)</p>
	 * @return List<User>
	 * @see com.DEC.service.IUserService#findAllNormalUser()
	 */
	public List<User> findAllNormalUser() {
		return userDao.findAllNormalUser();
	}

	/** 
	 * <p>Title: findUserByUid</p>  
	 * <p>Description: 通过编号查找</p>
	 * @param uid 用户编号
	 * @return User
	 * @see com.DEC.service.IUserService#findUserByUid(int)
	 */
	public User findUserByUid(int uid) {
		return userDao.findUserByUid(uid);
	}
	
	/** 
	 * <p>Title: findUserByUname</p>  
	 * <p>Description: 通过名称查找</p>
	 * @param uname 用户名称
	 * @return User
	 * @see c com.DEC.service.IUserService#findUserByUname(String)
	 */
	public User findUserByUname(String uname) {
		return (userDao.findUserByUname(uname));
	}

	/** 
	 * <p>Title: addUser</p>  
	 * <p>Description: 添加</p>
	 * @param u User对象
	 * @return true成功/false失败
	 * @see com.DEC.service.IUserService#addUser(com.DEC.entity.User)
	 */
	public boolean addUser(User u) {
		return (userDao.addUser(u) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editUser</p>  
	 * <p>Description: 修改</p>
	 * @param u User对象
	 * @return true成功/false失败
	 * @see com.DEC.service.IUserService#editUser(com.DEC.entity.User)
	 */
	public boolean editUser(User u) {
		return (userDao.editUser(u) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delUser</p>  
	 * <p>Description: 删除</p>
	 * @param uid 用户编号
	 * @return true成功/false失败
	 * @see com.DEC.service.IUserService#delUser(int)
	 */
	public boolean delUser(int uid) {
		return (userDao.delUser(uid) > 0) ? true : false;
	}

}
