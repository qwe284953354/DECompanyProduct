package com.DEC.entity;
/**
 * <p>Description: 旅游订单实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class TravelOrder {
	private int toid;		//旅游订单编号
	private int tid;		//旅游项目编号
	private int uid;		//用户编号
	private String todate; 	//订单时间
	private int toprice;	//价格
	private User orderUser;
	private Travel orderTravel;
	
	public TravelOrder() {
		super();
	}
	public TravelOrder(int toid, int tid, int uid, String todate, int toprice) {
		super();
		this.toid = toid;
		this.tid = tid;
		this.uid = uid;
		this.todate = todate;
		this.toprice = toprice;
	}
	public TravelOrder(int tid, int uid, String todate, int toprice) {
		super();
		this.tid = tid;
		this.uid = uid;
		this.todate = todate;
		this.toprice = toprice;
	}
	public int getToid() {
		return toid;
	}
	public void setToid(int toid) {
		this.toid = toid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public int getToprice() {
		return toprice;
	}
	public void setToprice(int toprice) {
		this.toprice = toprice;
	}
	public User getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(User orderUser) {
		this.orderUser = orderUser;
	}
	public Travel getOrderTravel() {
		return orderTravel;
	}
	public void setOrderTravel(Travel orderTravel) {
		this.orderTravel = orderTravel;
	}
	
}
