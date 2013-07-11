package com.portlet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class UserDataStore {
	Connection conn = null;
	Statement stmt = null;
	
	public void insert(UserPojo userPojo) throws SQLException{
		int i = 0;
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		String table ="CREATE TABLE IF NOT EXISTS user(UserId int(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,firstName varchar(250),lastName varchar(250))";
		System.out.println(table);
		if(i==0)
		{
			i=stmt.executeUpdate(table);
			System.out.println("Create table Query executed SucessFully");
		}
    	String firstName= userPojo.getFirstName();
    	String lastName=userPojo.getLastName();
    	String insert_query = "insert into User(firstName,lastName) values('"+firstName+"','"+lastName+"')";
    	stmt.executeUpdate(insert_query);
	}
}
