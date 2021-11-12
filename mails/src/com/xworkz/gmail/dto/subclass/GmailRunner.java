package com.xworkz.gmail.dto.subclass;

public class GmailRunner {

	public static void main(String[] args) {
		
		
		GmailDTO gmailDTO = new GmailDTO();
		
		gmailDTO.setEmailID("star@gmail.com");
		gmailDTO.setFree(false);
		gmailDTO.setNoOfEmailPerDay(100);
		gmailDTO.setStorageSize(100.00);
		gmailDTO.setSubscribed(true);
		gmailDTO.setThemeColor("Black");
		
		System.out.println(gmailDTO.getEmailID());
		System.out.println(gmailDTO.getNoOfEmailPerDay());
		System.out.println(gmailDTO.getStorageSize());
		System.out.println(gmailDTO.getThemeColor());
		System.out.println(gmailDTO.isFree());
		System.out.println(gmailDTO.isSubscribed());

	}

}
