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
// class L2Program{
// 	public static int fibanocci(int n){
// 		if(n <= 1) return n;
// 		return fibanocci(n - 1) + fibanocci(n - 2);
// 	}
// 	public static void main(String[] args){
// 		int n = 10;
// 		for(int i = 0; i < n; i++){
// 			System.out.println(fibanocci(i) + " ");
// 		}
// 	}
// }

												//Distinct Character and their Count
class L2Program{
	public static void main(String[] args){
		String str = "abcdABCDabcd";
		
		StringBuilder build = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			char currentChar = str.charAt(i);
			
			if(build.indexOf(String.valueOf(currentChar)) != -1){
				continue;
			}
			
			int count = 0;
			for(int j = 0; j < str.length(); j++){
				if(str.charAt(j) == currentChar){
					count++;
				}
			}
			build.append(currentChar);
			
			System.out.println(currentChar +" : "+count);
		}
	}
}
