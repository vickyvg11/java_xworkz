class FootwearShop{
	public static void purchasingFootwear(String name,String location,String city,int size[]){
		
		System.out.println ("the name of shop is:"+name);
		System.out.println("the location is :"+location);
		System.out.println("the the name of the city which shop is located ");
		
		for (int sizeoffootwear=0; sizeoffootwear<size.length;){
			
			int footwear = size[sizeoffootwear];
			System.out.println("the size of different footwear:"+footwear);
			sizeoffootwear++;
			
		}
	
	}
}