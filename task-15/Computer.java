class Computer {
	String brand;
	int modelNo;
	int price;
	int quantity;
	ComputerType type =ComputerType.SUPERCOMPUTER;
	static int totalOfAllProduct;
	
	
	Computer (){
		System.out.println("No arg");
		
	
	}
	void complex (){
	
	
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
	}

	void totalPrice(){
		
	int total=this.price*this.quantity;
	System.out.println(total);
	Computer.totalOfAllProduct=Computer.totalOfAllProduct+total;
	}




}