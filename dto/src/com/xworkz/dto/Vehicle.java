package com.xworkz.dto;

public class Vehicle {

	private String company;
	private boolean type;
	private int pirce;
	private String number;
	private String color;
	
	public Vehicle() {
		System.out.println("Invoked Vehicle");
	}

	
	
	
	public Vehicle(String company, boolean type, int pirce, String number, String color) {
		super();
		this.company = company;
		this.type = type;
		this.pirce = pirce;
		this.number = number;
		this.color = color;
	}




	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
