package com.portlet;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	static Connection conn = null;
	static String url = "jdbc:mysql://localhost:3306/";
	static String dbName = "exo_platform_idm";
	static String driver = "com.mysql.jdbc.Driver";
	static String userName = "root"; 
	static String password = "root";
	public static Connection getConnection(){
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url+dbName,userName,password);
			System.out.println("Connected to the database");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
}
