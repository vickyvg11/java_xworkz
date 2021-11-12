package com.xworkz.outlook.dto.child;

import com.xworkz.email.dto.parent.EmailDTO;

public class OutLookDTO extends EmailDTO{

	private double cloudStorage;
	private boolean backUp;

	public OutLookDTO() {
		System.out.println("No args Constructor");

	}

	public OutLookDTO(double cloudStorage, boolean backUp,String emailID, double storageSize, boolean free, int noOfEmailPerDay) {
		super(emailID, storageSize, free,noOfEmailPerDay);
		this.cloudStorage = cloudStorage;
		this.backUp = backUp;
	}

	public double getCloudStorage() {
		return cloudStorage;
	}

	public void setCloudStorage(double cloudStorage) {
		this.cloudStorage = cloudStorage;
	}

	public boolean isBackUp() {
		return backUp;
	}

	public void setBackUp(boolean backUp) {
		this.backUp = backUp;
	}


}
