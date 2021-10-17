class PowerBank {
	String name;
	String color;
	int mah;
	String type;
	String countryMade;
	int quantity;
	int price;
	static int totalOfAllProduct;
	
	
	
	void charging (){
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.mah);
		System.out.println(this.type);
		System.out.println(this.countryMade);
	}
	PowerBank(){
		System.out.println("No Args");
		
	}
	
	
	void displayPrice(){
		int total= this.price*this.quantity;
		System.out.println(total);
		
		PowerBank.totalOfAllProduct=PowerBank.totalOfAllProduct+total;
		System.out.println(totalOfAllProduct);
	}
	
	
}