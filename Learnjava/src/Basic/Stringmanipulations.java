package Basic;

import java.util.HashMap;
import java.util.Scanner;

public class Stringmanipulations {
	
	public static void main (String[] args) {
//1. reverse a string
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the string: ");
//	String str = sc.nextLine();
//	String rev = "" ;
//	for(int i=str.length()-1; i>=0; i--) {
//		rev = rev + str.charAt(i);
//	}
//	System.out.print("Reversed string is: " +rev);
	
	
//2. Check if a String is Palindrome
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the string: ");
//	String str = sc.nextLine();
//	String rev = "" ;
//	for(int i=str.length()-1; i>=0; i--) {
//		rev = rev + str.charAt(i);
//	}
//	if(str.equalsIgnoreCase(rev)) {
//		System.out.println("Its a palindrome");
//	} else {
//		System.out.println("Its not a palindrome");
//	}
	
//3. Count Vowels and Consonants in a String
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the string: ");
//	String str = sc.nextLine();
//	String str1 = str.replaceAll("\\W", "");
//	int count_vowel =0;
//	int count_const =0;
//	for(int i=0; i<=str1.length()-1 ; i++) {
//		char ch = str1.charAt(i);
//	if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u') {
//		count_vowel++;
//	} else {
//		count_const++;
//	}
//	
//	}
//	System.out.println("No. of vowels are: " + count_vowel);
//	System.out.println("No. of constants are: " + count_const);
	
//4. Convert String to Uppercase and Lowercase
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the string: ");
//	String str = sc.nextLine();
//	String lowercase = str.toLowerCase();
//	String uppercase = str.toUpperCase();
//	System.out.println(lowercase);
//	System.out.println(uppercase);
	
//5. Remove spaces from string
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the string: ");
//	String str = sc.nextLine();
//	String replace_str = str.replaceAll("\\s", "");
//	System.out.println(replace_str);
	
	
//6. Remove Duplicates from a String
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the string: ");
//	String str = sc.nextLine();
//	HashMap<Character, Integer> map = new HashMap<>();
//    StringBuilder sb = new StringBuilder();
//
//    for (char ch : str.toCharArray()) {
//        if (!map.containsKey(ch)) {
//            map.put(ch, 1);
//            sb.append(ch);
//        }
//    }
//	
//    System.out.println(sb.toString());
		
//7. Replace a Substring in a String
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: ");
	String str = sc.nextLine();
	
	System.out.print("Enter the replaced word in a string: ");
	String replaced_str = sc.nextLine();
	
	System.out.print("Enter the new string: ");
	String new_str = sc.nextLine();
	
	String modified_string = str.replace(replaced_str, new_str);
	System.out.println(modified_string);
	
	

	
	
	
}
}

