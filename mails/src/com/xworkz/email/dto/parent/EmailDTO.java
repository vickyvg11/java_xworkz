package com.xworkz.email.dto.parent;

public class EmailDTO {
	private String emailID;
	private double storageSize;
	private boolean free;
	private int noOfEmailPerDay;
	
	
	public EmailDTO() {
		System.out.println("No args of EmailDTO");
	}


	public EmailDTO(String emailID, double storageSize, boolean free, int noOfEmailPerDay) {
		super();
		this.emailID = emailID;
		this.storageSize = storageSize;
		this.free = free;
		this.noOfEmailPerDay = noOfEmailPerDay;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public double getStorageSize() {
		return storageSize;
	}


	public void setStorageSize(double storageSize) {
		this.storageSize = storageSize;
	}


	public boolean isFree() {
		return free;
	}


	public void setFree(boolean free) {
		this.free = free;
	}


	public int getNoOfEmailPerDay() {
		return noOfEmailPerDay;
	}


	public void setNoOfEmailPerDay(int noOfEmailPerDay) {
		this.noOfEmailPerDay = noOfEmailPerDay;
	}
	
	
	

}
