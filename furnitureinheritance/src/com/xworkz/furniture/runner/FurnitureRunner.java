package com.xworkz.furniture.runner;

import com.xworkz.woodshop.design.ComputerTable;
import com.xworkz.woodshop.sell.DineTable;

public class FurnitureRunner {

	public static void main(String[] args) {

		
		ComputerTable table = new ComputerTable("Round",5500.00,10.5f,true);
		System.out.print(table.shape);
		System.out.print(" ");
		//System.out.print(table.price);
		System.out.print(" ");
	//	System.out.print(table.weight);
		System.out.print(" ");
	//	System.out.print(table.woodType);
	
		
		
		
	/*	DineTable table2 = new DineTable("Square",15000.00,20.15f,false);
		System.out.print(table2.shape);
		System.out.print(" ");
		System.out.print(table2.price);
		System.out.print(" ");
	//	System.out.print(table2.weight);
		System.out.print(" ");
		System.out.print(table2.woodType);
	}*/
	}
}
