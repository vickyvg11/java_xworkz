class ComputerRunner{

	public static void main (String...args){
	
	Computer com = new Computer();
	com.brand = "PARAM SIDDI";
	com.modelNo= 8000;
	com.price = 1000000;
	com.quantity=5;
//	com.type= SUPERCOMPUTER;
	com.complex ();
	com.totalPrice();
	

	Computer com1 = new Computer();
	com1.brand = "PARAM SIDDI";
	com1.modelNo= 9000;
	com1.price = 2000000;
	com1.quantity=3;
//	com1.type= SUPERCOMPUTER;
	com1.complex();
	com1.totalPrice();
	}
}