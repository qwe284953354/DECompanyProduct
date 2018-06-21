package com.DEC.dao;

import java.util.List;

import com.DEC.entity.User;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IUserDao {
	
	public List<User> findAllUser();
	public User findUserByUid(int uid);
	public int addUser(User u);
	public int editUser(User u);
	public int delUser(int uid);
}
