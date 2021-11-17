package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.Stadium;

public class StadiumRunner {

	public static void main(String[] args) {

		Stadium stadium = new Stadium();
		stadium.setName("Wankade Stadium");
		stadium.setCity("Mumbai");
		stadium.setAreaOfMeters(75149.501);

		Stadium stadium1 = new Stadium();
		stadium1.setName("M.Chinnaswamy Stadium");
		stadium1.setCity("Bangalore");
		stadium1.setAreaOfMeters(67148.145);

		if (stadium == stadium1) {
			System.out.println("both pointing to same memory");
		}

		boolean same = stadium.equals(stadium1);// TRUE
		{
			System.out.println(same);
		}

	}


	}


