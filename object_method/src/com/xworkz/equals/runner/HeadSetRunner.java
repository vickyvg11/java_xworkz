package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.HeadSet;
import com.xworkz.equals.object_method.HeadSetTypes;

public class HeadSetRunner {

	public static void main(String[] args) {

		HeadSet headSet = new HeadSet();
		headSet.setBrand("Boat");
		headSet.setBattery(60.50f);
		headSet.setType(HeadSetTypes.WIRELESS);
		headSet.setWarranty(1);

		HeadSet headSet1 = new HeadSet();
		headSet1.setBrand("Apple");
		headSet1.setBattery(56.50f);
		headSet1.setType(HeadSetTypes.WIRE);
		headSet1.setWarranty(1);

		if (headSet == headSet1) {
			System.out.println("pointing to same location");
		}

		boolean same = headSet.equals(headSet1);
		System.out.println(same);
	}

	}


