package com.neusoft.office.managersys.po;

public class power {
	private String powerid;
	private String powername;
	public String getPowerid() {
		return powerid;
	}
	public void setPowerid(String powerid) {
		this.powerid = powerid;
	}
	public String getPowername() {
		return powername;
	}
	public void setPowername(String powername) {
		this.powername = powername;
	}
	@Override
	public String toString() {
		return "power [powerid=" + powerid + ", powername=" + powername + "]";
	}
	
}
