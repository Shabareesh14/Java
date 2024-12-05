import java.util.Arrays;
/*public class ArrayPratice{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(" "+arr[i]);
		}
	}
}*/

/*public class ArrayPratice{
	public static void main(String[] args){
		int[] arr = {12,34,98,1,65,45};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
			else if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("Max Number:"+max);
		System.out.println("Min Number:"+min);
	}
}*/

/*public class ArrayPratice{
	public static void main(String[] args){
		int[] arr = {12,34,56,76,45};
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];	
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("ReverseAnArray:"+Arrays.toString(arr));
	}
}*/

/*public class ArrayPratice{
	public static void main(String[] args){
		int[] arr = {15,45,85,95,45,25};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		System.out.println(sum);
	}
}*/

//Array Left Rotate

/*public class ArrayPratice{
	public static void main(String[] args){
		int[] arr = new int[] {1,2,3,4,5};
		int n = 3;
		
		for(int i= 0; i < n; i++){
			int first=arr[0],j;
			
			for(j = 0; j < arr.length-1; j++){
				arr[j] = arr[j+1];
	}
	arr[j]=first;
}			
				System.out.print(Arrays.toString(arr)+" ");	
}
}*/