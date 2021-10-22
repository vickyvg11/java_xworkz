class WrapperBoolean{

public static void main (String...vlaur){

	Boolean isiMark = new Boolean(true);  

	 boolean b2;  

	b2 = isiMark.booleanValue();
	String str1 = "Value of boolean object "+isiMark+" is "+b2+""; 
	System.out.println(str1);

	boolean wifi = true;
	boolean bluetooth = false;
	if (wifi ==bluetooth)
	{
		System.out.println("boolean is :");
	}
	else 
		System.out.println("boolean is not ");


	Boolean wireless = true;
	Boolean wired = true;
	
	if (wireless=wired){
		System.out.println("the Boolean is true");
	}
	else 
		System.out.println("the booean is False");
	
	
}

}