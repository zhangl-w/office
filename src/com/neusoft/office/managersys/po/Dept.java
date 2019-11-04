package com.neusoft.office.managersys.po;

public class Dept {
	private int dno;
	private String dname;
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [dno=" + dno + ", dname=" + dname + "]";
	}
}
