package com.neusoft.office.select.po;

import java.io.Serializable;

public class Bangong implements Serializable{
	private String gongzuomingcheng;
	private String kaishishijian;
	private String jieshushijian;
	private String keshi;
	private int xingji;
	private String username;
	public String getGongzuomingcheng() {
		return gongzuomingcheng;
	}
	public void setGongzuomingcheng(String gongzuomingcheng) {
		this.gongzuomingcheng = gongzuomingcheng;
	}
	public String getKaishishijian() {
		return kaishishijian;
	}
	public void setKaishishijian(String kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	public String getJieshushijian() {
		return jieshushijian;
	}
	public void setJieshushijian(String jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	public String getKeshi() {
		return keshi;
	}
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	public int getXingji() {
		return xingji;
	}
	public void setXingji(int xingji) {
		this.xingji = xingji;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Bangong [gongzuomingcheng=" + gongzuomingcheng + ", kaishishijian=" + kaishishijian + ", jieshushijian="
				+ jieshushijian + ", keshi=" + keshi + ", xingji=" + xingji + ", username=" + username + "]";
	}
	
	
}
