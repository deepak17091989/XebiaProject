package com.retail.user;

import com.retail.bill.Bill;

public class User {
	private String userType;
	private int yearOfAssoc;
	private Bill bill;
	
	public User() {}
	public User(String userType, int yearOfAssoc,Bill bill) {
		this.userType=userType;
		this.yearOfAssoc=yearOfAssoc;
		this.bill=bill;
		
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getYearOfAssoc() {
		return yearOfAssoc;
	}
	public void setYearOfAssoc(int yearOfAssoc) {
		this.yearOfAssoc = yearOfAssoc;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
}
