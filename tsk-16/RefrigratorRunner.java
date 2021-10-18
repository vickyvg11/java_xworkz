class RefrigratorRunner{

	public static void main (String...value){
	
		Refrigrator fridge = new Refrigrator();
		String model=fridge.getModel();
		if (model==null){
			System.out.println("0");
		}else
			System.out.println("Samsung");
		
		System.out.println("the company is :"+fridge.getCompany());
		System.out.println("capacity in litres:"+fridge.getCapacityInLitres());
		System.out.println("is it double door:"+fridge.getDoubleDoor());
		
		
		System.out.println("................Setter Method.............");
		fridge.setModel("2564RSQ2");
		fridge.setCompany("LG");
		fridge.setCapacityInLitres(260);
		fridge.setDoubleDoor(false);
	
	}
	





}