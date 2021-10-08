class HandBag{
	String color;
	int price;
	String brand;
	int size;
	String material;
	boolean wheel;

	HandBag(int value){
	
	
		System.out.println("invoked HandBag price");
		System.out.println("the price of Bag is:"+value);
		price= value;
}

	HandBag(String bran,String mat){
		System.out.println("the Brand of Bag is;"+bran);
		System.out.println("the Brand of Bag is;"+mat);
		brand = bran;
		material= mat;
	}



	HandBag(int siz,String col){
		
		System.out.println("the size of bag is "+siz);
		System.out.println("the size of Color is "+col);
		size= siz;
		color= col;
		
	}
	HandBag(boolean wheels){
		System.out.println("the Bag has wheels???"+wheels);
		wheel=wheels;
		
	}
	
	HandBag (boolean lock,boolean kit){
		System.out.println("the bag has a locker:"+lock);
		System.out.println("the bag has shaving kit:"+kit);
	}
	HandBag(){
		System.out.println("Default");
	}	
	HandBag(String clr){
		System.out.println("the color of bag is :"+clr);
		color= clr;
	}
	HandBag (String nam, String colour,int payment){
		System.out.println("the name is :"+nam);
		System.out.println("the color is :"+colour);
		System.out.println("the payment is :"+payment);
		brand = nam;
		color= colour;
		price=payment;
	}
	
	
}