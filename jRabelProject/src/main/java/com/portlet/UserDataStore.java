package com.portlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDataStore {
	Connection conn = null;
	Statement stmt = null;
   public void insertUser(UserPojo userPojo) throws SQLException {
		int i = 0;
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		String table = "CREATE TABLE IF NOT EXISTS user(UserId int(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,firstName varchar(250),lastName varchar(250),email varchar(50),address varchar(200),gender varchar(10),phoneNo varchar(15))";
		System.out.println(table);
		if (i == 0) {
			i = stmt.executeUpdate(table);
			System.out.println("Create table Query executed SucessFully");
		}
		String firstName = userPojo.getFirstName();
		String lastName = userPojo.getLastName();
		String email = userPojo.getEmail();
		String address = userPojo.getAddress();
		String gender = userPojo.getGender();
		String phoneNo = userPojo.getPhoneNo();
		String insert_query = "INSERT INTO User(firstName,lastName,email,address,gender,phoneNo) VALUES('"
				+ firstName
				+ "','"
				+ lastName
				+ "','"
				+ email
				+ "','"
				+ address + "','" + gender + "','" + phoneNo + "')";
		stmt.executeUpdate(insert_query);
		stmt.close();
		conn.close();
	}
    public UserPojo getUser(String userId) throws SQLException {
		Statement stmt = null;
		ResultSet resultSet = null;
		Connection conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		int uId = Integer.parseInt(userId);
		System.out.println("uid" + uId);
		String sqlquery = "select * from user where UserId=" + uId;
		resultSet = stmt.executeQuery(sqlquery);
		resultSet.next();
		UserPojo userPojo = new UserPojo();
		userPojo.setUserId(resultSet.getString("UserId"));
		userPojo.setFirstName(resultSet.getString("firstName"));
		userPojo.setLastName(resultSet.getString("lastName"));
		userPojo.setGender(resultSet.getString("gender"));
		userPojo.setPhoneNo(resultSet.getString("phoneNo"));
		userPojo.setAddress(resultSet.getString("address"));
		userPojo.setEmail(resultSet.getString("email"));
		resultSet.close();
		stmt.close();
		conn.close();
		return userPojo;
  }
  public void updateUser(UserPojo userPojo) throws SQLException {
		int i = 0;
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		String userId = userPojo.getUserId();
		String firstName = userPojo.getFirstName();
		String lastName = userPojo.getLastName();
		String email = userPojo.getEmail();
		String address = userPojo.getAddress();
		String gender = userPojo.getGender();
		String phoneNo = userPojo.getPhoneNo();
		int uId = Integer.parseInt(userId);
		String update_query = "UPDATE User SET firstName='" + firstName
				+ "',lastName='" + lastName + "',email='" + email
				+ "',address='" + address + "',gender='" + gender
				+ "',phoneNo='" + phoneNo + "'where UserId=" + uId;
		stmt.executeUpdate(update_query);
		stmt.close();
		conn.close();
	}

	public void deleteUser(String userId) throws SQLException {
	    int i = 0;
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		int uId = Integer.parseInt(userId);
        String delete_query = "DELETE FROM User WHERE UserId="+uId;
		i = stmt.executeUpdate(delete_query);
		stmt.close();
		conn.close();
	}
}
