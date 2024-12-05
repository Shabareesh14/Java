/*public class Parameter{
	void getChocolate(int money){
		System.out.println(money);
		System.out.println("Chocolate Purchased");
	}
		
	void getPowder(int money){
		System.out.println(money);
		System.out.println("Powder Purchased");
	}
	
	public static void main(String[] args){
		Parameter obj = new Parameter();
		obj.getChocolate(50);
		obj.getPowder(200);
	}
}*/

public class Parameter{
	void sum(int a,int b){
			System.out.println(a+b);
		}
	void sub(int a,int b){
			System.out.println(a-b);
		}	
	void mul(int a,int b){
			System.out.println(a*b);
		}
	void div(int a,int b){
			System.out.println(a/b);
		}		
	public static void main(String[] args){
		Parameter Sum = new Parameter();
		Sum.sum(80,40);
		Sum.sub(80,40);
		Sum.mul(80,40);
		Sum.div(80,40);
	}
}