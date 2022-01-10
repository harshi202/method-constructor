class Adidas{
	
	String type;
	int price;
	String brand;
	String colour;
	long  tax;
	Adidas(){
		System.out.println("calling Adidas default constructor");
		System.out.println();
	}
	
	Adidas(String typeof, int priceof, String brandof, String colourof,long taxof){
		type = typeof;
		price = priceof;
		brand = brandof;
		colour = colourof;
		tax = taxof;
		System.out.print("Excecuted the Contructor Fan( String, int, String, String,long) ");
		
	}
	
		Adidas(String typeof, int priceof){
		
		type = typeof ;
		price = priceof;
		System.out.print("Excecuted the Contructor Adidas( String, int) ");
	
	}
	
	
	
}