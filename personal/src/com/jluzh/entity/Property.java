package com.jluzh.entity;

public class Property {
	private String uid;
	private String pid;
	private double income;
	private double remain;
	public String getUid() {
		return uid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getRemain() {
		return remain;
	}

	public void setRemain(double remain) {
		this.remain = remain;
	}

}
