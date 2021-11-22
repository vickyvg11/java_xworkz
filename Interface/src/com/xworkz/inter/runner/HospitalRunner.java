package com.xworkz.inter.runner;

import com.xworkz.inter.HospitalClass;

public class HospitalRunner {

	public static void main(String[] args) {

		
		
		HospitalClass hospitalClass = new HospitalClass(); //object 
		
		String str=hospitalClass.register();
		double str1=hospitalClass.payAdvance();
		boolean str2=hospitalClass.insurence();
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);

	}

}
