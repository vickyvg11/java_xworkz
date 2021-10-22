class WrapperFloat{

public static void main (String...value){



	//float constructor
	 float pencilPrice = 7.2f;
	 Float pencilMoney = new Float(pencilPrice);
	 System.out.println(pencilMoney);
	 
	 String pillowPrice = "25.18f";
	 Float pillowMoney = new Float(pillowPrice);
	 System.out.println(pillowMoney);
	 
	 //float method
	 //compare
	 int floatCompare=Float.compare(pencilPrice , pillowMoney); 
	 System.out.println(floatCompare);
	 
	 //doubleValue
	 double doubleObj= pillowMoney.doubleValue();  
     System.out.println("New value is = "+doubleObj); 
	 
	 //byte and int value()
	 Float float1= new Float("10");  
     Float float2=new Float("50.44"); 
     byte b1=float1.byteValue();  
     byte b2=float2.byteValue();  
     int d= b1+b2;  
     System.out.println("Sum = " +d); 
 	 
	 //floatToIntBits
	 System.out.println("  Equivalent integer bits = "+Float.floatToIntBits(float1));
     
	 //floatToRawIntBits
     Float object1 = 0.0f/0.0f;  
     System.out.println(object1 + " value in Raw int bits = " + Float.floatToRawIntBits(object1));
	 
     //floatValue
     System.out.println("Result after being converted to float value = "+float1.floatValue());
     
	 //intBitsToFloat
     int intVal1=76;  
     Float f2=Float.intBitsToFloat(intVal1);  
     System.out.println("Float value after conversion = "+f2);
     
	 //intValue
     int multiplication = float1.intValue()*float2.intValue();
  	 System.out.println("multiplication = " +multiplication);
     
	 //isFinite
     System.out.println(Float.isFinite(float2));
	 
	 
	 
	 
}	 
	 
}	 