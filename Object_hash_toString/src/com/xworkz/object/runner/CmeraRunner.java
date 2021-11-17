package com.xworkz.object.runner;

import com.xworkz.object.Camera;

public class CmeraRunner {

	public static void main(String[] args) {
		
		Camera camera = new Camera();
		camera.setBrand("Canon");
		camera.setModelNo(145);
		camera.setPrice(18500.50);
		camera.setWarranty(3);
		
		
		Camera camera2 = new Camera();
		camera2.setBrand("Nikon");
		camera2.setModelNo(200);
		camera2.setPrice(25000.250);
		camera2.setWarranty(2);
		
		Camera camera3 = new Camera();
		Class camera4=camera3.getClass();
		System.out.println(camera4.getConstructors().length);
		System.out.println(camera4.getMethods().length);
		System.out.println(camera4.getFields().length);
		
	}

}
