class Runner{

	public static void main (String...args){
	
	double price= 150.00;
	float length= 2.50f;
	String name= "Sagara Sangamam";
	double rating=4.9;
	
	String actors[]={"Kamal Hassan","Jaya Prada","Sarath Babu"} ;
	Movie.entertain(price,length,name,rating,actors);
	
	System.out.println ("====================================");
	
	int pRice = 550;
	String color= "Silver";
	double capacity = 500.00;
	String material = "Steel";
	
	String brands[]={"Cello", "Milton", "Flipkart SmartBuy", "Tupper Ware"};
	
	Bottle.storing(pRice,color,capacity,material,brands);
	}
}