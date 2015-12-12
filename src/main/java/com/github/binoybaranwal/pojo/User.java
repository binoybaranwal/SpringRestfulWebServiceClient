package com.github.binoybaranwal.pojo;

public class User {
	private int userId;
	private String firstName;
	private String lastName;
	private int age;
	private String dob;
	private int status;
	private UserAddress userAddress;
	
	public User(){
		
	}
	
	public User(int userId, String firstName, String lastName, int age, String dob, int status, UserAddress userAddress){
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.status = status;
		this.userAddress = userAddress;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public UserAddress getUserAddress() {
		return userAddress;
	}
	
	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", dob=" + dob
				+ ", status=" + status + ", userAddress=" + userAddress + "]";
	}
	
}
