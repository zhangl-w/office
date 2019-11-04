package com.neusoft.office.managersys.po;

public class uc {
	private String userchar;
	private String dept;
	private int charid;
	public String getUserchar() {
		return userchar;
	}
	public void setUserchar(String userchar) {
		this.userchar = userchar;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getCharid() {
		return charid;
	}
	public void setCharid(int charid) {
		this.charid = charid;
	}
	@Override
	public String toString() {
		return "uc [userchar=" + userchar + ", dept=" + dept + ", charid=" + charid + "]";
	}
	
}
