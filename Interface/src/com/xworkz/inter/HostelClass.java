package com.xworkz.inter;

public class HostelClass implements HostelInterface {

	@Override
	public boolean admission() {
		
		System.out.println("iNVOKED boolen method in Class");
		return true;
	}

	@Override
	public double closeTime() {
		System.out.println("Invoked Close Time in method");
		return 22.00;
	}

	@Override
	public String gender() {
		System.out.println("Invoked Gender Method");
		return "Male";
	}

	
	
	
}
