package com.wipro.collection;

public class StudentMap {
	
public StudentMap(int id, String name) {
		this.id = id;
		this.name = name;
	}
private int id;
private String name;

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
public String toString() {
	return "Student[studentId="+ id+ ",studentName=" +name+"]";
}
}
