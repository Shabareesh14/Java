/*import java.util.Scanner;
class Array{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] marks = new int[10];
		
		for(int i = 0; i < 10; i++){
			marks[i] = scan.nextInt();			
		}
		
		for(int i = 0; i <10; i++){
			System.out.println(marks[i]);
		}
	}
}*/

/*class Array{
	public static void main(String[] args){
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < 10; i++){
			System.out.println(scores[i]);
		}
	}
}*/

import java.util.Scanner;
class Array{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int table = sc.nextInt();
		
		for(int i = 1; i <= table; i++){
			System.out.println(i+"x"+table+"="+i*table);
		}
	}
}