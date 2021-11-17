package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.WatchObject;
import com.xworkz.equals.object_method.WatchType;



public class WatchRunner {

	public static void main(String[] args) {
		
		
		
		WatchObject watchObject = new WatchObject();
		watchObject.setBrand("IWatch");
		watchObject.setPrice(18000);
		watchObject.setType(WatchType.SMARTWATCH);
		
		
		WatchObject watchObject1 = new WatchObject();
		watchObject1.setBrand("IWatch");
		watchObject1.setPrice(2500);
		watchObject1.setType(WatchType.SMARTWATCH);
		if(watchObject==watchObject1) {
			System.out.println("To pinting to same memoery");
		}
		
		boolean same = watchObject.equals(watchObject1);
		{
			System.out.println(same);
		}
	
	}

}
