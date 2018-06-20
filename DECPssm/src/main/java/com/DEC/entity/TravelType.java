package com.DEC.entity;
/**
 * <p>Description: 旅游类型实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class TravelType {
	private int ttid;		//类型编号
	private String ttname;	//类型名称
	
	public TravelType() {
		super();
	}
	public TravelType(int ttid, String ttname) {
		super();
		this.ttid = ttid;
		this.ttname = ttname;
	}
	public TravelType(String ttname) {
		super();
		this.ttname = ttname;
	}
	
	public int getTtid() {
		return ttid;
	}
	public void setTtid(int ttid) {
		this.ttid = ttid;
	}
	public String getTtname() {
		return ttname;
	}
	public void setTtname(String ttname) {
		this.ttname = ttname;
	}
}
