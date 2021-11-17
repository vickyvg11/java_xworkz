package com.xworkz.object.runner;

import java.lang.reflect.Constructor;

import com.xworkz.object.BatType;
import com.xworkz.object.CricketBat;

public class BatRunner {

	public static void main(String[] args) {
		
		CricketBat cricketBat = new CricketBat();
		cricketBat.setCompanyName("Gray-Nicolls");
		cricketBat.setType(BatType.ENGLISH_WILLOW);
		cricketBat.setPrice(1865.00);
		cricketBat.setWood("Cedrius");
		
		System.out.println(cricketBat.toString());

		CricketBat cricketBat1 = new CricketBat();
		cricketBat1.setCompanyName("Gray-Nicolls");
		cricketBat1.setType(BatType.ENGLISH_WILLOW);
		cricketBat1.setPrice(1865.00);
		cricketBat1.setWood("Morus");
		
		if(cricketBat==cricketBat1) {
			System.out.println("both pointing same memory");
			boolean same = cricketBat.equals(cricketBat1);
			System.out.println(same);
			
		}else {
			System.err.println("not pointing to same memory");
			
		}
				CricketBat cricketBat2 = new CricketBat();
				Class class1 = cricketBat2.getClass();
				System.out.println(class1.getConstructors().length);
				System.out.println(class1.getMethods().length);
				System.out.println(class1.getFields().length);
				
				
				
				
	}

}
