package com.wipro.collection;

import java.util.TreeSet;

public class EmployeeClass {

	public static void main(String[] args) {
		
		TreeSet<Employee> t = new TreeSet<Employee>(new EmployeeIdComparator());
		
		Employee emp1 = new Employee(10,"Ram");
		Employee emp2 = new Employee(20,"Sham");
		Employee emp3 = new Employee(30,"Rahul");
		Employee emp4 = new Employee(100,"Ankit");
		t.add(emp1);
		t.add(emp2);
		t.add(emp3);
		t.add(emp4);
		
		for(Employee o:t ) {
			
			System.out.println(o);
		}
	}
	

	

}
