class StringConstructor{

	public static void main (String...power){
	
		String company = "X-workz";
		System.out.println("By Using Literal way:"+company);
		
		String company1 = "Trainer";
		System.out.println("By Using Literal way:"+company1);
	
		
	
		String s1 = new String();
		System.out.println("NO arguments"+s1);
	
		//String st = new String(String str);
		String s2 = new String("Hello welcome to Java class");
		System.out.println(s2);
	
		//String str = new String(char char[])
		char chars[ ] = { 'J', 'A', 'V', 'A' };
		String s3 = new String(chars);
		System.out.println("creates a string object and stores the array of characters: " + s3);
		
		
		
		//String s4 = new String(char chars[ ], int startIndex, int count);
		char bng[ ] = { 'B', 'a', 'n', 'g','l', 'o', 'r', 'e'  };
		String s4 = new String(bng, 1, 5);
		System.out.println(s4);
		//The argument startIndex specifies the index at which the subrange begins and count specifies the number of characters to be copied.
	
		byte b[] = { 97, 90,100 };// Range of bytes: -128 to 127. These byte values will be converted into corresponding characters. 
		String ascii = new String(b); 
		System.out.println(ascii); 
	
		
	}



}