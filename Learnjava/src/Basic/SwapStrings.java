package Basic;
import java.util.*;
public class SwapStrings {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println("Strings before swapping are: " + str1 + "," + str2);
		String result;
		result = str2;
		str2 = str1;
		str1 = result;
		
		System.out.println("Strings after swapping are: " + str1 + "," + str2);
		
	}

}
