package com.neusoft.office.gongzuojihua.po;

public class All extends Emp{
	private String dname;
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
	private String shenhe;
	private String zhuangtai;
	private String shangbao;
	private String idea;
	private int flag;
	private int to;
	private String time;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String getShangbao() {
		return shangbao;
	}
	public void setShangbao(String shangbao) {
		this.shangbao = shangbao;
	}

	private int fabu;
	private int only;
	@Override
	public String toString() {
		return "All [dname=" + dname + ", Subordinate=" + Subordinate + ", title=" + title + ", sponsor=" + sponsor
				+ ", plan=" + plan + ", endtime=" + endtime + ", starttime=" + starttime + ", pname=" + pname
				+ ", rank=" + rank + ", help=" + help + ", pingjia=" + pingjia + ", shenhe=" + shenhe + ", zhuangtai="
				+ zhuangtai + ", shangbao=" + shangbao + ", idea=" + idea + ", flag=" + flag + ", to=" + to + ", time="
				+ time + ", fabu=" + fabu + ", only=" + only + ", pingfen=" + pingfen + "]";
	}
	public int getOnly() {
		return only;
	}
	public void setOnly(int only) {
		this.only = only;
	}
	public String getShenhe() {
		return shenhe;
	}
	public void setShenhe(String shenhe) {
		this.shenhe = shenhe;
	}
	public String getZhuangtai() {
		return zhuangtai;
	}
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}

	
	public int getFabu() {
		return fabu;
	}
	public void setFabu(int fabu) {
		this.fabu = fabu;
	}

	private int pingfen;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
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

}
