class BooleanWrapper{

	public static void main (String...values){
	
		String turnOn= "true";
		boolean laptopOn = Boolean.parseBoolean(turnOn);
		System.out.println(laptopOn);
		
		String doorOpen = "false";
		boolean mainDoor= Boolean.parseBoolean(doorOpen);
		System.out.println(mainDoor);
		
		String motorOn = "true";
		boolean motor = Boolean.parseBoolean (motorOn);
		System.out.println(motor);
		
		String cookerWhistle = "true";
		boolean pressureCooker= Boolean.parseBoolean(cookerWhistle);
		System.out.println(pressureCooker);
		
		String trimmerOff = "false";
		boolean powerOff = Boolean.parseBoolean(trimmerOff);
		System.out.println(powerOff);
	}}