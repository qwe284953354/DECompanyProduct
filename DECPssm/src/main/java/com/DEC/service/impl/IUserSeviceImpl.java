package com.DEC.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DEC.dao.IUserDao;
import com.DEC.entity.User;
import com.DEC.service.IUserSevice;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
@Service("userService")
public class IUserSeviceImpl implements IUserSevice {
	@Resource
	private IUserDao userDao;
	/** 
	 * <p>Title: findAllUser</p>  
	 * <p>Description: </p>
	 * @return 
	 * @see com.DEC.service.IUserSevice#findAllUser()
	 */
	public List<User> findAllUser() {
		return userDao.findAllUser();
	}

	/** 
	 * <p>Title: findUserByUid</p>  
	 * <p>Description: </p>
	 * @param uid
	 * @return 
	 * @see com.DEC.service.IUserSevice#findUserByUid(int)
	 */
	public User findUserByUid(int uid) {
		return userDao.findUserByUid(uid);
	}

	/** 
	 * <p>Title: addUser</p>  
	 * <p>Description: </p>
	 * @param u
	 * @return 
	 * @see com.DEC.service.IUserSevice#addUser(com.DEC.entity.User)
	 */
	public boolean addUser(User u) {
		return (userDao.addUser(u) > 0) ? true : false;
	}

	/** 
	 * <p>Title: editUser</p>  
	 * <p>Description: </p>
	 * @param u
	 * @return 
	 * @see com.DEC.service.IUserSevice#editUser(com.DEC.entity.User)
	 */
	public boolean editUser(User u) {
		return (userDao.editUser(u) > 0) ? true : false;
	}

	/** 
	 * <p>Title: delUser</p>  
	 * <p>Description: </p>
	 * @param uid
	 * @return 
	 * @see com.DEC.service.IUserSevice#delUser(int)
	 */
	public boolean delUser(int uid) {
		return (userDao.delUser(uid) > 0) ? true : false;
	}

}
