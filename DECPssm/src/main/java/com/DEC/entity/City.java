package com.DEC.entity;
/**
 * <p>Description: 城市实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class City {
	private int cid;		//城市编号
	private int pid;		//省编号
	private String cname;	//城市名称
	
	public City() {
		super();
	}
	public City(int cid, int pid, String cname) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.cname = cname;
	}
	public City(int pid, String cname) {
		super();
		this.pid = pid;
		this.cname = cname;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}
