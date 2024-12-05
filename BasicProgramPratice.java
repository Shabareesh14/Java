								//Swap Two numbers Without Third Variables 
/*public class BasicProgramPratice{
	public static void main(String[] args){
		int a = 10;
		int b = 5;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Value of A: "+a);
		System.out.println("Value of B: "+b);
	}
}*/

								//Fibanocci Series

/*public class BasicProgramPratice{
	public static void main(String[] args){
		int n = 10;
		int t1 = 0, t2 = 1;
		System.out.println("Fibanocci Series:");
		for(int i = 0; i <= n; i++){
			System.out.println(" "+t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println();
	}
}*/

								//ArmStrong Numbers

/*public class BasicProgramPratice{
	public static void main(String[] args){
		int num = 1670;
		int sum = 0 ,temp = num;
		
		while(temp > 0){
			int digit = temp%10;
			sum += digit * digit * digit;
			temp /= 10;
		}
		if(sum == num){
			System.out.println(num+ " is a ArmStrong Number");
		}
		else{
			System.out.println(num+ " Not a ArmStrong Number");
		}
	}
}*/

									//Prime or not

/*public class BasicProgramPratice{
	public static void main(String[] args){
		int n = 19;
		if(n <= 1){
			System.out.println("Not Prime");
			return;
		}
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n%i==0){
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
	}
}*/

									//Palindrome Number
									
	/*public class BasicProgramPratice{
		public static void main(String[] args){
			int num = 121;
			int reverseNum = 0; 
			int temp = num;
			while(temp > 0){
				int digit = temp % 10;
				reverseNum  = reverseNum * 10 + digit;
				temp /= 10;
			}
			if(reverseNum == num){
				System.out.println(num+ " Palindrome");
			}
			else{
				System.out.println(num+ " Not Palindrome");
			}
		}
	}*/
	
									// String reverse
									
public class BasicProgramPratice{
	public static void main(String[] args){
		char[] s = {'H','e','l','l','o'};
		int left = 0;
		int right = s.length - 1;
		
		while(left < right){
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
		System.out.println();
	}
}

											//String reverse 3

/*class Main{
    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        s = s.trim();
        
        String[] words = s.split(" // ");
        StringBuilder reverse = new StringBuilder();
        
        for(int i = 0; i < words.length; i++){
            
            StringBuilder reversed = new StringBuilder(words[i]).reverse();
            reverse.append(reversed);
            
            if(i < words.length-1){
                reversed.append(" ");
            }
        }
        System.out.println(reverse);
    }
}*/