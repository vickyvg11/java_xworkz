package com.xworkz.equals.object_method;

public class BagObject {

	int price;
	String section;
	BagColor color;
	
	
	public BagObject() {
		System.out.println("NO args constructor");
	}

	public boolean equals(Object obj) {
		System.out.println("invoked the equals method");
		if (obj!=null) {
			System.out.println("ref is matching");
			if (obj instanceof BagObject) {
				BagObject caste = (BagObject) obj;
				BagColor colr=caste.getColor();
				String sec = caste.getSection();
				if(this.color==colr && this.section.equals(sec)) {
					System.out.println("Color is Matching and Section  is maching");
					return true;
				}else {
					System.out.println("color and Section is NOt matching");
				}
			}
		}else {
			System.out.println("Ref is not Matching");
		}
		
		
		return false;
	}

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public BagColor getColor() {
		return color;
	}


	public void setColor(BagColor color) {
		this.color = color;
	}
	
	
}
