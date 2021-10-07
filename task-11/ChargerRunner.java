class ChargerRunner{


	public static void main (String...args){
	
	
	Charger charge = new Charger();
	
	charge.type= "B";
	charge.output= 5;
	System.out.println(charge.type);
	System.out.println(charge.model);
	System.out.println(charge.output);
	System.out.println(charge.countryMade);
	System.out.println(charge.hz);
}

}