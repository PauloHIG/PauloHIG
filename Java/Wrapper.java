public class Wrapper {
	public static void main(String[]args){
	//jeito normal
	double money = 1.99;
	
	//wrapper
	Double preco = new Double("100.00");//Essas aspas<-
	//conversão possivel com wrapper
	double d = preco.doubleValue();
	int in = preco.intValue();
	byte b = preco.byteValue();
	
	boolean rico = false;
	
	Boolean mlmrr = new Boolean("true");//Também pode ser ("yes")
	//Conversão estática
	double d1 = Double.parseDouble("123.45");
	int i1 = Integer.parseInt("123");
	
	int i2 = Integer.valueOf("101011",2);
	
	System.out.println("101011, é ");
	System.out.print(i2);
	}



}