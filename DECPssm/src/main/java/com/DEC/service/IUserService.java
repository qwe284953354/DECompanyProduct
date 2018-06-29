package com.DEC.service;

import java.util.List;

import com.DEC.entity.User;

/**
 * <p>Description: UserService接口类</p>
 * @author UY
 * @date   2018年6月22日 
 *
 */
public interface IUserService {
	
	public List<User> findAllUser();		//查找所有
	public List<User> findAllNormalUser();	//查找所有普通用户
	public User findUserByUid(int uid);		//通过用户编号查找
	public boolean addUser(User u);			//添加
	public boolean editUser(User u);		//修改
	public boolean delUser(int uid);		//删除
	
}
