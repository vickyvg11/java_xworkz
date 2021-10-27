package com.xworkz.monitor;

import com.xworkz.monitor.operator.MonitorOperator;

public class MonitorRunner {

	public static void main(String[] args) {


		MonitorOperator operator = new MonitorOperator();
		operator.display("LG");
		operator.display("Lenovo");
		operator.display("HP");
		operator.display("Acer");
		operator.display("Dell");
	//	operator.display("MAC");
		operator.addAllElemnt();
		
	}

}
