package com.neusoft.office.kq.po;

import java.io.Serializable;
import java.sql.Date;

public class QjUser  implements Serializable{
	private int id ;
	private String kaishi;//sqlÏÂµÄdate
	private String jieshu;
	private String leixing;
	private String tname;
	private String  zhuangtai;
	private String  startindex;
	private String  pagesize;
	private String  yuanyin;
	public String getYuanyin() {
		return yuanyin;
	}
	public void setYuanyin(String yuanyin) {
		this.yuanyin = yuanyin;
	}
	public String getStartindex() {
		return startindex;
	}
	public void setStartindex(String startindex) {
		this.startindex = startindex;
	}
	public String getpagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKaishi() {
		return kaishi;
	}
	public void setKaishi(String kaishi) {
		this.kaishi = kaishi;
	}
	public String getJieshu() {
		return jieshu;
	}
	public void setJieshu(String jieshu) {
		this.jieshu = jieshu;
	}
	public String getLeixing() {
		return leixing;
	}
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getZhuangtai() {
		return zhuangtai;
	}
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	@Override
	public String toString() {
		return "QjUser [id=" + id + ", kaishi=" + kaishi + ", jieshu=" + jieshu + ", leixing=" + leixing + ", tname="
				+ tname + ", zhuangtai=" + zhuangtai + ", startindex=" + startindex + ", pagesize=" + pagesize
				+ ", yuanyin=" + yuanyin + "]";
	}
	
	
	

}
