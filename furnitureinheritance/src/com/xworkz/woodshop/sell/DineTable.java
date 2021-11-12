package com.xworkz.woodshop.sell;

import com.xworkz.woodshop.design.Furniture;

public class DineTable extends Furniture {

	
	public DineTable() {
		super();
		System.out.println("Invoked no args constr of Dine Table");
		System.out.println(woodType);
	}
	
	
	/*public DineTable(String shape,double price,float weight,boolean woodType) {
		 this();
		 super.shape=shape;
		 super.price=price;
//		 super.weight=weight;
		 super.woodType=woodType;
		 System.out.println("Invoked Computer table with price,weiht,shape & woodtype");
	}*/
}
