package com.DEC.entity;
/**
 * <p>Description: 用户实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class User {
	private int uid;
	private String uname;
	private String upwd;
	private String umail;
	private String utel;
	private String ubirth;
	
	public User() {
		super();
	}
	public User(int uid, String uname, String upwd, String umail, String utel, String ubirth) {
		super();
		this.uid = uid;
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
}
