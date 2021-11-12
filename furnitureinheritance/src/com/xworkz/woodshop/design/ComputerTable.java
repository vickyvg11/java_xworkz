package com.xworkz.woodshop.design;

public class ComputerTable extends Furniture {


	public ComputerTable() {
	super();
	System.out.println("Invoked No args constr in Computr table");
	}
	
	
 public ComputerTable(String shape,double price,float weight,boolean woodType) {
	 this();
	 super.shape=shape;
	 super.price=price;
//	 super.weight=weight;
	 super.woodType=woodType;
	 System.out.println("Invoked Computer table with price,weiht,shape & woodtype");
	
 }
}
