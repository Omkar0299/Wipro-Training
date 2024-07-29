package com.wipro.collection;

public class Labour {

	public Labour(String name, int scours) {
		super();
		this.name = name;
		this.scours = scours;
	}
	private String name;
	private int scours;
	public static void main(String[] args) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScours() {
		return scours;
	}
	public void setScours(int scours) {
		this.scours = scours;
	}

}
