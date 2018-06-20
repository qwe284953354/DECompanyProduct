package com.DEC.entity;
/**
 * <p>Description: 酒店房间实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class HotelRoom {
	private int hrid;		//房间编号
	private int hid;		//酒店编号
	private int hprice;		//价格
	private int hbed;		//床位信息
	private int hpeople;	//可住人数
	private String hrname;	//房间名称
	private String himg;	//房间图片
	
	public HotelRoom() {
		super();
	}
	public HotelRoom(int hrid, int hid, int hprice, int hbed, int hpeople, String hrname, String himg) {
		super();
		this.hrid = hrid;
		this.hid = hid;
		this.hprice = hprice;
		this.hbed = hbed;
		this.hpeople = hpeople;
		this.hrname = hrname;
		this.himg = himg;
	}
	public HotelRoom(int hid, int hprice, int hbed, int hpeople, String hrname, String himg) {
		super();
		this.hid = hid;
		this.hprice = hprice;
		this.hbed = hbed;
		this.hpeople = hpeople;
		this.hrname = hrname;
		this.himg = himg;
	}
	
	public int getHrid() {
		return hrid;
	}
	public void setHrid(int hrid) {
		this.hrid = hrid;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getHprice() {
		return hprice;
	}
	public void setHprice(int hprice) {
		this.hprice = hprice;
	}
	public int getHbed() {
		return hbed;
	}
	public void setHbed(int hbed) {
		this.hbed = hbed;
	}
	public int getHpeople() {
		return hpeople;
	}
	public void setHpeople(int hpeople) {
		this.hpeople = hpeople;
	}
	public String getHrname() {
		return hrname;
	}
	public void setHrname(String hrname) {
		this.hrname = hrname;
	}
	public String getHimg() {
		return himg;
	}
	public void setHimg(String himg) {
		this.himg = himg;
	}
}
