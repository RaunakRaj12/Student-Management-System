package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;
	public static Connection createc() {
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// create the connections 
			String user = "root";
			String password = "root12345";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			
			con= DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
