package com.wipro.collection;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		/*Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;*/
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}

}
