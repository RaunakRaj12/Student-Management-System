package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st) {
		
		boolean f = false;
		// JDBC code here
		try {
			Connection con= CP.createc();
			String q="insert into students(sname,sphone,scity) values(?,?,?) ";
			// prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
			// set the values of a  parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3,st.getStudentPhone());
			
			// execute 
			pstmt.executeUpdate();
			f= true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
	}

}
