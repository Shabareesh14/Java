// Swap Two Numbers
/*class L2Program{
	public static void main(String[] args){
		int a = 10;
		int b = 5;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("A : "+ a);
		System.out.println("B : "+ b);
	}
}*/

//Fibanocci In Recursion
class L2Program{
	public static int fibanocci(int n){
		if(n <= 1) return n;
		return fibanocci(n - 1) + fibanocci(n - 2);
	}
	public static void main(String[] args){
		int n = 10;
		for(int i = 0; i < n; i++){
			System.out.println(fibanocci(i) + " ");
		}
	}
}