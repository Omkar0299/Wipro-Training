
public class EncClass
{
private int employeeId;
private String employeeName;

public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	if(employeeId>0 && employeeId<100) {
	this.employeeId = employeeId;
}
	else {
		System.out.println("Id should be in between 1 to 100");
	}
	}
public String getEmployeeName() {

	return employeeName;
}
public void setEmployeeName(String employeeName) {
	if(employeeName!=null && !employeeName.trim().isEmpty()) {
	this.employeeName = employeeName;
}
	else {
		System.out.println("Invalid Name");
	}}

public static void main(String[] str) {
	EncClass en = new EncClass();
	en.setEmployeeId(120);
	en.setEmployeeName("Omkar");
	
	System.out.println("Id is:" + en.getEmployeeId());
	System.out.println("Name is:" + en.getEmployeeName());
	
}


}
