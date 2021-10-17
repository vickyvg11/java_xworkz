class PowerRunner{

	public static void main (String...value){
	
	PowerBank power = new PowerBank();
	power.name= "MI";
	power.color= "Black";
	power.mah=10000;
	power.type= "Lithium";
	power.countryMade= "India";
	power.quantity=5;
	power.price=800;
	power.charging ();
	power.displayPrice();
	
	PowerBank power1 = new PowerBank();
	power1.name= "Syska";
	power1.color= "Blue";
	power1.mah=20000;
	power1.type="Lithium";
	power1.countryMade= "India";
	power1.quantity=10;
	power1.price=1200;
	power1.displayPrice();

		
		
		
	}


}