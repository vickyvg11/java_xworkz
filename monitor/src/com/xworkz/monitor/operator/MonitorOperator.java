package com.xworkz.monitor.operator;

public class MonitorOperator {

	
public String[] store = new String[5];// instance
	int count = 0;
	
	public MonitorOperator() {
		System.out.println("No args");
	}
	
	public void display(String monitorName) {
		//System.out.println("Displaying the Monitor:"+monitorName );
		if(monitorName!=null) {
			this.store[count]=monitorName;//0
			count++;
		}
		else
			System.err.println("Monitor is NOT added to Store");
	
	}
	
	public void addAllElemnt()
	{
		for (int computer=0;computer<this.store.length;computer++)
		{
			String ref = this.store[computer];
			System.out.println(ref);
		}
	}
	
}
