package com.xworkz.outlook.dto.child;

public class OutLookRunner {

	public static void main(String[] args) {
		
		OutLookDTO lookDTO = new OutLookDTO();
		lookDTO.setBackUp(true);
		lookDTO.setCloudStorage(15.00);
		lookDTO.setEmailID("vicky@gmail.com");
		lookDTO.setFree(true);
		lookDTO.setNoOfEmailPerDay(200);
		lookDTO.setStorageSize(30.00);
		
		
		System.out.println(lookDTO.getCloudStorage());
		System.out.println(lookDTO.getEmailID());
		System.out.println(lookDTO.getNoOfEmailPerDay());
		System.out.println(lookDTO.getStorageSize());
		System.out.println(lookDTO.isBackUp());
		System.out.println(lookDTO.isFree());
	}

}
