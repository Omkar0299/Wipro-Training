package com.wipro.collection;

import java.util.LinkedList;

public class GenericClass2 {

	public static void main(String[] args) {
		LinkedList<Student> stud = new LinkedList<Student>();
		Student s1= new Student(100,"om");
		Student s2= new Student(10,"Jack");
		Student s3= new Student(100,"Billa");
		
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		
		LinkedList<Employee> emp = new LinkedList<Employee>();
		Employee e1= new Employee(66,"Rakesh");
		Employee e2= new Employee(101,"Martahnd");
		Employee e3= new Employee(25,"Raghu");
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		if(!stud.isEmpty()) {
			for(Student st:stud) {
				System.out.println(st);
		}
		}
		if(!emp.isEmpty()) {
			for(Employee em:emp) {
				System.out.println(em);
		}
		
	}

}
}
