package com.xworkz.vehicle.operator;

public class VehicleOperator {

	public String[] brand = new String[5];
	public int count=0;
	
	
	public VehicleOperator() {
		System.out.println("No args");
	}
	
	public void riding(String brandVehicle)
	{
		if(brandVehicle!=null)
		this.brand[count]=brandVehicle;
		count++;
		System.out.println("Brand of Vehicle:"+brandVehicle);
	}
}
