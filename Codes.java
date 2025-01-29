/*class Codes{
	public static void main(String[] args){
		int n = 3;
		int m = 10;
		
		if(n <= 0 || m <= 0){
			System.out.println("Invalid");
		}
		
		int sum = 0;
		for(int i = n; i < m; i += n){
			sum += i;
		}
		System.out.println(sum);
	}
}*/

/*class Codes{
	public static void main(String[] args){
		String str = "abcdefghijklmnopqrsruvwxyz";
		char letter = 'p';
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == letter){
				System.out.println("Position of the alphabet:" +(i+1));
				break;
			}
		}
	}
}*/

/*import java.util.Arrays;
import java.util.Collections;
class Codes{
	public static void main(String[] args){
		Integer arr[] = {2,1,10,67};
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int sum = 0;
		for(int i = 0; i < arr.length-1; i++){
			sum += arr[i] - arr[i+1];
		}
		System.out.println(sum);
	}
}*/

// import java.util.Arrays;
// import java.util.Collections;

// class Codes{
// 	public static void main(String[] args){
// 		Integer arr[] = {10,14,2,23,99};
		
// 		Arrays.sort(arr,Collections.reverseOrder());
		
// 		int sum = 0;
// 		sum += arr[0] + arr[1];
		
// 		System.out.println(sum);
// 	}
// }

// class Main {
//     public static void main(String[] args) {
//         int n = 2342657;
//         if(n<=1){
//             System.out.println("Not Prime");
//             return;
//         }
//         for(int i = 2; i < Math.sqrt(n); i++){
//             if(n%i==0){
//                 System.out.println("Not Prime");
//                 return;
//             }
//         }
//         System.out.println("Prime");
//     }
// }

class Main {
    public static void main(String[] args) {
        int n = 2342657;
        int c = 2;
        
        while(c < Math.sqrt(n)){
            if(n%c==0){
                System.out.println("Not Prime");
                return;
            }
            c = c+1;
        }
        System.out.println("Prime");
    }
}
