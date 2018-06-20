package com.DEC.entity;
/**
 * <p>Description: 旅游景点实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class TravelScenic {
	private int tsid;			//景点编号
	private int cid;			//城市编号
	private String tsname;		//名称
	private String tsaddress;	//地址
	private String tsimg;		//景点图片
	private String tsdetail;	//景点简介
	
	public TravelScenic() {
		super();
	}
	public TravelScenic(int tsid, int cid, String tsname, String tsaddress, String tsimg, String tsdetail) {
		super();
		this.tsid = tsid;
		this.cid = cid;
		this.tsname = tsname;
		this.tsaddress = tsaddress;
		this.tsimg = tsimg;
		this.tsdetail = tsdetail;
	}
	public TravelScenic(int cid, String tsname, String tsaddress, String tsimg, String tsdetail) {
		super();
		this.cid = cid;
		this.tsname = tsname;
		this.tsaddress = tsaddress;
		this.tsimg = tsimg;
		this.tsdetail = tsdetail;
	}
	
	public int getTsid() {
		return tsid;
	}
	public void setTsid(int tsid) {
		this.tsid = tsid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getTsname() {
		return tsname;
	}
	public void setTsname(String tsname) {
		this.tsname = tsname;
	}
	public String getTsaddress() {
		return tsaddress;
	}
	public void setTsaddress(String tsaddress) {
		this.tsaddress = tsaddress;
	}
	public String getTsimg() {
		return tsimg;
	}
	public void setTsimg(String tsimg) {
		this.tsimg = tsimg;
	}
	public String getTsdetail() {
		return tsdetail;
	}
	public void setTsdetail(String tsdetail) {
		this.tsdetail = tsdetail;
	}
}
