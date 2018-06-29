package com.DEC.entity;
/**
 * <p>Description: 酒店实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class Hotel {
	private int hid;			//酒店编号
	private String hname;		//酒店名称
	private String hstar;		//星级
	private String htype;		//类型
	private String himg;		//酒店图片
	private String haddress;	//地址
	private String hmark;		//评分
	private int cid;			//城市编号
	
	private HotelRoom hotelRoom;
	
	public Hotel() {
		super();
	}
	public Hotel(int hid, String hname, String hstar, String htype, String himg, String haddress, String hmark,
			int cid) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hstar = hstar;
		this.htype = htype;
		this.himg = himg;
		this.haddress = haddress;
		this.hmark = hmark;
		this.cid = cid;
	}
	public Hotel(String hname, String hstar, String htype, String himg, String haddress, String hmark, int cid) {
		super();
		this.hname = hname;
		this.hstar = hstar;
		this.htype = htype;
		this.himg = himg;
		this.haddress = haddress;
		this.hmark = hmark;
		this.cid = cid;
	}
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHstar() {
		return hstar;
	}
	public void setHstar(String hstar) {
		this.hstar = hstar;
	}
	public String getHtype() {
		return htype;
	}
	public void setHtype(String htype) {
		this.htype = htype;
	}
	public String getHimg() {
		return himg;
	}
	public void setHimg(String himg) {
		this.himg = himg;
	}
	public String getHaddress() {
		return haddress;
	}
	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}
	public String getHmark() {
		return hmark;
	}
	public void setHmark(String hmark) {
		this.hmark = hmark;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public HotelRoom getHotelRoom() {
		return hotelRoom;
	}
	public void setHotelRoom(HotelRoom hotelRoom) {
		this.hotelRoom = hotelRoom;
	}
	
}
