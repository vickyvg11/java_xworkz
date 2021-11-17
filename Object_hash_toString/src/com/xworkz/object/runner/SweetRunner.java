package com.xworkz.object.runner;

import com.xworkz.object.Sweet;
import com.xworkz.object.SweetColor;
import com.xworkz.object.SweetShape;

public class SweetRunner {

	public static void main(String[] args) {

		
		Sweet sweet = new Sweet();
		sweet.setColr(SweetColor.BROWN);
		sweet.setName("Chocolate Burfi");
		sweet.setPrice(350);
		sweet.setShape(SweetShape.DIAMONDSHAPE);
		
		Sweet sweet1 = new Sweet();
		sweet1.setColr(SweetColor.WHITE);
		sweet1.setName("Chocolate Burfi");
		sweet1.setPrice(350);
		sweet1.setShape(SweetShape.SQUARE);
		
		if(sweet==sweet1) {
			System.out.println("Both are poiting same memry");
		}
		boolean same = sweet.equals(sweet1);
		{
			System.out.println(same);
		}
	}
	
	
}
