class WrapperLong{

	public static void main (String...value){
	
		Long obj1 = 56l;  
        Long obj2 = 12l;  
        Long obj = Long.min(obj1, obj2);  
		System.out.println(obj);  
	
		Long val=20l;  
		System.out.println(Long.valueOf(val));
	
		CharSequence seq ="123678909";  
		int beginIndex = 0;  
		int endIndex = 0;  
		int radix = 4;  
	
		
		long multi = Long.parseLong("20");  
        long multiply = Long.parseLong("5");  
        long into = multi * multiply ;  
        System.out.print(into); 

		Long adhaar = 482965699332l;
		Long adhaar1 = 257841698745l;
		
		int total = Long.compare(adhaar,adhaar1);
		if(total == 0 ){
			System.out.println("values are equals");
			
		}
		else
			System.out.println("Not Equal");
	  
	  
	   Long imei = 257849871l;
	   int imei2 = imei.intValue();
	   System.out.println(imei2);
	  
	   Long long1 = 2657841l;
	   double long2 = long1.doubleValue();
	   System.out.println(long2);
	  
	   String code = "120";
	   System.out.println(Long.decode(code));
	  
	   Long dividend = 25l;
	   Long divisor = 5l;
	   Long by = Long.divideUnsigned(dividend,divisor);
	   System.out.println(by);
	
	
	Long adhaar2 = 482965699332l;
	String str = String.valueOf(adhaar2);
	System.out.println("The String:"+str);
	  
	Long shut = 5999l;
	short str1 = shut.shortValue();
	System.out.println(str1);
	
	  
	}
}