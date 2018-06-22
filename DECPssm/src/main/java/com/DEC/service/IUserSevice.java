package com.DEC.service;

import java.util.List;

import com.DEC.entity.User;

/**
 * <p>Description: </p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface IUserSevice {
	
	public List<User> findAllUser();
	public User findUserByUid(int uid);
	public boolean addUser(User u);
	public boolean editUser(User u);
	public boolean delUser(int uid);
}
