package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.Belt;

public class BeltRunner {

	public static void main(String[] args) {

		Belt belt = new Belt();
		belt.setPrice(1500.00f);
		belt.setMaterial("Leather");
		belt.setSize(30);
		belt.setGender("Male");

		Belt belt1 = new Belt();
		belt1.setPrice(599.00f);
		belt1.setMaterial("Leather");
		belt1.setSize(32);
		belt1.setGender("Male");

		if (belt == belt1) {
			System.out.println("both pointing to same memory");
		}

		boolean same = belt.equals(belt1);// TRUE
		{
			System.out.println(same);
		}

	}

	}


