class SlipperRunner{


	public static void main (String...args){
	
		Slipper slip = new Slipper();
		
		String bran = slip.brand;
		String col = slip.color;
		int values= slip.price;
		int siz = slip.size;
		String mat = slip.type;
		
		System.out.println(bran);
		System.out.println(col);
		System.out.println(values);
		System.out.println(siz);
		System.out.println(mat);
	}
}