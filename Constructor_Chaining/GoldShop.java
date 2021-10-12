class GoldShop{

	String name;
	String city;
	GoldItems items=GoldItems.RINGS;
	long number;
	String type;
	int branch;
	
	
	GoldShop (String name){
		this("Bangalore",968974784l);
		System.out.println("Single constarutor is invoked ");
		this.name=name;
		
	}

	GoldShop(String city,long number){
		System.out.println("The shop is located at:"+city);
		System.out.println("the contact number of Shop is:"+number);
		this.city=city;
		this.number=number;
		
	}	
	GoldShop(GoldItems items){
		this("Silver and Gold Shop",5);
		System.out.println("the Ring item is invoked:"+items);
		this.items=items; 
	}	
		
	GoldShop(String type,int branch){
		System.out.println("the number Branches in Bangalore:"+branch);
		System.out.println("the Oranments Avaliable:"+type);
		this.type=type;
		this.branch=branch;
	}
		
		
		
		
		
		
		
		
		
		
		
}