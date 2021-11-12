package com.xworkz.dto.dao;


import com.xworkz.dto.Cement;

public class CementDao {
	
	
	private Cement[] store = new Cement[5];
	int items;
	
	public CementDao() {
		
	}

	
	public void add (Cement cement) {
		if(this.items<this.store.length && store!=null) {
			this.store[items] = cement;
			items++;
			System.out.println("Added to Store:".concat(" ").concat(String.valueOf(this.store)));
		}
		else {
			System.err.println("Not Added or full");
		}
		
	}
}
