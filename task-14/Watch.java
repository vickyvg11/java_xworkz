class Watch{

	String brand="RADO";
	int price = 7000;
	String color ="BALCK";
	String countryMade = "Switzerland";
	WatchType type = WatchType.ANALOG;
	
	
	void displayDetails(){
		
		System.out.println("The brand of Details");
		System.out.println("The brand is:"+this.brand);
		System.out.println("The price is:"+this.price);
		System.out.println("Made in:"+this.countryMade);
		System.out.println("The Type is:"+this.type);
		
	}




}