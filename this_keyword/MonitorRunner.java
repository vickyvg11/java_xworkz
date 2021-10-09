class MonitorRunner{

	public static void main (String...args){
	
	Monitor	monitor=new Monitor("LG");
	System.out.println(monitor);
	
	Monitor monitor1 = new Monitor(5999);
	System.out.println(monitor1);
	
	Monitor monitor2 = new Monitor(true);
	System.out.println(monitor2);
	
	Monitor monitor3 = new Monitor("Samsung",144);
	System.out.println(monitor3);
	
	Monitor monitor4 = new Monitor(24,true);
	System.out.println(monitor4);
	
	}


}