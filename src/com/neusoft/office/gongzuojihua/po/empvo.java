package com.neusoft.office.gongzuojihua.po;

public class empvo extends Emp {
	private String pingfen;
	private String flag;
	private String starttime;
	private String endtime;
	private String plan;
	private String pname;
	private String sponsor;
	private String title;
	private String Subordinate;
	private String date;
	private int only;	
	private String dname;
	private String Resources;
	public String getResources() {
		return Resources;
	}
	public void setResources(String resources) {
		Resources = resources;
	}
	public String getPingfen() {
		return pingfen;
	}


	public void setPingfen(String pingfen) {
		this.pingfen = pingfen;
	}


	public String getFlag() {
		return flag;
	}


	public void setFlag(String flag) {
		this.flag = flag;
	}


	public String getStarttime() {
		return starttime;
	}


	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}


	public String getEndtime() {
		return endtime;
	}


	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}


	public String getPlan() {
		return plan;
	}


	public void setPlan(String plan) {
		this.plan = plan;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getSponsor() {
		return sponsor;
	}


	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSubordinate() {
		return Subordinate;
	}


	public void setSubordinate(String subordinate) {
		Subordinate = subordinate;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	public int getOnly() {
		return only;
	}


	public void setOnly(int only) {
		this.only = only;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	@Override
	public String toString() {
		return "empvo [pingfen=" + pingfen + ", flag=" + flag + ", starttime=" + starttime + ", endtime=" + endtime
				+ ", plan=" + plan + ", pname=" + pname + ", sponsor=" + sponsor + ", title=" + title + ", Subordinate="
				+ Subordinate + ", date=" + date + ", only=" + only + ", dname=" + dname + "]";
	}






}
