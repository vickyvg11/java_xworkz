class Stablizer{
	String name;
	int price;
	String color;
	int voltage;
	String usedFor;
	
	Stablizer (String name,int price){
		System.out.println("the Stablizer :"+name);
		System.out.println("the Stablizer:"+price);
		this.name= name;
		this.price=price;
	}
	
	Stablizer(int voltage,String color){
			System.out.println("the Stablizer color is :"+color);
			System.out.println("The Stablizer voltage is;"+voltage);
			this.color = color;
			this.voltage=voltage;
			}
	Stablizer (String usedFor){
		System.out.println("the String constructor is invoked");
		this.usedFor=usedFor;
	}
	Stablizer(String usedFor, String color,String name){
		System.out.println("the String is invoked:"+usedFor);
		System.out.println("the String is invoked:"+color);
		System.out.println("the String is invoked:"+name);
		this.usedFor=usedFor;
		this.color=color;
		this.name=name;
	}		
	Stablizer (int voltage,int price){
		System.out.println("the int constructor is invoked"+voltage);
		System.out.println("the int constructor is invoked"+price);
		this.voltage=voltage;
		this.price=price;
	}
	
	}
	