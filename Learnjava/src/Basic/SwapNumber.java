package Basic;

import java.util.Scanner;

public class SwapNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Numbers before swapping are: " + x + "," + y);
		
		int temp;
		
		temp = y;
		y = x;
		x = temp;
		
		System.out.println("Numbers after swapping are: " + x + "," + y);
		
		sc.close();
		
	}
	
	

}
