class Tv {

	String brand;
	String type;
	int price;
	boolean wifi;
	boolean bluetooth;
	int quantity;
static int totalOfAllProduct;
	void watch(){
	
		System.out.println("Invoked the method");
		System.out.println(this.brand);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.wifi);
		System.out.println(this.bluetooth);
	}

	Tv(){
	
		System.out.println("Invoked constructor with no args");
	}

	void displayOfTotalprice (){
	int totalPrice=this.price*this.quantity;
	System.out.println(totalPrice);
	Tv.totalOfAllProduct = Tv.totalOfAllProduct+totalPrice;
	System.out.println(Tv.totalOfAllProduct);
	}

}