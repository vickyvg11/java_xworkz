package com.xworkz.email.dto.parent;

public class EmailRunner {

	public static void main(String[] args) {

			EmailDTO emailDTO = new EmailDTO();
			emailDTO.setEmailID("xworkz@gmail.com");
			emailDTO.setFree(true);
			emailDTO.setNoOfEmailPerDay(150);
			emailDTO.setStorageSize(15);
			
			
			
			System.out.println(emailDTO.getEmailID());
			System.out.println(emailDTO.isFree());
			System.out.println(emailDTO.getNoOfEmailPerDay());
			System.out.println(emailDTO.getStorageSize());
			
			
	}

}
