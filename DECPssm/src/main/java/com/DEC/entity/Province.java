package com.DEC.entity;
/**
 * <p>Description: 省实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class Province {
	private int pid;		//省编号
	private String pname;	//省名称
	
	public Province() {
		super();
	}
	public Province(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Province(String pname) {
		super();
		this.pname = pname;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
}
