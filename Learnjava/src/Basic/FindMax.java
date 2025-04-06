package Basic;
import java.util.*;

public class FindMax {
	public static int findMax(List<Integer> numbers) {
		if(numbers == null || numbers.isEmpty()){
			System.out.println("List cannot be null or empty");
			
		}
		int max = numbers.get(0); //assume first number is maximum initially
		for(int i=1; i<numbers.size(); i++) {
			int current = numbers.get(i);
			if (current > max) {
				max = current; // update max if current is greater
			}
		}
		return max;
	}

	
public static void main(String[] args) {
	List<Integer> numbers = List.of(10, 5, 20, 15, 30);
    int maxNumber = findMax(numbers);
    System.out.println("Maximum number in the list: " + maxNumber);
}
}
