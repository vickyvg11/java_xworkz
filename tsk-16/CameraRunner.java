class CameraRunner{

	public static void main (String...value){
	
	Camera cam = new Camera();
	String cm = cam.getBrand();
	cm = "Sony ImX 686";
	if (cm!=null){
		System.out.println(cm);
	}
	System.out.println(cm);
	System.out.println(cam.getBrand());
	
	System.out.println(cam.getModel());
	System.out.println(cam.getPixel());
	System.out.println(cam.getPrice());
	System.out.println(cam.getResolution());
	
	cam.setBrand("Sony");
	cam.setModel("1500D");
	cam.setPixel(25.1);
	cam.setPrice(25000);
	cam.setResolution(true);
	
	
	
	
	
	
	}


}