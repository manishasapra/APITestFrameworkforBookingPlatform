package Basic;

import java.util.Arrays;

public class CheckArrayEqual {
	
	public static void main(String[] args) {
	   int[] arr1 = {1,2,3};
	   int[] arr2 = {2,2,3};
	   
	   boolean result = Arrays.equals(arr1, arr2);
	   
	   System.out.println(result);
	   
	   for(int i : arr1) {
		   System.out.println(i);
	   }
	   
	   System.out.println(Arrays.binarySearch(arr1, 2));
	   
		
	}

}
