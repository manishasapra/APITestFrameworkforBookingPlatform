package Basic;

import java.util.*;

public class Stringalpha {
	
	public static boolean checkstring(String str) {
		for(int i=0; i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isAlphabetic(str.charAt(i))) {
				 return false;
				
			} 
			
		}
		return true;
	}
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
    String str = sc.nextLine();
    
    boolean result = checkstring(str);
    
    if(result==true) {
    	System.out.println("String contains aplhanumeric");
    	
    }else {
    	System.out.println("String contains other characters");
    }
  
   
   
	}
}
