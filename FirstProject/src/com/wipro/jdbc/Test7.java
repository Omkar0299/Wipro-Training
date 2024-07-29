package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test7 {
	
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		
		Statement st =con.createStatement();
		
		st.addBatch("insert into student values(555,'Leo Das')");
		st.addBatch("update student set stname='Rolex' where stid=101");
		st.addBatch("delete from student where stid=103");
		
		int x[]=st.executeBatch();
		
		System.out.println(x[0]+"inserted");
		System.out.println(x[1]+"updated");
		System.out.println(x[2]+"deleted");
		
		con.close();
		
		
	}

}
