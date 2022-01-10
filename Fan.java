class Fan{
	String type ;
	int price;
	String brand;
	String colour;
	long  speed;
	Fan(){
		System.out.println("calling Adidas default constructor");
		System.out.println();
	}
	
	Fan(String typeH, int priceH, String brandH, String colourH,long speedH){
		type = typeH;
		price = priceH;
		brand = brandH;
		colour = colourH;
		speed = speedH;
		System.out.print("Excecuted the Contructor Fan( String, int, String, String,long) ");
		
	}
	
		Fan(String typeH, int priceH){
		
		type = typeH ;
		price = priceH;
		System.out.print("Excecuted the Contructor Fan( String, int) ");
	
	}
	
	
	
}
	
	
	
	
	
