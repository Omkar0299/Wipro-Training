package com.wipro.collection;

import java.util.TreeSet;

public class StudentClass {

	public static void main(String[] args) {
		
		 TreeSet<Student> t= new TreeSet<Student>(new StudentIdComparator());
		 
		 Student stud1 = new Student(1,"Omkar");
		 Student stud2 = new Student(2,"Shubham");
		 Student stud3 = new Student(5,"Uttam");
		 Student stud4 = new Student(3,"Raju");
		 Student stud5 = new Student(6,"Aaditya");
		 t.add(stud1);
		 t.add(stud2);
		 t.add(stud3);
		 t.add(stud4);
		 t.add(stud5);
		 
		 for(Student o: t) {
			 System.out.println(o);
		 }

	}

}
