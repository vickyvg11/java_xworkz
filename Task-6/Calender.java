class Calender {

	public static int getBirthMonth(String personName){

	if (personName== "Narendra Modi")
	{
	return 9;
	}
	else if (personName== "Atal Bhiari Vajpayee")
	{
	return 12;
	}
	else if (personName== "L K Advani")
	{
	return 5;
	}	
	else if (personName== "Amith Shah")
	{
	return 2;
	}
	else {
		return 1;
	}
	}
	public static String getBirthDay(String personName){
	if (personName== "Narendra Modi")
	{
	return "Monday";	
	}
	else if (personName== "Atal Bhiari Vajpayee")
	{
	return "Tuesday";	
	}
	else if (personName== "L K Advani")
	{
	return "Thursday";	
	}
	else if (personName== "Amith Shah")
	{
	return "Friday";	
	}
	else
	{
	return "Sunday";	
	}
}

	
	
	

}