class WrapperLong{
	
	
	public static void main (String...values){

	String imei = "60547869314752";
	long conversionOfImei=Long.parseLong(imei);
	System.out.println(conversionOfImei+10);
	
	String accountNumber = "302147878197476846";
	long conversionOfAcc= Long.parseLong(accountNumber);
	System.out.println(conversionOfAcc+5);
	
	String creditCard = "40152571365825447";
	long conversionOfCard = Long.parseLong(creditCard);
	System.out.println(conversionOfCard+12);
	
	String tollFree = "18002056687";
	long conversionOfToll = Long.parseLong(tollFree);
	System.out.println(conversionOfToll+3);

	String landLine = "08372220399";
	long coversionOfLand = Long.parseLong(landLine);
	System.out.println(coversionOfLand+7);


	}
}