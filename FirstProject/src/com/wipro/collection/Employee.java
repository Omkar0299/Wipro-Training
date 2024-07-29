package com.wipro.collection;

public class Employee implements Comparable<Employee>  {

	private Integer employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}	
	
	public Integer getEmployeeId() {
		return employeeId;
	}

    public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		//return Integer.compare(this.getEmployeeId(), emp.getEmployeeId());
		//Employee emp = (Employee) o;
		//return this.getEmployeeName().compareTo(((Employee) o).getEmployeeName());
		return Integer.compare(this.getEmployeeId(), o.getEmployeeId());
		
	}
	

}
