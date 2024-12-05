/*import java.util.Scanner;
public class CodeChallenge4{
	
	void oddreven(int num){
		if(num%2==0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		CodeChallenge4 c = new CodeChallenge4();
		c.oddreven(num);
		
	}
}*/

/*import java.util.Scanner;
public class CodeChallenge4{
	
	String passorfail(int num){
		if(num > 35){
			return "Pass";
		}else{
			return "Fail";
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		CodeChallenge4 c = new CodeChallenge4();
		String passorfail = c.passorfail(num);
		
		System.out.println(passorfail);
	}
}*/

import java.util.Scanner;
public class CodeChallenge4{
	
	String getchocolate(int num){
		if(num<25){
			return "Buy Chocolate";
		}
		else{
			return "Don't Buy Chocolate";
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); 
		
		CodeChallenge4 sn = new CodeChallenge4();
		String Chocolate = sn.getchocolate(num);
		System.out.println(Chocolate);
	}
}