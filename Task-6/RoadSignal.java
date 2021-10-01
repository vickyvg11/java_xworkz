class RoadSignal{

public static void pass(String signal){
	
	if (signal=="red")
	{
	System.out.println("Stop ...!!!!");
	return;
	}
	else if (signal == "yellow")
	{
	System.out.println("Ready aaga pa...!!!");
	return;
	}
	else
	{
	System.out.println("Go...!!!");

	}
	
	System.out.println("Printing the Road Signals...!!!");
}
	
}