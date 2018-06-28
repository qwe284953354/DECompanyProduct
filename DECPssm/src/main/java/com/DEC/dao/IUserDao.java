package com.DEC.dao;

import java.util.List;

import com.DEC.entity.User;

/**
 * <p>Description: UserDao接口类</p>
 * @author UY
 * @date   2018年6月21日 
 *
 */
public interface IUserDao {
	
	public List<User> findAllUser();		//查找所有
	public List<User> findAllNormalUser();	//查找所有普通用户
	public User findUserByUname(String uname);
	public User findUserByUid(int uid);		//通过用户编号查找
	public int addUser(User u);				//添加
	public int editUser(User u);			//修改
	public int delUser(int uid);			//删除
>>>>>>> 36683be9957bd500bc99514258261a50817372b5
	
}
