package com.neusoft.office.managersys.po;

public class function {
	private String fid;
	private String fname;
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "function [fid=" + fid + ", fname=" + fname + "]";
	}
}
