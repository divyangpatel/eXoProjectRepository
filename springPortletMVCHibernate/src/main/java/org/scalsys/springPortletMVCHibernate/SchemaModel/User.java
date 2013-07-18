package org.scalsys.springPortletMVCHibernate.SchemaModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId")
	private Integer userId;
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName ;
	
	@Column(name ="email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phoneNo")
	private String phoneNo;

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public User(){
		
	}
	public User(Integer userId , String firstName , String lastName,String email,String address,String phoneNo){
		this.userId = userId;
		this.firstName =firstName;
		this.lastName =lastName;
		this.email =email;
		this.address =address;
		this.phoneNo =phoneNo;
	}
	public User(User user){
		this.userId = user.getUserId();
		this.firstName =user.getFirstName();
		this.lastName =user.getLastName();
		this.email =user.getEmail();
		this.address =user.getAddress();
		this.phoneNo =user.getPhoneNo();
	}
	@Override
	public String toString() {
		String userInfo ="----------------------------------------\n User Id : " + getUserId() + "\n firstName : " + getFirstName() +" \n LastName : " + getLastName();
		return userInfo;
	}
	
		
}
