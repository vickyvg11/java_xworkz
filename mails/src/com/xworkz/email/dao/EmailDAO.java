package com.xworkz.email.dao;

import com.xworkz.email.dto.parent.EmailDTO;
import com.xworkz.gmail.dto.subclass.GmailDTO;
import com.xworkz.outlook.dto.child.OutLookDTO;


public class EmailDAO {

	EmailDTO[] mails = new EmailDTO[6];
	int count = 0;
	private OutLookDTO outLook;
	private GmailDTO gmailDTO;
	
	public EmailDAO() {
		System.out.println("Invoked no args of Email DAO");
		
	}
	
	
	public void save (EmailDTO emaildto) {
		if(emaildto !=null && this.count<this.mails.length) {
			this.mails[count]= emaildto;
			System.out.println("Email is Saved");
			count++;
		}else {
			System.err.println("Email is Full ");
		}
	}
	
	
	
	public void save (OutLookDTO outDTO) {
		System.out.println("Invoked OutlookDTO");
		if (outDTO!= null && this.count<this.mails.length) {
			this.mails[count] =outDTO;
			count++;
			System.out.println("Outlook is inovked");
		}else {
			System.err.println("Full");
		}
	}
	
	
	public void save (GmailDTO gmailDTO) {
		if (gmailDTO!= null && this.count<this.mails.length) {
			this.mails[count] =gmailDTO;
			count++;
			System.out.println("Gmail is inovked");
		}else {
			System.err.println("Full");
		}
	}
	
	
	public void  displayEmailDetails() {
		for (int msg= 0;msg<this.mails.length;msg++) {
			EmailDTO check=this.mails[msg];
				if (check!=null) {
					System.out.println(String.valueOf(getClass()).concat(" ").concat(String.valueOf(check.getEmailID())).concat(" ").concat(String.valueOf(check.getStorageSize()).concat(" ")).concat(String.valueOf(check.getNoOfEmailPerDay())));
				}
					
				else {
					System.err.println("Invoked Error");
				}
			}
		}
	
	
	
	public void displayOutLookDetails() {
		for (int display=0; display<this.mails.length;display++) {
			
			System.out.println(outLook.getCloudStorage());
			System.out.println(outLook.isBackUp());
			OutLookDTO valley = (OutLookDTO)this.mails[display];
			if(valley!=null) {
				System.out.println(String.valueOf(outLook.getCloudStorage()).concat(" ").concat(String.valueOf(outLook.isBackUp())));
			}else {
				System.err.println("Invoked Error in Display Details");
			}
		}
			
	}
	
	public void displayGmailDetails() {
		for (int gmail=0;gmail<this.mails.length;gmail++) {
			System.out.println(gmailDTO.getThemeColor());
			System.out.println(gmailDTO.isSubscribed());
			GmailDTO valley1 = (GmailDTO)this.mails[gmail];
			if(valley1!=null) {
				System.out.println(String.valueOf(gmailDTO.getThemeColor()).concat(" ").concat(String.valueOf(gmailDTO.isSubscribed())));
			}else {
				System.err.println("Invoked Error in Display Gmail Details");
			}
		}
	}
}
