package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.AeroPlane;

public class AeroplaneRunner {

	public static void main(String[] args) {

		
		

			AeroPlane aeroplane = new AeroPlane();
			aeroplane.setNumber(551);
			aeroplane.setCompany("SpiceJet");
			aeroplane.setGovernment("India");

			AeroPlane aeroplane1 = new AeroPlane();
			aeroplane1.setNumber(450);
			aeroplane1.setCompany("IndiGO");
			aeroplane1.setGovernment("India");

			if (aeroplane == aeroplane1) {
				System.out.println("both are pointing to same memory");
			}

			boolean same = aeroplane.equals(aeroplane1);
			{
				System.out.println(same);
			}
		}

		
	}

