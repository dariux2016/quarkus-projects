package com.dariux2016.crud.model;

public class Item {
	
	public Item(Long id, String name, String count, String status) {
		this.id = id;
		this.name = name;
		this.count = count;
		this.status = status;
	}

	private Long id;
	private String name;
	private String count;
	private String status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
