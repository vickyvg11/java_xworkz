package com.xworkz.equals.object_method;

public class WatchObject {

private	String brand;
WatchType type;
private int price = 1500;

	public WatchObject() {
		System.out.println("invoked no ags constructor");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from watch ");
		if(obj!=null) {
			System.out.println("Ref is not null");
			if (obj instanceof WatchObject) {
				WatchObject caste = (WatchObject)obj;
				String castedBrand=caste.getBrand();
				WatchType castedtype = caste.getType();
				
				if(this.brand.equals(castedBrand) && this.type==castedtype){
					System.out.println("Brand and Type is Matching  ");
					return true;
					
				}else {
					System.err.println("Brand or Type is not matching ");
				}
				System.out.println("ref is WatchObject");
			}else {
				System.out.println("cannot compare,ref is not Watch object");
			}
		}
		else {
			System.err.println("Ref is null pass  the proper ref.... ");
		}
		
		
		return false;
		
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public WatchType getType() {
		return type;
	}

	public void setType(WatchType type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
