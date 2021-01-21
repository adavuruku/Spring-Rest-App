package com.luv2code.springdemo.entity;

public class Student {
	private String firtName;
	private String lastName;
	private String emailAdd;
	
	
	public Student() {
	}


	public Student(String firtName, String lastName, String emailAdd) {
		this.firtName = firtName;
		this.lastName = lastName;
		this.emailAdd = emailAdd;
	}


	public String getFirtName() {
		return firtName;
	}


	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailAdd() {
		return emailAdd;
	}


	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	
	
	
	
}
