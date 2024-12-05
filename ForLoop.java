/*class ForLoop{
	public static void main(String[] args){
		int num = 5;
		for(int i = 0; i <= num; i++){
			String step =  " ";
			
			for(int j = 0; j<num-i-1; j++){
				step+=  "";
			}
			
			for(int j = 0; j < i; j++){
				step += "* ";
			}
				System.out.println(step);
		}
	}
}*/

/*import java.util.Scanner;
class ForLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Number:");
		int num1 = sc.nextInt();
		System.out.println("Second Number:");
		int num2 = sc.nextInt(); 		
		int oddCount = 0;
		
		for(int i = num1; i <= num2; i++){
			if(i%2==0){
				//System.out.println("Even Numbers:"+i);
			}
			else{
				oddCount = oddCount+1;
				//System.out.println("Odd Numbers:"+i);
				System.out.print("oddCount");
				System.out.println(oddCount);
			}
		}
	}
}*/

import java.util.Scanner;
class ForLoop{
	public static void main(String[] args){
		Scanner range = new Scanner(System.in);
		
		System.out.println("Number1:");
		int num1 = range.nextInt();
		
		System.out.println("Number2:");
		int num2 = range.nextInt();
		int count=0;
			for(int i = num1; i <= num2; i++){
				if(i%3==0 && i%5==0){
					count++;
					System.out.println("Divisible by both 3 and 5:"+i);
				}
			}
			System.out.println("Count:"+count);
	}
}