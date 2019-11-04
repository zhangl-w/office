package com.neusoft.office.gongzuojihua.po;



public class Plan {
	private String Subordinate;
	private String title;
	private String sponsor;
	private String plan;
	private String endtime;
	private String starttime;
	private String pname;
	private int rank;
	private String help;
	private String pingjia;
	private int pingfen;
	private String flag;
	private String Resources;
	private int only;
	public String getResources() {
		return Resources;
	}

	public void setResources(String resources) {
		Resources = resources;
	}

	public String getSubordinate() {
		return Subordinate;
	}

	public void setSubordinate(String subordinate) {
		Subordinate = subordinate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getPingjia() {
		return pingjia;
	}

	public void setPingjia(String pingjia) {
		this.pingjia = pingjia;
	}

	public int getPingfen() {
		return pingfen;
	}

	public void setPingfen(int pingfen) {
		this.pingfen = pingfen;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	

	public int getOnly() {
		return only;
	}

	public void setOnly(int only) {
		this.only = only;
	}

	@Override
	public String toString() {
		return "Plan [Subordinate=" + Subordinate + ", title=" + title + ", sponsor=" + sponsor + ", plan=" + plan
				+ ", endtime=" + endtime + ", starttime=" + starttime + ", pname=" + pname + ", rank=" + rank
				+ ", help=" + help + ", pingjia=" + pingjia + ", pingfen=" + pingfen + ", flag=" + flag + ", Resources="
				+ Resources + "]";
	}
	

}
