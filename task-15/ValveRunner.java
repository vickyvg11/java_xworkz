class ValveRunner{

	public static void main (String...value){
	
	
	Valves vlave  = new Valves();
	vlave.name="Star";
	vlave.price=249;
	vlave.isiMark = true;
	vlave.quantity= 10;
	vlave.quality= "Brass";
	vlave.safe();
	vlave.totalPrice();
	
	Valves vlave1  = new Valves();	
	vlave1.name="SunStar";
	vlave1.price=349;
	vlave1.isiMark = true;
	vlave1.quantity= 5;
	vlave1.quality= "Brass";
	vlave1.safe();
	vlave1.totalPrice();
	}

}