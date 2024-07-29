package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test6 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		
		Statement st=con.createStatement();
		
		st.addBatch("insert into Employee values(155,'Raj')");
		st.addBatch("update Employee set empname='Rajesj' where empid=102");
		st.addBatch("delete from Employee where empid=155");
		
		int x[]=st.executeBatch();
		
		System.out.println(x[0] + "row(s) inserted");
		System.out.println(x[1] + "row(s) updated");
		System.out.println(x[2] + "row(s) deleted");
		
		con.close();
		
		
	}
}
