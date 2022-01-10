class FanTester{
	public static void main(String [] args){
		Fan Fan1 = new Fan("table",3000,"SRH","black",1500);
    System.out.println("type :"+Fan1.type +"\tprice : "+ Fan1.price +"\tbrand:"+ Fan1.brand +"\tcolour : "+ Fan1.colour +"\tspeed : "+ Fan1.speed);
    Fan1.price = 4500;
	System.out.println("type :"+Fan1.type +"\tprice : "+ Fan1.price +"\tbrand:"+ Fan1.brand +"\tcolour : "+ Fan1.colour +"\tspeed : "+ Fan1.speed);
	
    Fan usha = new Fan("standing",5000,"harshi","white", 1000);
    System.out.println("type :"+usha.type +"\tprice : "+ usha.price +"\tbrand:"+ usha.brand +"\tcolour : "+ usha.colour +"\tspeed : "+ usha.speed);
	
	Fan Royal = new Fan("fixing",4500,"Royal","Red",1400);
	System.out.println("type :"+Royal.type +"\tprice : "+ Royal.price +"\tbrand:"+ Royal.brand +"\tcolour : "+ Royal.colour +"\tspeed : "+ Royal.speed);
	
	Fan vajra = new Fan("table",8000,"vajra","black",4000);
	System.out.println("type :"+vajra.type +"\tprice : "+ vajra.price +"\tbrand : "+ vajra.brand +"\tcolour : "+ vajra.colour +"\tspeed : "+ vajra.speed);
	
	Fan vgaurd = new Fan ("standing",2900,"vgaurd","blue",1050);
	System.out.println("type :"+vgaurd.type +"\tprice : "+ vgaurd.price +"\tbrand:"+ vgaurd.brand +"\tcolour : "+ vgaurd.colour +"\tspeed : "+ vgaurd.speed);
	
	Fan legend = new Fan("sealing",8000,"legend","orange",1000);
	System.out.println("type :"+legend.type +"\tprice : "+ legend.price +"\tbrand:"+ legend.brand +"\tcolour : "+ legend.colour +"\tspeed : "+ legend.speed);

	
	} 


}