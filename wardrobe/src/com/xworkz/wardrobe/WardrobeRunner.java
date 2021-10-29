package com.xworkz.wardrobe;

import com.xworkz.wardrobe.operator.WardrobeOperator;

public class WardrobeRunner {

	public static void main(String[] args) {
			WardrobeOperator operator = new WardrobeOperator();
			operator.add("Shirt");
			boolean status = operator.add("Pant");
			System.out.println(status);
			boolean status1 = operator.add("saree");
			System.out.println(status1);
			boolean status2 = operator.add("Kurta");
			System.out.println(status2);
			boolean status3 = operator.add("T-Shirt");
			
			
			
			
			operator.update(3, "Facial Kit");
			
			operator.delete(1);
			
			
			
	}
	
	
	

}
