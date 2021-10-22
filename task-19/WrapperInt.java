class WrapperInt{

	public static void main (String...value){
	
		Integer lap = new Integer(15);
		byte b = lap.byteValue();
		System.out.println(b);
	
	
		Integer laptopStoreage = 256;
		short result = laptopStoreage.shortValue();
		System.out.println(result);
	
		Integer ram = 4;
		String ram1 = ram.toString();  
        System.out.println("String Representation = " + ram1); 
		
		Integer serialNo = 298689;
		long serial = serialNo.longValue();
		System.out.println(serial);
		
		Integer version = 250;
		Integer version1 = 251;
		boolean same = version.equals(version1);
		System.out.println(same);
		
		
		Integer screenSize = 6;
		float size = screenSize.floatValue();
		System.out.println(size);
		
		
		Integer value2 = 512;
		double  value3 = value2.doubleValue();
		System.out.println(value3);
		
		Integer storage = 256;
		Integer store = 256;
		System.out.println(storage.compareTo(store));
	
		Integer price = 40000;
		int amt = price.hashCode();
		System.out.println(amt);
		
		
		Integer sum1 = 100;
		Integer sum2 = 120;
		System.out.println(Integer.sum(sum1,sum2));
	
	}





}