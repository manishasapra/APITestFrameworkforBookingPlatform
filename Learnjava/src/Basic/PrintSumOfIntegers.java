package Basic;
import java.util.*;

public class PrintSumOfIntegers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum =0;
		while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
 
        System.out.format("Sum of Digits = %d", sum);
		
		
		
	}

}
