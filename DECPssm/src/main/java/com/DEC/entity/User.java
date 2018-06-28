package com.DEC.entity;

import java.util.List;

/**
 * <p>Description: 用户实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class User {
	private int uid;			//用户编号
	private String uname;		//用户名
	private String upwd;		//密码
	private String umail;		//邮箱
	private String utel;		//电话
	private String ubirth;		//生日
	private int utype;			//用户类型(0管理员/1普通用户)
	
	private List<TravelOrder> travelOrderlist;  //使用resultMap获取  用户订单
	private List<HotelOrder> hotelOrderlist;
	
	public User() {
		super();
	}
	public User(int uid, String uname, String upwd, String umail, String utel, String ubirth, int utype) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.umail = umail;
		this.utel = utel;
		this.ubirth = ubirth;
	}
	public User(String uname, String upwd, String umail, String utel, String ubirth, int utype) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.umail = umail;
		this.utel = utel;
		this.ubirth = ubirth;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public String getUtel() {
		return utel;
	}
	public void setUtel(String utel) {
		this.utel = utel;
	}
	public String getUbirth() {
		return ubirth;
	}
	public void setUbirth(String ubirth) {
		this.ubirth = ubirth;
	}
	public int getUtype() {
		return utype;
	}
	public void setUtype(int utype) {
		this.utype = utype;
	}
	public List<TravelOrder> getTravelOrderlist() {
		return travelOrderlist;
	}
	public void setTravelOrderlist(List<TravelOrder> travelOrderlist) {
		this.travelOrderlist = travelOrderlist;
	}
	public List<HotelOrder> getHotelOrderlist() {
		return hotelOrderlist;
	}
	public void setHotelOrderlist(List<HotelOrder> hotelOrderlist) {
		this.hotelOrderlist = hotelOrderlist;
	}
	
	
}
