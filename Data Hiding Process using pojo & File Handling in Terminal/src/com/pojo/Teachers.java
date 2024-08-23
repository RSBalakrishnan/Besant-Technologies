package com.pojo;

public class Teachers {
	private String name ;
	private int idNum;
	private String email;
	private String subject;
	@SuppressWarnings("unused")
	private String password;
	
	public Teachers(String name , String password) {
		this.name=name;
		this.password=password;
	}
	public Teachers(String name,int idNum,String email,String subject,String password) {
		this.name=name;
		this.idNum=idNum;
		this.email=email;
		this.subject=subject;
		this.password=password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum=idNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String toString() {
		return name+ "," +idNum+","+email+", "+subject+","+password+",";
	}
	/*
	public String toString() {
		return "Teacher Details:\n 1.Name  : " +name+ "\n 2.Identity Number: " +idNum+"\n 3.Email Id: "+email+"\n 4.Subject: "+subject;
	}*/
}
