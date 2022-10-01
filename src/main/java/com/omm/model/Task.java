package com.omm.model;

public class Task {
	
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", brief=" + brief + ", details=" + details + "]";
	}
	private int id;
	private String brief;
	private String details;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	

}
