package Basic;
import java.util.*;

public class StringRotation {
	
	public static boolean checkRotation(String original, String rotation) {
		if(original.length()!=rotation.length()) {
			return false;
		} 
			String concatinate = original + original;
			if (concatinate.indexOf(rotation) != -1) 
			{ 
				return true; 
			} 
			return false;

		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		String rotation = sc.nextLine();
		
		if(checkRotation(original,rotation)) {
			System.out.println("Yes,rotation");
			
		}else {
			System.out.println("Not rotation");
		}
		
	}

}
