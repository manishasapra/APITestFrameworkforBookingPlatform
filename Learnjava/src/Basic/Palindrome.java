package Basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		String reversed = sb.reverse().toString();
		
		if(str.equals(reversed)) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		
	}
}
