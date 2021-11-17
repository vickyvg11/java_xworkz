package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.BagColor;
import com.xworkz.equals.object_method.BagObject;

public class BagRunner {


	public static void main(String[] args) {
		
		BagObject bagObject = new BagObject();
		bagObject.setColor(BagColor.RED);
		bagObject.setPrice(2500);
		bagObject.setSection("Office");
		
		
		BagObject bagObject1 = new BagObject();
		bagObject1.setColor(BagColor.RED);
		bagObject1.setPrice(2500);
		bagObject1.setSection("College");
		
		
		boolean same = bagObject.equals(bagObject1);
		{
			System.out.println(same);
		}
		
		
	}
	
 }
