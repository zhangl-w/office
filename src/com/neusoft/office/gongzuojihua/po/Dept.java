package com.neusoft.office.gongzuojihua.po;

public class Dept {
	private String dname;
	private int dno;
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
	

}
