package com.wipro.collection;

public class Studentt {

	public Studentt(int id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	private int id;
	private String name;
	private char grade;
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
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
}
