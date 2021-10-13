class BiCycle{

	String brand= "Hercules";
	String color= "Black";
	int price= 8000;
	BiCycleType type = BiCycleType.WITHOUTGEAR;
	
	
	void brake()
	{
		
		System.out.println("Invoked Brake");
	}

	void move ()
	{
		System.out.println("Invoked Move Method");
	}
	
	void dispalyDetails()
	{
	
		System.out.println("Invoked Details");
		System.out.println("the Brand of BiCycle:"+this.brand);
		System.out.println("the color of BiCycle:"+this.color);
		System.out.println("the price of BiCycle:"+this.price);
		System.out.println("the price of BiCycle:"+this.type);
		
	}
	
}