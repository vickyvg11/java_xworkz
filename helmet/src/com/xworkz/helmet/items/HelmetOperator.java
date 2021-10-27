package com.xworkz.helmet.items;

public class HelmetOperator {
	
	
public	String[] head = new String[5];
private	int count=0;
	
	public HelmetOperator() {
		System.out.println("No args");
	}
	
	public void bike(String brandHelmet)
	{
		//System.out.println("invoked Bike Method");
		if(brandHelmet!=null && this.count<this.head.length) {
			this.head[count]=brandHelmet;
			count++;
			System.out.println("Added Brand:"+brandHelmet);
			
		}else 
			System.err.println("Helmet brand cannot be added anymore because String array is limited to 5 ");
	}
	
}

