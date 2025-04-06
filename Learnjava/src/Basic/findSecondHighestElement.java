package Basic;

public class findSecondHighestElement {
	public static void main(String[] args) {
		int[] arr = {2,5,4,8,9};
		int number = findNumber(arr);
		System.out.println(number);
		
	}

public static int findNumber(int[] arr) {
	int largest = Integer.MIN_VALUE;
	int secondlargest = Integer.MIN_VALUE;
	int length = arr.length;

	for(int i =0; i<length; i++) {
		if(arr[i]>largest) {
			secondlargest = largest;
			largest = arr[i];
		}
		else if(arr[i]>secondlargest && arr[i]!=largest){
			secondlargest = arr[i];
			
		}
		
	}
	return secondlargest;
	
	
}

}
