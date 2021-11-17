package com.xworkz.object;

public class Bridge{

	private String name;
	private int length;
	private double cost;
	private int openYear;


	public Bridge() {
		System.out.println("NO args Constructor");
	}

	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("Ref is matching");
			if(obj instanceof Bridge) {
				System.out.println("ref is Bridge");
				Bridge casted = (Bridge)obj;
				String castedName= casted.getName();
				int castedLength =casted.getLength();
				if(this.name.equals(castedName) && length==castedLength){
					System.out.println("Name and length is matching ");
					return true;
				}else {
					System.err.println("Name and length is not matching");
				}
			}
		}else {
			System.err.println("ref is not matching");
		}
		return false;
	}

	@Override
	public String toString() {
		System.out.println("Invoked from Child Class");
		return "String";
	}
	
	public int hashCode() {
		System.out.println("Invoked from child class");
		return 100;  
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public int getOpenYear() {
		return openYear;
	}


	public void setOpenYear(int openYear) {
		this.openYear = openYear;
	}

}
