package com.xworkz.wardrobe.operator;

public class WardrobeOperator {

	
	String[] stored = new String[5];
	int count = 0;
	
	
	public WardrobeOperator() {
		
		System.out.println("Invoked No args");
	}
	
	public boolean add (String name)
	{
		System.out.println("Invoked Add method");
		if (name!=null && this.count<this.stored.length)
		{
			this.stored[count]= name;
			System.out.println("adding the Dress:"+name);
			return true;
		}else {
			System.out.println("Not Added the Dress");
			
		}return false;
	}
	
	
	
	public boolean update(int index,String newThing)
	{
		System.out.println("Updated :".concat(newThing));
		if(newThing!=null && index<this.stored.length) {
			this.stored[index]=newThing;
			System.out.println(this.stored[3]);//updated Array
			return true;
			
		}
		else {
			System.out.println("Things not Updated");
		}
		return false;
	}
	public boolean delete(int index) {
		if (index<this.stored.length) {
			System.out.println("deleted");
			this.stored[index]=null;
			return true;
		}return false;
	}
	
	
	public boolean match(String thing) {
		System.out.println("invoked match");
		for (int dress = 0; dress < this.stored.length; dress++) {
			String tempThing = this.stored[dress];
			if (tempThing != null) {
				if (tempThing.equals(thing)) {
					System.out.println("thing is matched ".concat(thing));
					return true;
				}
			}
		}
		return false;
	}
	

	
}

