package com.pojo;

public class Students {
	private String name;
	private int regNum;
	private String email;
	private String dept;
	private String passcode;
	
	public Students(int regNum,String passcode) {
		this.regNum=regNum;
		this.passcode=passcode;
	}
	
	public Students(String name,int regNum,String email,String dept,String passcode) {
		this.name=name;
		this.regNum=regNum;
		this.email=email;
		this.dept=dept;
		this.passcode=passcode;
	}
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getregNum() {
		return regNum;
	}
	public void setregNum(int regNum) {
		this.regNum=regNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode=passcode;
	}
	public String toString() {
		return name+ "," +regNum+","+email+", "+dept+","+passcode+",";
	}
	/*
	public String toString() {
		return "Student Details:\n 1.Name  : " +name+ "\n 2.Register Number: " +regNum+"\n 3.Email Id: "+email+"\n 4.Department: "+dept;
	}*/
}
