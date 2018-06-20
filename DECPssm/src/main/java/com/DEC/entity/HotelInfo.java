package com.DEC.entity;
/**
 * <p>Description: 酒店信息实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class HotelInfo {
	private int hiid;			//信息编号
	private int hid;			//酒店编号
	private String htel;		//电话
	private String htime;		//创建日期
	private String hbrief;		//简介
	private String hpolicy;		//政策
	
	public HotelInfo() {
		super();
	}
	public HotelInfo(int hiid, int hid, String htel, String htime, String hbrief, String hpolicy) {
		super();
		this.hiid = hiid;
		this.hid = hid;
		this.htel = htel;
		this.htime = htime;
		this.hbrief = hbrief;
		this.hpolicy = hpolicy;
	}
	public HotelInfo(int hid, String htel, String htime, String hbrief, String hpolicy) {
		super();
		this.hid = hid;
		this.htel = htel;
		this.htime = htime;
		this.hbrief = hbrief;
		this.hpolicy = hpolicy;
	}
	
	public int getHiid() {
		return hiid;
	}
	public void setHiid(int hiid) {
		this.hiid = hiid;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHtel() {
		return htel;
	}
	public void setHtel(String htel) {
		this.htel = htel;
	}
	public String getHtime() {
		return htime;
	}
	public void setHtime(String htime) {
		this.htime = htime;
	}
	public String getHbrief() {
		return hbrief;
	}
	public void setHbrief(String hbrief) {
		this.hbrief = hbrief;
	}
	public String getHpolicy() {
		return hpolicy;
	}
	public void setHpolicy(String hpolicy) {
		this.hpolicy = hpolicy;
	}
}
