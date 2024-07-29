package com.wipro.collection;
import java.util.Comparator;


public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		/*Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;*/
		
		return o2.getEmployeeId().compareTo(o1.getEmployeeId());
		//return Integer.compare((emp2.getEmployeeId()), emp1.getEmployeeId());
		
		/*if(emp1.getEmployeeId()>emp2.getEmployeeId()) {
			return -4;
		}else if(emp1.getEmployeeId()<emp2.getEmployeeId()) {
			return 4;
			
		}else {
			return 0;
		}*/
		
		
	}
	

}
