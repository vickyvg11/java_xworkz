class Valves{

	String name;
	int price;
	boolean isiMark;
	int quantity;
	String quality;
	static int totalOfallProduct;

	Valves (){
		System.out.println("No Args");
		
	}

	void safe (){
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.isiMark);
		System.out.println(this.quantity);
		System.out.println(this.quality);
	
	}

	void totalPrice(){
		int total = this.price*this.quantity;
		System.out.println(total);
		Valves.totalOfallProduct = Valves.totalOfallProduct + total;
}





}