class WrapperChar{	
	
public static void main (String...value)	{
	
	
	//charcter constructor
	 char alphabet = 'V';
	 Character letter = new Character(alphabet);
	 System.out.println(letter);
	 
	 //character method
	 
	 //char count
	 int pen = 59;    
     int charCnt = Character.charCount(pen);  
     System.out.println("char count:"+charCnt);//Check the number of char values needed and print the values.  
     
	 //codePointAt
     String input = "This is the first program for the given method"; 
	 int index = 4;  
     System.out.println(input.codePointAt(index));  
     
	 //codePointAt
     System.out.println(input.codePointAt(index));
     
	 //codePointBefore
     int res = input.codePointBefore(1);  
	 System.out.println(res);

     //codePointCount
     CharSequence seq = "Hello";    
     int offset = 2; // Declare offset. 
     int countValue = 4; // Declare count.       
     int result1 = Character.codePointCount(seq, offset, countValue);    
     System.out.println("The result is given as: " + result1);

     //compare
     char firstValue = 'V';  
     char secondValue = 'J'; 
     System.out.println(Character.compare(firstValue, secondValue));
	 
	 //equals
     Character charValue = new Character('A');  
	 Object  objValue = new Character('A');  
     if (charValue.equals(objValue)) {  
     System.err.println("They are equal.");  
      }  
     else {  
     System.err.println("They are not equal.");  
     } 
     
	 //compareTo
     Character firstVal = new Character('g');  
     Character secondVal = new Character('G');  	 
     int compare1= firstVal.compareTo(secondVal);
	 System.out.println(compare1);
	 
	 //codepoint
     int codepoint = 00;       
     String output = Character.getName(codepoint);// Get the Unicode name of the specified character codePoint  
     System.err.println("The first character '" + (char)codepoint + "' has the unicode name as: " + output);
	 
}	 
	 }