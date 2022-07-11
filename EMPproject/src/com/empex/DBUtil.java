package com.empex;

import java.sql.*;



public class DBUtil {

	static final String driver = "";
	static final String url = "";
	
	public static Connection getConnection() throws Exception{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "soctt", "tiger");
		return con;
		
	}
	
	
}
