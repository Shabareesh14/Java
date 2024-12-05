/*class Nestedloop{
	public static void main(String[] args){
		int star = 3;
		
		for(int i = 0; i <= star; i++){
			String step="";
			
			for(int j = 0; j <= i-1; j++){
				step += "*";
			}
			System.out.println(step);
		}	
	}
}*/

// Random Numbers	

import java.util.Random;
class Nestedloop{
	public static void main(String[] args){
		Random name = new Random();
		int newnum = 0;
		
		while(newnum!=6){
			newnum=name.nextInt(11);
			System.out.println(newnum);
		}
	}
}