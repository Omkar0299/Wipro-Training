package com.wipro.collection;

public class Student implements Comparable<Student>{
	
	private Integer studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student[studentId="+ studentId+ ",studentName=" +studentName+"]";
	}
	@Override
	public int compareTo(Student o) {
		//return Integer.compare(this.getStudentId(), stud.getStudentId());
		//return this.getStudentName().compareTo(((Student) o).getStudentName());
		//Student std= (Student)o;
		return Integer.compare(this.getStudentId(), o.getStudentId());
		
	}
	

}
