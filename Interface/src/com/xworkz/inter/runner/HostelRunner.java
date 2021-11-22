package com.xworkz.inter.runner;

import com.xworkz.inter.HostelClass;

public class HostelRunner {

	public static void main(String[] args) {

		
		HostelClass hostelClass = new HostelClass();
		
		boolean str1=hostelClass.admission();
		double str2=hostelClass.closeTime();
		String str3 = hostelClass.gender();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
