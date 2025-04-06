package Basic;

public class FindMaxMin {
	public static void main(String[] args) {
		int[] arr1 = {2,4,1,3,6,5,8};
		int max = 0;
		int min=0;
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]>max) {
				max = arr1[i];
				
			} if(arr1[i]<min){
				min = arr1[i];
				
			}
			
		}
		System.out.println(max);
		System.out.println(min);
		
		
	}

}
