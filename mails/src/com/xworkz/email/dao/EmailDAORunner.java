package com.xworkz.email.dao;

import com.xworkz.email.dto.parent.EmailDTO;
import com.xworkz.gmail.dto.subclass.GmailDTO;
import com.xworkz.outlook.dto.child.OutLookDTO;

public class EmailDAORunner {

	public static void main(String[] args) {

		EmailDAO dao = new EmailDAO();

		EmailDTO emailDTO = new EmailDTO("vikrant@yahoo.com",15.00,true,200);

		dao.save(emailDTO);


		OutLookDTO outLookDTO = new OutLookDTO(15.00,false,"xworkz@gmail.com",20.00,true,250);

		dao.save(outLookDTO);


		GmailDTO gmailDTO = new GmailDTO("Red",true,"ODC@gmail.com",10.00,true,100);
		dao.save(gmailDTO);

		dao.displayEmailDetails();
		
		dao.displayOutLookDetails();
		
		dao.displayGmailDetails();
		
	}

}
