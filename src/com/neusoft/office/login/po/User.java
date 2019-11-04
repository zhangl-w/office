package com.neusoft.office.login.po;



public class User {
	private String username;
	private String truename;
	private int id;
	private String password;
	private String userchar;
	private String dname;
	private int dno;
	private int charid;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserchar() {
		return userchar;
	}
	public void setUserchar(String userchar) {
		this.userchar = userchar;
	}
	public String getDname() {
		return dname;
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
	public int getCharid() {
		return charid;
	}
	public void setCharid(int charid) {
		this.charid = charid;
	}
	@Override
	public String toString() {
		return "user [username=" + username + ", truename=" + truename + ", id=" + id + ", password=" + password
				+ ", userchar=" + userchar + ", dname=" + dname + ", dno=" + dno + ", charid=" + charid + "]";
	}
	
	
}

