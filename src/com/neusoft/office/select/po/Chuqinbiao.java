package com.neusoft.office.select.po;

import java.io.Serializable;

public class Chuqinbiao implements Serializable{
	private String chuqinshijian;
	private String xiabanshijian;
	private String username;
	private int leixing;
	public String getChuqinshijian() {
		return chuqinshijian;
	}
	public void setChuqinshijian(String chuqinshijian) {
		this.chuqinshijian = chuqinshijian;
	}
	public String getXiabanshijian() {
		return xiabanshijian;
	}
	public void setXiabanshijian(String xiabanshijian) {
		this.xiabanshijian = xiabanshijian;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getLeixing() {
		return leixing;
	}
	public void setLeixing(int leixing) {
		this.leixing = leixing;
	}

}
