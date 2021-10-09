class ScooterStarter{
	public static void main (String...args){
	
	Scooter scooter1 = new Scooter("Bajaj");
		System.out.println(scooter1);
		
	Scooter scooter2 = new Scooter(100);
	System.out.println(scooter2);
	
	
	Scooter scooter3 = new Scooter(70000,100);
	System.out.println(scooter3);
	
	Scooter scooter4 = new Scooter("Blue","Electric");
	System.out.println(scooter4);
	
	Scooter scooter5 = new Scooter("Grey",80000);
	System.out.println(scooter5);
	}
}