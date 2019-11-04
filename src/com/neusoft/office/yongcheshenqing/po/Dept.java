package com.neusoft.office.yongcheshenqing.po;

public class Dept{
	private String dname;
	public String getDname() {
		return dname;
	}
	@Override
	public String toString() {
		return "Dept [dname=" + dname + ", dno=" + dno + "]";
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	private int dno;

}
