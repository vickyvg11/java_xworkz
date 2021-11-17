package com.xworkz.equals.object_method;

public class Sock {
	
	char size;
	int price;
	SockMaterial mat;
	

	public Sock() {
		System.out.println("Invoked no args Constructor");
	}


	public boolean equals(Object obj) {
		if (obj!=null) {
			System.out.println("Ref is matching");
			if (obj instanceof Sock) {
				Sock socks = (Sock)obj;
				char soc = socks.getSize();
				SockMaterial material = socks.getMat();
				if(this.size==soc && this.mat.equals(material)){
					System.out.println("Size is MAtching and material is matching");
					return true;
				}else {
					System.err.println("NOt matching size & material");
				}
			}
		}else {
			System.err.println("ref is not matching");
		}
		
		
		return false;
	}
	
	
	
	public char getSize() {
		return size;
	}


	public void setSize(char size) {
		this.size = size;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public SockMaterial getMat() {
		return mat;
	}


	public void setMat(SockMaterial mat) {
		this.mat = mat;
	}
	
	
}


