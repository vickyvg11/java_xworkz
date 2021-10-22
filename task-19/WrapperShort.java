class WrapperShort{

	public static void main (String...val){
	
		short tv = 25000;
        String screen = "43";
         
        // Construct two Short objects
        Short tele = new Short(tv);
        Short size = new Short(screen);
 
        // toString()
        System.out.println(Short.toString(tv));
	
		Short mobile = 10000;
		int mob = mobile.hashCode();
		System.out.println(mob);
	
		Short storage = 128;
		byte store= storage.byteValue();
		System.out.println(store);
	
		Short size1 = 6;
		float size2 = size1.floatValue();
		System.out.println(size2);
	
	//	Short s1 = 70;     
	//	Short s2 = 60;   // Implementing compareUnsigned() method     
		//int result=Short.compareUnsigned( s1, s2);        
		//System.out.println(" when s1= "+s1+" and s2= "+s2+" is Same then result : "+result); 
		
		String andriod = "10";    
		Short version = Short.decode(andriod);     
		System.out.println(version);    
	
		
		Short sValue = 100; //with positive value   
		//it returns long type value          
		long lValue = sValue.longValue();    
		System.out.println("Short "+sValue+" converted into longValue is = " + lValue);
	
		short tv1=32, tv2=43; // when x<y               
		Short tv3 = new Short(tv1);          
		Short tv4 = new Short(tv2); //comparing two shot values          
		int compareValue=Short.compare(tv3,tv4);                   
		System.out.println(" Two short values compared result: " + compareValue);    
	
	
		String bits = "32";  
        // it returns signed decimal short value of string  
        short bit = Short.parseShort(bits);   
		// printing signed parseShort value  
        System.out.println("String "+bits +" , parse value into parseShort  =" +bit);    
	
		Short scale = 16;
		int rsult = scale.intValue();
		System.out.println(rsult);  
	
		
	
	}


}