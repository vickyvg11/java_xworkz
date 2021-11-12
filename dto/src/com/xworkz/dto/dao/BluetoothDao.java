package com.xworkz.dto.dao;

import com.xworkz.dto.Bluetooth;

public class BluetoothDao {

	private Bluetooth[] contain = new Bluetooth[5];
	int count;
	
	public BluetoothDao() {
		System.out.println("No arg Constructor");
	
	}
	
	public void add (Bluetooth bluetooth) {     // ref 
		
		if(this.count<this.contain.length && contain!=null ) {
			this.contain[count]=bluetooth;
			count++;
			System.out.println("Added BLuetooth to Container :".concat(String.valueOf(this.count)).concat(" brand:").concat(bluetooth.getBrand()).concat(" ").concat(" Color:").concat(String.valueOf(bluetooth.getColor())));
		}
		else {
			System.err.println("the Blutooth is full  ");
		}
	}
	
	
	public void delete(int index) {
	System.out.println("Invoked Delete with index "+(String.valueOf(index)));
	
	if (index>=0 && index<this.contain.length) {
		this.contain[index]=null;
		System.out.println("Delete the Bluetooth with index");
		
	}
	else {
		System.err.println("Cannot delete, index is not good ");
	}
	}
	
	public void byBrand(Bluetooth byBrand) {
		
		for (int item=0; item<this.contain.length;item++) {
			Bluetooth contain =this.contain[item];
			String brand = contain.getBrand();
			if(brand.equals(byBrand)) {
				System.out.println("Brand is Matched");
			}else {
				System.out.println("Brand is Not Matched");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
