package com.DEC.entity;
/**
 * <p>Description: 旅游项目实体类</p>
 * @author UY
 * @date   2018年6月20日 
 *
 */
public class Travel {
	private int tid;			//旅游项目编号
	private int cid;			//城市编号
	private int tprice;			//价格
	private int ttid;			//类型编号
	private int tsid;			//景点编号
	private String tname;		//名称
	private String tdate;		//旅游项目日期
	private String tdetail;		//旅游项目简介
	
	private City city;
	private TravelScenic travelScenic;
	private TravelType travelType;
	
	public Travel() {
		super();
	}
	public Travel(int tid, int cid, int tprice, int ttid, int tsid, String tname, String tdate, String tdetail) {
		super();
		this.tid = tid;
		this.cid = cid;
		this.tprice = tprice;
		this.ttid = ttid;
		this.tsid = tsid;
		this.tname = tname;
		this.tdate = tdate;
		this.tdetail = tdetail;
	}
	public Travel(int cid, int tprice, int ttid, int tsid, String tname, String tdate, String tdetail) {
		super();
		this.cid = cid;
		this.tprice = tprice;
		this.ttid = ttid;
		this.tsid = tsid;
		this.tname = tname;
		this.tdate = tdate;
		this.tdetail = tdetail;
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getTprice() {
		return tprice;
	}
	public void setTprice(int tprice) {
		this.tprice = tprice;
	}
	public int getTtid() {
		return ttid;
	}
	public void setTtid(int ttid) {
		this.ttid = ttid;
	}
	public int getTsid() {
		return tsid;
	}
	public void setTsid(int tsid) {
		this.tsid = tsid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getTdetail() {
		return tdetail;
	}
	public void setTdetail(String tdetail) {
		this.tdetail = tdetail;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public TravelScenic getTravelScenic() {
		return travelScenic;
	}
	public void setTravelScenic(TravelScenic travelScenic) {
		this.travelScenic = travelScenic;
	}
	public TravelType getTravelType() {
		return travelType;
	}
	public void setTravelType(TravelType travelType) {
		this.travelType = travelType;
	}
	
}
