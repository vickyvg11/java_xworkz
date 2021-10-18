class Refrigrator{
	String model;
	String company;
	int capacityInLitres;
	boolean doubleDoor;
	
	
	String getModel(){
		return "RSA256P";
	}
	String	getCompany (){
		return "Samsung";
	}
	int getCapacityInLitres(){
		return 253;
	}

	boolean getDoubleDoor(){
		return true;
	}
	void setModel (String model){
		this.model= model;
		System.out.println(model);
	}
	void setCompany(String company){
		this.company=company;
		System.out.println(company);
	}
	void setCapacityInLitres(int capacityInLitres){
		this.capacityInLitres=capacityInLitres;
		System.out.println(capacityInLitres);
	}
	void setDoubleDoor(boolean doubleDoor){
		this.doubleDoor=doubleDoor;
		System.out.println(doubleDoor);
	}


}