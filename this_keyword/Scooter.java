class Scooter{
	String brand;
	String color;
	int cubicCapacity;
	int price;
	String type;
	
	
	
	Scooter(String brand){
		System.out.println("the brand is:"+brand);
		this.brand=brand;
	}
	Scooter(int cubicCapacity){
		System.out.println("the scooter CC is "+cubicCapacity);
		this.cubicCapacity= cubicCapacity;
	}
	
	Scooter(int price,int cubicCapacity){
		System.out.println("the scooter CC is "+cubicCapacity);
		System.out.println("the scooter price is "+price);
		this.cubicCapacity= cubicCapacity;
		this.price= price;
	}
	
	Scooter(String color,String type){
		System.out.println("the scooter Color is "+color);
		System.out.println("the scooter type is "+type);
		this.color= color;
		this.type= type;
	}
	Scooter(String color,int price){
		System.out.println("the scooter Color is "+color);
		System.out.println("the scooter price is "+price);
		this.color= color;
		this.price= price;
}


}