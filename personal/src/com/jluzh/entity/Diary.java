package com.jluzh.entity;

public class Diary {
	private String diaid;
	private String uid;
	private String time;
	private String location;
	private String accident;
	private String people;
	public String getDiaid() {
		return diaid;
	}

	public void setDiaid(String diaid) {
		this.diaid = diaid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAccident() {
		return accident;
	}

	public void setAccident(String accident) {
		this.accident = accident;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

}
