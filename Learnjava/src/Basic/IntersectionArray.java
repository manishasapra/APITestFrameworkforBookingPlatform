package Basic;

public class IntersectionArray {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {2,3,5,6};
		int[] result = new int[arr1.length + arr2.length];
		int c=0;
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					result[c] = arr1[i];
					c++;
					
				}
				
				
			}
		}
		for(int k=0; k<c; k++) {
			System.out.print(result[k] + ",");
			
		}
	}

}
