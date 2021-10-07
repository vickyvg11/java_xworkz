class TrainRunner{

	public static void main (String...args){
	
	Train train=new Train();
	
	train.noOfCoaches= 10;
	train.type= "AC Coaches";
	System.out.println(train.name);
	System.out.println(train.trainNo);
	System.out.println(train.type);
	System.out.println(train.noOfCoaches);
	System.out.println(train.noHalt);
	
	
	}
}