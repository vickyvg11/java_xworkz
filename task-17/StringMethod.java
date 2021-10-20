class StringMethod{

		public static void main (String...power){
			
		String company = new String("Xworkz");
		String location = new String("BTM");
		String course = new String(" full Stack ");
		String courseFee = new String("25");
		String founder = new String ("OMKAR");
		String hr=new String ("Akashara AP");
		String trainer = new String ("Vinay");
		String subject = new String("JAVA,WEB,SQL,JDBC,SPRING");
		String batch = new String ("July");
		String frontEnd = new String("Nikunj");
		

		//System.out.println(loc)

		char cm = company.charAt(3);
		System.out.println("CharAT method: "+cm);
		
		boolean loc = location.contains("Rajajinagar");
		System.out.println(loc);
			
		boolean location1 = location.contains("BTM");
		System.out.println(location1);
		
		String upperCase = course.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = founder.toLowerCase();
		System.out.println(lowerCase);
		
		boolean equals = courseFee.contentEquals("25");
		System.out.println(equals);
		
		String concating = course.concat("develpoment");
		System.out.println(concating);
		
		String replaceing = batch.replace('J','p');
		System.out.println(replaceing);
		
		
		
		
		
		
		
		}
	

		



}
