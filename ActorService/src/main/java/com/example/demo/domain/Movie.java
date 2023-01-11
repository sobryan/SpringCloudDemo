package com.example.demo.domain;

public class Movie {

	String name;
	String instance;
	
	public Movie() {
		
	}
	
	public Movie(String name) {
		this.name = name;
	}

	public Movie(String name, String instance) {
		this.instance = instance;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}
	
	
}
