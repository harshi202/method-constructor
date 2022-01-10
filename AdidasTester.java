class AdidasTester{
	public static void main(String [] args){
		Adidas adidas = new Adidas("trackpant",2999,"one","black",10);
    System.out.println("type :"+adidas.type +"\tprice : "+ adidas.price +"\tbrand:"+ adidas.brand +"\tcolour : "+ adidas.colour +"\ttax : "+ adidas.tax);
    adidas.price = 3000;
	System.out.println("type :"+adidas.type +"\tprice : "+ adidas.price +"\tbrand:"+ adidas.brand +"\tcolour : "+ adidas.colour +"\ttax : "+ adidas.tax);
	
    Adidas adi = new Adidas("flipflop",1699,"one","black", 10);
    System.out.println("type :"+adi.type +"\tprice : "+ adi.price +"\tbrand:"+ adi.brand +"\tcolour : "+ adi.colour +"\ttax : "+ adi.tax);
	
	Adidas adi1 = new Adidas("shoes",2000,"one","black",10);
	System.out.println("type :"+adi1.type +"\tprice : "+ adi1.price +"\tbrand:"+ adi1.brand +"\tcolour : "+ adi1.colour +"\ttax : "+ adi1.tax);
	
	Adidas adidasTshirts = new Adidas("shirts",1200,"one","black",10);
	System.out.println("type :"+adidasTshirts.type +"\tprice : "+ adidasTshirts.price +"\tbrand : "+ adidasTshirts.brand +"\tcolour : "+ adidasTshirts.colour +"\ttax : "+ adidasTshirts.tax);
	
	Adidas jocket = new Adidas ("leather jocket",6000,"one","black",10);
	System.out.println("type :"+jocket.type +"\tprice : "+ jocket.price +"\tbrand:"+ jocket.brand +"\tcolour : "+ jocket.colour +"\ttax : "+ jocket.tax);
	
	Adidas BAT = new Adidas("cricket BAT",15000,"one","black",10);
	System.out.println("type :"+BAT.type +"\tprice : "+ BAT.price +"\tbrand:"+ BAT.brand +"\tcolour : "+ BAT.colour +"\ttax : "+ BAT.tax);

	
	} 


}