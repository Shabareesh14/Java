/*class score{
	public static void main(String[] args){
		int score = 79;
		
		if(score<50){
			System.out.println("You Need to improve");
		}
		else if(score>=50 && score<=70){
			System.out.println("Good job");
		}
		else if(score>70){
			System.out.println("Excellent performance!");
		}
	}
}*/

import java.util.Scanner;
/*class score{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		int mark4 = sc.nextInt();
		int mark5 = sc.nextInt();
		
		int avg =(mark1+mark2+mark3+mark4+mark5)/5;
		
		if(avg<35){
			System.out.println("Additional class is Required");
		}
		else{
			System.out.println("You are good to go");
		}
	}
}*/

class score{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String color = scan.nextLine();
		
		if(color.equals("Red")){
			System.out.println("Stop");
		}
		else if(color.equals("Yellow")){
			System.out.println("Get Ready");
		}
		else{
			System.out.println("Go");
		}
	}
}