class Camera {
	String brand;
	String model;
	double pixel;
	int price;
	boolean resolution;

	String getBrand (){
		brand = "Nikon";
		System.out.println(brand);
		return "Canon";
	}

	String getModel(){
		return "EOS 1500D";
	}

	double getPixel(){
		return 24.1;
	}
	int getPrice (){
		return 24000;
	}
	boolean getResolution(){
		return true;
	}
	
	void setBrand (String brand){
		this.brand= brand;
		System.out.println(brand);
	}
	void setModel(String model){
		this.model = model;
	}
	void setPixel(double pixel){
		this.pixel = pixel;
	}
	void setPrice(int price){
		this.price=price;
	}
	void setResolution(boolean resolution){
		this.resolution=resolution;
	}
}