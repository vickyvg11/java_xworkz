class Movie{
	public static void  entertain(double ticketPrice, float movieLength,String movieName,double movieRating,String actors[]) {
	
	System.out.println("ticket price:"+ticketPrice);
	System.out.println("Duration of Movie:"+movieLength);
	System.out.println("Name of the Movie:"+movieName);
	System.out.println("Ratings of the Movie:"+movieRating);
	
	for (int actorName=0; actorName<actors.length;){
	
	String actor= actors[actorName];
System.out.println("The actors of this Movie:"+actor);	
	actorName++;
	}

	
	}
	
}