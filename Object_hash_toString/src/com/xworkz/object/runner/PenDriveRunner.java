package com.xworkz.object.runner;

import com.xworkz.object.PenDrive;

public class PenDriveRunner {

	public static void main(String[] args) {
		
		

		PenDrive penDrive = new PenDrive();
		penDrive.setCapacity("8GB");
		penDrive.setWorking(true);
		penDrive.setBrand("Sandisk");
		penDrive.setPrice(950.0f);

		PenDrive penDrive1 = new PenDrive();
		penDrive1.setCapacity("4GB");
		penDrive1.setWorking(true);
		penDrive1.setBrand("HP");
		penDrive1.setPrice(950.0f);
		System.out.println("toString: " + penDrive1.toString());
		System.out.println("toString: " + penDrive1.hashCode());

		boolean same = penDrive.equals(penDrive1);
		System.out.println(same);

		// class is Class
		// System.out.println("*****getClass******");
		PenDrive penDrive2 = new PenDrive();
		Class class1 = penDrive2.getClass();

		System.out.println("*****getClass-Methods-FieldsConsturctor[]******");
		System.out.println("Methods: " + class1.getMethods().length);
		System.out.println("Fields: " + class1.getFields().length);
		System.out.println("Constructors: " + class1.getConstructors().length);

	
	}

}


