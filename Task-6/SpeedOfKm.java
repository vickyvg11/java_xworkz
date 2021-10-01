class SpeedOfKm{

	public static String speedKm(int speed){

		if (speed<40)
		{
		return "Shift to 1st gear..!!!";
		}
		else if (speed>40)
		{
		return"Shift to 2nd gear...!!!";
		}
		else if (speed>60)
		{
		return"Shift to 3rd Gear...!!!";
		}
		else if (speed >80)
		{
		return"Shift to 4th Gear...!!!";
		}
		else	
		{
		return"Stop the car...!!!";
		}
		
		}		
	}