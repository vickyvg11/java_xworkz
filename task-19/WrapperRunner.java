class WrapperRunner{
	public static void main (String...vlaues){
	
	byte iceCream = 65;
	//Byte ice =Byte.parseByte(iceCream);
	Byte ice = new Byte(iceCream); //Byte Constructor
	System.out.println(ice);
	
	String price = "50";
	Byte pric = new Byte(price);
	System.out.println(pric);
	
	
	//Byte Method
	long out = ice.longValue();
	System.out.println(out);
	
	Byte money=pric.byteValue();
	System.out.println("the Amount:"+money);
	
	Byte age = 30;
	Byte age1 = 26;
	
	int output= Byte.compare(age,age1);
	System.out.println(output);
	
	Byte pen=20;  
    Double d1 = pen.doubleValue();
	System.out.println(d1);
	
	boolean val= age.equals(age1);
	if(val)
	{
		System.out.println("age is equal");
	}
	else 
		System.out.println("not equal");
	
	
		byte age3 = 34;
		byte age4 = 23;
		System.out.println(Byte.valueOf(age3).compareTo(Byte.valueOf(age4)));//11
	
	String str = "-10";
	int val1=Byte.parseByte(str);  
     System.out.println(val1);  
	
	Byte balm = 25;
	String balm1 = balm.toString();
	System.out.println(balm1);
	
	
	
	String amrutjan= "50";
	Byte amrut = Byte.decode(amrutjan);
	System.out.println(amrut);
	
	
	Byte pencil=5;  
	float pencil1= pencil.floatValue();
	System.out.println(pencil1);
	
	
 
	
	
	}























}