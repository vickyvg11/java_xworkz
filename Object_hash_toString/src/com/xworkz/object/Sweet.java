package com.xworkz.object;

public class Sweet {

	private String name;
	SweetColor colr;
	private int price;
	SweetShape shape;
	
	public Sweet() {
		System.out.println("No args constructor");
	}

	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("Ref is matching");
		if(obj instanceof Sweet) {
			Sweet casted = (Sweet)obj;
			SweetColor castedColor=casted.getColr();
			SweetShape castedShape = casted.getShape();
			if(this.colr.equals(castedColor) && this.shape.equals(castedShape)) {
				System.out.println("Shape and Color is Matching");
				return true;
			}else {
				System.err.println("Shape and color is not Matching");
			}
		}
		}else {
			System.err.println("Ref is NOt matching");
		}
		
		
		
		return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SweetColor getColr() {
		return colr;
	}

	public void setColr(SweetColor colr) {
		this.colr = colr;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SweetShape getShape() {
		return shape;
	}

	public void setShape(SweetShape shape) {
		this.shape = shape;
	}
	
}
