package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {

		Shoe shoe = new Shoe();
		shoe.setBrand("Bata");
		shoe.setSize(9);
		shoe.setColor("Black");
		shoe.setGender("Male");

		Shoe shoe1 = new Shoe();
		shoe1.setBrand("Nike");
		shoe1.setSize(10);
		shoe1.setColor("White");
		shoe1.setGender("Male");

		if (shoe == shoe1) {
			System.out.println("both are pointing to same memory");
		}
		boolean same = shoe.equals(shoe1);// TRUE
		{
			System.out.println(same);
		}

	}

}
