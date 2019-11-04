package com.neusoft.office.gongzuojihua.po;

public class epdvo extends Emp{
	private String dname;
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
	private int dno;
	private int id1;
	private int rank;
	private int fabu;
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
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
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	public int getFabu() {
		return fabu;
	}
	public void setFabu(int fabu) {
		this.fabu = fabu;
	}
	@Override
	public String toString() {
		return "epdvo [dname=" + dname + ", pingfen=" + pingfen + ", flag=" + flag + ", starttime=" + starttime
				+ ", endtime=" + endtime + ", plan=" + plan + ", pname=" + pname + ", sponsor=" + sponsor + ", title="
				+ title + ", Subordinate=" + Subordinate + ", date=" + date + ", dno=" + dno + ", id1=" + id1
				+ ", rank=" + rank + ", fabu=" + fabu + "]";
	}
	


}
