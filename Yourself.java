class Yourself{
	String eyes ;
	float hight;
	String brand;
	String colour;
	String  speed;
	Yourself(){
		System.out.println("calling yourself default constructor");
		System.out.println();
	}
	
	Yourself(String eyesH, float hightH, String brandH, String colourH,String speedH){
		eyes = eyesH;
		hight = hightH;
		brand = brandH;
		colour = colourH;
		speed = speedH;
		System.out.print("Excecuted the Contructor yourself( String, float, String, String,String) ");
		
	}
	
		Yourself(String eyesH, float hightH){
		
		eyes = eyesH ;
		hight = hightH;
		System.out.print("Excecuted the Contructor yourself( String, int) ");
	
	}
	
	
	
}