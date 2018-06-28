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
	public List<User> findAllNormalUser();
	public User findUserByUid(int uid);
	public User findUserByUname(String uname);
	public int addUser(User u);
	public int editUser(User u);
	public int delUser(int uid);

	
}
