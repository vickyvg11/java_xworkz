class TvRunner{

	public static void main (String...value){
	
		Tv tv = new Tv();
		
		tv.watch();
		tv.brand= "Sony";
		tv.type= "LED";
		tv.price=25000;
		tv.wifi=true;
		tv.bluetooth=true;
		tv.quantity=5;
		tv.watch();
		tv.displayOfTotalprice();
		
		Tv tv1 = new Tv();
		
		tv1.brand= "Sony";
		tv1.type= "LCD";
		tv1.price=20000;
		tv1.wifi=true;
		tv1.bluetooth=true;
		tv1.quantity=3;
		tv.displayOfTotalprice();
	
	}



}