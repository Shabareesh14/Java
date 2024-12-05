public class mobiles{
	
	 void iphone(){
		System.out.println("This is Iphone");
		//samsung();
	}
	
	 void samsung(){
		System.out.println("This is Samsung");
	}
	
	void oppo(){
		System.out.println("This is Oppo");
	}
	
	void realme(){
		System.out.println("This is Realme");
	}
	
	public static void main(String[] args){
		mobiles m1 = new mobiles();
		m1.iphone();
		m1.samsung();	
		m1.oppo();
		m1.realme();
	} 
}