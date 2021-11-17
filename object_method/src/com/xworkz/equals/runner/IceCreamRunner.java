package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.IceCream;
import com.xworkz.equals.object_method.IceCreamFlavour;
import com.xworkz.equals.object_method.IceCreamType;

public class IceCreamRunner {

	public static void main(String[] args) {


		IceCream icecream = new IceCream();
		icecream.setFlavour(IceCreamFlavour.VANILLA);
		icecream.setType(IceCreamType.CUP);
		icecream.setName("Naturals");

		IceCream icecream1 = new IceCream();
		icecream1.setFlavour(IceCreamFlavour.CHOCOLATE);
		icecream1.setType(IceCreamType.CUP);
		icecream1.setName("Naturals");

		if (icecream == icecream1) {
			System.out.println("both pointing to same memory");
		}
		boolean same = icecream.equals(icecream1);
		System.out.println(same);

	}
		
		
}

