package com.xworkz.gmail.dto.subclass;

import com.xworkz.email.dto.parent.EmailDTO;

public class GmailDTO extends EmailDTO {

	private String themeColor;
	private boolean subscribed;

	public GmailDTO() {
		System.out.println("No args Constructor of GmailDTO");
	}



	public GmailDTO(String themeColor, boolean subscribed,String emailID, double storageSize, boolean free, int noOfEmailPerDay) {
		super(emailID, storageSize, free, noOfEmailPerDay);
		this.themeColor = themeColor;
		this.subscribed = subscribed;
	}



	public String getThemeColor() {
		return themeColor;
	}

	public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}


}
