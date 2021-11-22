package com.xworkz.inter;

public class HospitalClass implements HospitalRules {
	
	
	@Override
	public String register() {
		System.out.println("Innoked String Method in Class ");
		return "Registration1";
	}

	
	public double payAdvance() {
		System.out.println("Invoked Double in Class");
		return 1500.00;
	}
	
	public boolean insurence() {
		System.out.println("Invoked Boolean Method in Class");
		return false;
	}
}
