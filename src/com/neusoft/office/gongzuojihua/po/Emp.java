package com.neusoft.office.gongzuojihua.po;

public class Emp {
	private int id;
	private String name;
	private int dno;
	private int quanli;
	private String grade;
	private	String mgr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getQuanli() {
		return quanli;
	}
	public void setQuanli(int quanli) {
		this.quanli = quanli;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + ", dno=" + dno + ", quanli=" + quanli + ", grade=" + grade
				+ ", mgr=" + mgr + "]";
	}	

}
