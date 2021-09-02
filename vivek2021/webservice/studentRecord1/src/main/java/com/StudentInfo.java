package com;

public class StudentInfo {
	private Integer id;
	private String name;
	private String rollNumber;
	private Integer mobile;
	private String branch;
	private String email;
	private String address;
	private String pincode;
	
//constructor =========================================================================
	
	public StudentInfo() {
	super();
	}
	
//parameterize constructor ============================================================
	
	public StudentInfo(Integer id, String name,String rollnumber,String branch,String email,String address,Integer mobile,String pincode) {
	super();
	this.id = id;
	this.name =name;
	this.email=email;
	this.address = address;
	this.mobile=mobile;
	this.pincode=pincode;
	this.rollNumber=rollNumber;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
