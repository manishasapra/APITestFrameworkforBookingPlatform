package Basic;

public class DuplicateNumberArray {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,1,2};
		
		for(int i=0; i<arr1.length-1; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[j]);
					
				 }
			}
		}
	}

}
