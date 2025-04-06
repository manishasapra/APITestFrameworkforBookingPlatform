package Basic;

import java.util.Scanner;

public class CheckArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		int x = num;
		
		while(x!=0) {
			int i = (x%10);
			sum = sum + (i*i*i);
			x = x/10;
			
		}
		if(sum==num) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
