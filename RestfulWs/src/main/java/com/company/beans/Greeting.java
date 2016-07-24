package com.company.beans;

public class Greeting {
	
	private long id;
	private String name;
	
	
	public Greeting(long id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("id: %l, name: %s", this.id, this.name);
	}

}
