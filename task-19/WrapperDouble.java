class WrapperDouble{

	public static void main (String...value){
	
	Double intrest= new Double("7.5");
	byte intr = intrest.byteValue();
	System.out.println(intr);
	
	Double com = 25.0;
	Double compay = 15.0;
	
	double comapre = Double.compare(com,compay);
	if (com == compay){
		System.out.println("Both are Equal");
		
	}
	else 
		System.out.println("Not equal");
	
	 Double d1=new Double(15.0/0.0);  
     Double d2=new Double(10.0-10.0);  
     Double d3=new Double(23.0*0.0/0.0);  
	
	System.out.println(d1.isNaN());
	System.out.println(d2.isNaN());
	System.out.println(d3.isNaN());
	
	Double tht = 25.00;
	Long tht2 = d1.longValue();
	System.out.println(d2);
	
	Double tax = 12.5;
	int valve = tax.intValue();
	System.out.println(valve);
	
	Double double1 = 55.05587687687;
	float flot = double1.floatValue();
	System.out.println(flot);
	
	Double item = new Double(0.78);
	System.out.println(item.hashCode());
	
	Double mouse = 200.25;
	Double keyboard= 400.15;
	Double minimum = Double.min(mouse,keyboard);
	System.out.println(minimum);
	
	Double laptop = 36500.85;
	Double laptop1 = 35000.78;
	Double maximum = Double.max(laptop,laptop1);
	System.out.println(maximum);
	
	Double cycle = 8000.75;
	if (Double.isFinite(cycle))
	{
		System.out.println("True");
	
	}
	else 
		System.out.println("false");
	
}

}