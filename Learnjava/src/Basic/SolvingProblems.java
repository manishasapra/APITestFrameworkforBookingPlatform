package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SolvingProblems {
 public static void main (String[] args) {
	 
//1. given number is even or odd
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the number: ");
//int i = sc.nextInt();
//if(i%2==0) {
//	System.out.println("Its even");
//} else {
//	System.out.println("Its odd");
//}
	 
//2. average of 3 given numbers
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the first number: ");
//int i = sc.nextInt();
//System.out.print("Enter the second number: ");
//int j = sc.nextInt();
//System.out.print("Enter the third number: ");
//int k = sc.nextInt();
//
//int average = (i+j+k)/3;
//System.out.println("Average of given 3 number is: " +average);


//3. sum of all even numbers from 1 to 20
//int sum =0;
//for(int i=1; i<=20; i++) {
//	if(i%2==0) {
//		sum = sum + i;
//	}
//}
//System.out.println(sum);


//4. swap 2 numbers with third var
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the first number: ");
//int x = sc.nextInt();
//System.out.print("Enter the second number: ");
//int y = sc.nextInt();
//System.out.println("Numbers before swapping are : " +x + " " +y);
//int temp=0;
//temp = x;
//x = y;
//y = temp;
//
//System.out.println("Numbers after swapping are : " +x + " " +y);



//5. swap 2 nums without third var
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the first number: ");
//int x = sc.nextInt();
//System.out.print("Enter the second number: ");
//int y = sc.nextInt();
//System.out.println("Numbers before swapping are : " +x + " " +y);
//x = x+y;
//y = x-y;
//x = x-y;
//
//
//System.out.println("Numbers after swapping are : " +x + " " +y);


//6. sum of all digits in num
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the  number: ");
//	int num = sc.nextInt();
//	int sum=0;
//	while(num!=0) {
//		int rem = num%10;
//		sum = sum + rem;
//		num = num/10;
//	}
//System.out.println(sum);

//7. find factorial of given num
	//Scanner sc = new Scanner(System.in);
	//System.out.print("Enter the  number: ");
	//int num = sc.nextInt();
	//int factorial = 1;
	//for(int i=1; i<=num; i++) {
//		factorial = factorial * i;
	//}
//		System.out.println(factorial); 
	 
//8. given num is palindrome or not
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the number: ");
//	 int original_num = sc.nextInt();
//	 int n = original_num;
//	 int reversed_num=0;
//	 while(n!=0) {
//	 	int rem = n%10;
//	 	reversed_num = reversed_num * 10 + rem;
//	 	n = n/10;
//	}
//
//	 if (original_num == reversed_num) {
//         System.out.println("The number is a palindrome.");
//     } else {
//         System.out.println("The number is not a palindrome.");
//     }
//	 

//9. fibonacci series
	 
//10. given num is armstrong or not
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the  number: ");
//int num = sc.nextInt();
//int n = num;
//int armstrong_num =0;
//while(n!=0) {
//	int rem = n%10;
//	armstrong_num = armstrong_num  + (rem*rem*rem);
//	n = n/10;
//}
//if (num == armstrong_num) {
// System.out.println("The number is a armstrong number.");
//} else {
// System.out.println("The number is not a armstrong number.");
//}


//11. count the digits in the given number
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  number: ");
//	 int num = sc.nextInt();
//	 int count=0;
//	 while(num!=0) {
//		 int rem = num%10;
//		 count++;
//		 num = num/10;
//	 }
//System.out.println(count);
	 
//12. count no. of even and odd digits in given number
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the  number: ");
//int num = sc.nextInt();
//int even_count =0;
//int odd_count =0;
//while(num!=0) {
//	int rem = num%10;
//	if(rem%2==0) {
//		even_count++;
//	} else {
//		odd_count++;
//	}
//	num = num/10;
//}
//System.out.println("No. of even digits are: " +even_count);
//System.out.println("No. of odd digits are: " +odd_count);

//13. identify the largest of 3 numbers
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the first number: ");
//int i = sc.nextInt();
//System.out.print("Enter the second number: ");
//int j = sc.nextInt();
//System.out.print("Enter the third number: ");
//int k = sc.nextInt();
//int largest_num=0;
//if(i>j && i>k) {
//	largest_num = i;
//} else if(j>i && j>k){
//	largest_num = j;
//} else {
//	largest_num = k;
//}
//System.out.println(largest_num);

//14. reverse the number
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the number: ");
//int num = sc.nextInt();
//int rev_num=0;
//while(num!=0) {
//	int rem = num%10;
//	rev_num = rev_num * 10 + rem;
//	
//	num = num/10;
//	
//}
//	 System.out.print(rev_num);



//15. find factors of number and count the no. of factors
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  number: ");
//	 int num = sc.nextInt();
//	 int count=0;
//	 for(int i=1; i<=num; i++) {
//		 if(num%i==0) {
//			 System.out.println("Factors of number are: " +i);
//			 count++;
//		 }
//	 }
//	 System.out.println("Total number of factors are: " +count);
	 
//16. given no. is prime or not
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  number: ");
//	 int num = sc.nextInt();
//	 boolean isPrime = true;
//
//	 for(int i=2; i<num; i++) {
//		 
//	 
//		 if(num%i==0) {
//			 isPrime = false;
//			 System.out.println("Its not a prime number");
//			 break;
//		 }
//	 }
//	 if (isPrime) {
//		 System.out.println("Its a prime number");
//	 }
	 
//17. print all prime numbers from 1 to 30
//for(int num=2; num<=30; num++) {
//	boolean isPrime = true;
//	for(int j=2; j<num; j++) {
//		if(num%j==0) {
//			isPrime = false;
//				break;
//			} 
//			 
//		}
//	if (isPrime) {
//        System.out.print(num + " ");
//    }
//	}
//	

	 
//18. given num is natural or not
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter the  number: ");
//int num = sc.nextInt();
//if(num>=1) {
//	System.out.println("Its a natural number");
//} else {
//	System.out.println("Its not a natural number");
//}

//19. reverse a string 
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the  string: ");
//	String str = sc.next();
//	String rev = "";
//	for(int i=str.length()-1; i>=0; i--) {
//		rev = rev + str.charAt(i);
//	}
//	System.out.println(rev);
	
//20. count occurrence of given char
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the  string: ");
//	String str = sc.nextLine();
//	char a = 's';
//	int count=0;
//	for(int i=0; i<=str.length()-1; i++) {
//		if(a==str.charAt(i)) {
//			count++;
//		} 
//		
//		
//	}
//	System.out.println("No. of occurrences: " +count);
	 
//21. count no. of words in given string
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the  string: ");
//	String str = sc.nextLine();
//	int word_count=1;
//	for(int i=0; i<str.length(); i++) {
//		if(str.charAt(i)== ' ') {
//			word_count++;
//		}
//	}
//	System.out.println("No. of words are: " +word_count);
	 
//22. string is palindrome or not
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  string: ");
//	 String str = sc.nextLine();
//		String rev = "";
//		for(int i=str.length()-1; i>=0; i--) {
//			rev = rev + str.charAt(i);
//		}
//	 
//	   if(str.equals(rev)) {
//		   System.out.println("Its a palindrome");
//	   } else {
//		   System.out.println("Its not a palindrome"); 
//	   }
	 
//23. count vowels and constants in a string 
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  string: ");
//	 String str = sc.nextLine().toLowerCase();
//	 int vowel_count=0;
//	 int const_count=0;
//	 
//	 for(int i=0; i<str.length(); i++) {
//		 char ch = str.charAt(i);
//		 if(ch>='a' && ch<='z') {
//		 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//			 vowel_count++;
//		 } else {
//			 const_count++;
//		 }
//	 }
//	 }
//	 System.out.println("No. of vowels are: " +vowel_count);
//	 System.out.println("No. of constants are: " +const_count);

//24. count each char of a string
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  first string: ");
//	 String str = sc.nextLine();
//	 Map <Character, Integer> count = new HashMap<Character, Integer>();
//	 for(char ch: str.toCharArray()) {
//		 if(count.containsKey(ch)) {
//			 count.put(ch, count.get(ch) + 1);
//		 } else {
//			 count.put(ch, 1);
//		 }
//		 
//	 }
//	 System.out.println("Character frequencies:");
//     for (Map.Entry<Character, Integer> entry : count.entrySet()) {
//         System.out.println(entry.getKey() + ": " + entry.getValue());
//     }
//	 
	 
//25. Print first non-repeating character
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  first string: ");
//	 String str = sc.next();
//	 Map <Character, Integer> count = new HashMap<Character, Integer>();
//	 for(char ch: str.toCharArray()) {
//		 if(count.containsKey(ch)) {
//			 count.put(ch, count.get(ch) + 1);
//		 } else {
//			 count.put(ch, 1);
//		 }
//		 
// }
//	 for (Map.Entry<Character, Integer> entry : count.entrySet()) {
//		 if(entry.getValue()==1) {
//			 System.out.println(entry.getKey());
//			 break;
//		 }
//	 }
	 
//26. Two strings are anagram
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  first string: ");
//	 String str1 = sc.next();
//	 System.out.print("Enter the  second string: ");
//	 String str2 = sc.next();
//	 char[] charArray1 = str1.toCharArray();
//     char[] charArray2 = str2.toCharArray();
//     Arrays.sort(charArray1);
//     Arrays.sort(charArray2);
//     if(Arrays.equals(charArray1, charArray2)) {
//    	 System.out.println("Strings are anagaram");
//     } else {
//    	 System.out.println("Strings are not anagaram");
//     }
	 
//27. 	strings contain only digits
//   Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  first string: ");
//	 String str1 = sc.next();
//	 boolean result = false;
//	 for(int i=0; i<str1.length();i++) {
//		 if(Character.isDigit(str1.charAt(i))) {
//			result = true;
//		 } 
//	 } 
//	 if(result==true) {
//	 c
//	 } else {
//		 System.out.println("Strings contains values other than digits");
//	 }
	 
//28. Replace characters in a string
//     String str = "hello world";
//	 char before_replaced = 'o';
//	 char after_replaced = 'a';
//	 String replaced_string = str.replace(before_replaced, after_replaced);
//	 System.out.println(replaced_string);
	 
//29. print unique chars
//	 Scanner sc = new Scanner(System.in);
//	 System.out.print("Enter the  first string: ");
//	 String str = sc.next();
//	 Map <Character, Integer> count = new LinkedHashMap<Character, Integer>();
//	 for(char ch: str.toCharArray()) {
//		 if(count.containsKey(ch)) {
//			 count.put(ch, count.get(ch) + 1);
//		 } else {
//			 count.put(ch, 1);
//		 }
//		 
// }
//	 for (Map.Entry<Character, Integer> entry : count.entrySet()) {
//		 if(entry.getValue()==1) {
//			 
//			 System.out.print(entry.getKey());
//		 }
//	 }
	 
//30.  reverse words in a string
//	 String str = "hello Shivam Welcome to India";
//	 String[] spl = str.split("[,\\.\\s]");
//	 for (int i = spl.length - 1; i >= 0; i--) {
//         System.out.print(spl[i] + " " );
//     }
//	 
//31. remove whitespaces
//	 String str = "hello world";
//	 String [] spl = str.split("[\\s]");
//	 for(String s : spl) {
//	 System.out.print(s);
//	 }

//32. 
	 
	 
	 
			 
		 
		
	 
	 
}
}