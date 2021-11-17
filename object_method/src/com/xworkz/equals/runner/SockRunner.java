package com.xworkz.equals.runner;

import com.xworkz.equals.object_method.Sock;
import com.xworkz.equals.object_method.SockMaterial;

public class SockRunner {

	public static void main(String[] args) {

		Sock sock = new Sock();
		sock.setMat(SockMaterial.WOOLEN);
		sock.setPrice(300);
		sock.setSize('M');
		
		Sock sock1 = new Sock();
		sock.setMat(SockMaterial.NYLON);
		sock.setPrice(350);
		sock.setSize('S');
		
		if(sock==sock1) {
			System.out.println("To pinting to same memoery");
		}
		
		boolean same = sock.equals(sock1);
		{
			System.out.println(same);
		}
		
	}

}
