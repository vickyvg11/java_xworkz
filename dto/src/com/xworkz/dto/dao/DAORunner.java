package com.xworkz.dto.dao;

import com.xworkz.dto.*;
public class DAORunner {

	public static void main(String[] args) {
		
		BluetoothDao dao = new BluetoothDao();
		
		Bluetooth bluetooth = new Bluetooth("OnePlus","Black",1800,60);
		dao.add(bluetooth);
		
		Bluetooth bluetooth1 = new Bluetooth("Samsung","red",1100,70);
		dao.add(bluetooth1);
		
		dao.delete(1);
		
		
		CementDao dao2 = new CementDao();
		
		Cement cmt1 = new Cement("JSW",400,25,true,true);
		dao2.add(cmt1);
	}

}
