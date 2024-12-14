package com.api.data;

public class UserPojo {
	
	String id;
	String fname;
	String lname;
	String email;
    String age;
	String gender;
	String status;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return fname;
	}
	public void setName(String name) {
		this.fname = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "USerPojo [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + ", status=" + status + "]";
	}
	
	 
	
}
