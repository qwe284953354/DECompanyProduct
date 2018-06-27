package com.DEC.entity;
/**
 * <p>Description: 酒店订单实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class HotelOrder {
	private int hoid;			//酒店订单编号
	private int hid;			//酒店编号
	private int hoprice;		//价格
	private int uid;			//用户编号
	private String honame;		//入住人姓名
	private String hodate;		//入住日期
	private String hotel;		//电话
	private String hobooktime;	//预定到店时间
	private User orderUser;
	private Hotel orderHotel;
	
	public HotelOrder() {
		super();
	}
	public HotelOrder(int hoid, int hid, int hoprice, int uid, String honame, String hodate, String hotel,
			String hobooktime) {
		super();
		this.hoid = hoid;
		this.hid = hid;
		this.hoprice = hoprice;
		this.uid = uid;
		this.honame = honame;
		this.hodate = hodate;
		this.hotel = hotel;
		this.hobooktime = hobooktime;
	}
	public HotelOrder(int hid, int hoprice, int uid, String honame, String hodate, String hotel, String hobooktime) {
		super();
		this.hid = hid;
		this.hoprice = hoprice;
		this.uid = uid;
		this.honame = honame;
		this.hodate = hodate;
		this.hotel = hotel;
		this.hobooktime = hobooktime;
	}
	
	public int getHoid() {
		return hoid;
	}
	public void setHoid(int hoid) {
		this.hoid = hoid;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getHoprice() {
		return hoprice;
	}
	public void setHoprice(int hoprice) {
		this.hoprice = hoprice;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getHoname() {
		return honame;
	}
	public void setHoname(String honame) {
		this.honame = honame;
	}
	public String getHodate() {
		return hodate;
	}
	public void setHodate(String hodate) {
		this.hodate = hodate;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getHobooktime() {
		return hobooktime;
	}
	public void setHobooktime(String hobooktime) {
		this.hobooktime = hobooktime;
	}
	public User getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(User orderUser) {
		this.orderUser = orderUser;
	}
	public Hotel getOrderHotel() {
		return orderHotel;
	}
	public void setOrderHotel(Hotel orderHotel) {
		this.orderHotel = orderHotel;
	}
	
}
