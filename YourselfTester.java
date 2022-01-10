class YourselfTester{
	public static void main(String [] args){
		
	    Yourself im = new Yourself("brown",5.9f,"Harshith","brown","unimagination");
    System.out.println("eyes :"+im.eyes +"\thight : "+ im.hight +"\tbrand:"+ im.brand +"\tcolour : "+ im.colour +"\tspeed : "+ im.speed);
    im.hight = 5.10f;
	System.out.println("eyes :"+im.eyes +"\thight : "+ im.hight +"\tbrand:"+ im.brand +"\tcolour : "+ im.colour +"\tspeed : "+ im.speed);
	
    Yourself harshi = new Yourself("blue",5.9f,"harshi","white", "soleimagination");
    System.out.println("eyes :"+harshi.eyes +"\thight : "+ harshi.hight +"\tbrand:"+ harshi.brand +"\tcolour : "+ harshi.colour +"\tspeed : "+ harshi.speed);
	
	Yourself Royal = new Yourself("black",6.1f,"Royal","brown","ligthspeed");
	System.out.println("eyes :"+Royal.eyes +"\thight : "+ Royal.hight +"\tbrand:"+ Royal.brand +"\tcolour : "+ Royal.colour +"\tspeed : "+ Royal.speed);
	
	Yourself harshith = new Yourself("brown",5.9f,"harshith","white","cantimagin");
	System.out.println("eyes :"+harshith.eyes +"\thight : "+ harshith.hight +"\tbrand : "+ harshith.brand +"\tcolour : "+ harshith.colour +"\tspeed : "+ harshith.speed);
	
	Yourself santhu = new Yourself ("blue",5.5f,"santhu","brown","unimagination");
	System.out.println("eyes :"+santhu.eyes +"\thight : "+ santhu.hight +"\tbrand:"+ santhu.brand +"\tcolour : "+ santhu.colour +"\tspeed : "+ santhu.speed);
	
	Yourself legend = new Yourself("brown",6.2f,"legend","black","soundspeed");
	System.out.println("eyes :"+legend.eyes +"\thight : "+ legend.hight +"\tbrand:"+ legend.brand +"\tcolour : "+ legend.colour +"\tspeed : "+ legend.speed);

	
	} 


}