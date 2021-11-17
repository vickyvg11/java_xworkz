package com.xworkz.object.runner;

import com.xworkz.object.Bridge;

public class BridgeRunner {

	public static void main(String[] args) {

		Bridge bridge = new Bridge();
		bridge.setName("Golden Gate Bridge");
		bridge.setLength(2743);
		bridge.setCost(8);
		bridge.setOpenYear(1937);
		bridge.toString();
		
		
		Bridge bridge1 = new Bridge();
		bridge1.setName("London Bridge");
		bridge1.setLength(269);
		bridge1.setCost(4);
		bridge1.setOpenYear(1973);
		
		if (bridge==bridge) {
			System.out.println("Both are Pointing to memory");
		}
		boolean same=bridge.equals(bridge1);
		{
			System.out.println(same);
		}
	}

}
