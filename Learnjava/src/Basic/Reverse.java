package Basic;

import java.util.Scanner;

public class Reverse {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = str.length()-1; i>=0; i--) {
			
			String reversed = "";
			reversed = reversed + str.charAt(i);
			System.out.print(reversed);
			
		}
		
		
	}
}
