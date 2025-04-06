package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersPractice {
	public static void main (String[] args) {
		//1. Reverse a number
		
//		Scanner sc  = new Scanner(System.in);
//		System.out.print("Enter the number:" );
//		int num = sc.nextInt();
//		int rev =0;
//		while(num!=0) {
//			rev =rev*10 + num%10;
//			num = num/10;
//		}

		
		
		//2. Number is Palindrome or not
//		Scanner sc  = new Scanner(System.in);
//		System.out.print("Enter the number:" );
//		int num = sc.nextInt();
//		String original = String.valueOf(num);
//		StringBuffer sb = new StringBuffer(original);
//		String rev = sb.reverse().toString();
//		
//		if(original.equals(rev)) {
//			System.out.println("Its a palindrome" );
//		}else {
//			System.out.println("No its not a palindrome" );
//		}

		//3. count the numbers
//		Scanner sc  = new Scanner(System.in);
//		System.out.print("Enter the number:" );
//		int num = sc.nextInt();
//		int count=0;
//		while(num!=0) {
//			num = num/10;
//			count++;
//		}
//		
//		System.out.println(count);
//		
		//4. swap two numbers
//		Scanner sc  = new Scanner(System.in);
//		System.out.print("Enter the first number:" );
//		int num1 = sc.nextInt();
//		System.out.print("Enter the second number:" );
//		int num2 = sc.nextInt();
//		int temp;
//		temp = num1;
//		num1 = num2;
//		num2 = temp;
//		
//		System.out.println(num1);
//		System.out.println(num2);
		
		//5. count no. of even and odd in a given digits
//		Scanner sc  = new Scanner(System.in);
//		System.out.print("Enter the number:" );
//		int num = sc.nextInt();
//		int even_count=0;
//		int odd_count=0;
//		while (num>0) {
//			int rem = num%10;
//			if(rem%2==0) {
//				even_count++ ;
//			} else {
//				odd_count++;
//			}
//			num=num/10;
//		}
//
//
//		System.out.println("No. of even numbers are:" +even_count);
//		System.out.println("No. of odd numbers are:" +odd_count);
		
		//6. Sum of all digits
//		Scanner sc  = new Scanner(System.in);
//		System.out.print("Enter the number:" );
//		int num = sc.nextInt();
//		int sum=0;
//		while(num>0) {
//	    int rem = num%10;
//	    sum =sum+rem;
//	    num = num/10;
//	    
//		}
//		System.out.println(sum);
//}
	
   //7. largest of 3 numbers
//		int a =10;
//		int b=50;
//		int c=30;
//		
//		if(a>b && a>c) 
//		{
//			System.out.println("A is largest number");
//			
//		} 
//	   else if(b>a && b>c) 
//	   {
//			System.out.println("B is largest number");
//		} 
//	    else 
//	    	{
//			System.out.println("C is largest number");
//		}
//		
	//8. given num is prime or not
//		Scanner sc  = new Scanner(System.in);
//		System.out.print("Enter the number:" );
//		int num = sc.nextInt();
//		int count=0;
//		if(num>1) {
//			for(int i=1; i<=num;i++) {
//				if(num%i ==0) {
//					count++;
//				}
//			}
//				if(count==2) {
//					System.out.println("Its a prime number");
//				}
//				else {
//					System.out.println("Its not a prime number");
//				}
//			
//		}
//		else {
//			System.out.println("Its not a prime number");
//		}
			
 //9. find sum of all elements in array
//		int a[] = {1,2,3,4,5,6};
//		int count=0;
//		for(int i=0; i<a.length;i++) {
//			count = count+a[i];
//		}
//System.out.println(count);

   //10. Print even and odd numbers from array
//		int a[] = {1,2,3,4,5};
//		int even_count=0;
//		int odd_count=0;
//		for(int i=0; i<a.length;i++) {
//			if(a[i]%2==0) {
//				even_count++;
//			} else {
//				odd_count++;
//			}
//
//		}
//		System.out.println("Total no. of evens are:" +even_count);
//		System.out.println("Total no. of odds are:" +odd_count);
		
	//11. check two arrays are equal are not
//		int a[] = {1,2,3,4,5};
//		int a1[] = {1,2,3,4,5};
//		if(Arrays.equals(a,a1)) {
//			System.out.println("Arrays are equal");
//		} else {
//			System.out.println("Arrays are not equal");
//		}
		
		//approach 2
//		if(a.length==a1.length) {
//			for(int i=0; i<a.length;i++) {
//				for(int j=i; i<a1.length;i++) {
//					if(a[i]==a[j]) {
//						System.out.println("Arrays are equal");
//					}
//				}
//			}
//			
//		}
//		else {
//			System.out.println("Arrays are not equal");
//		}
		
		//12. find missing number in array
//		int a[]= {1,2,3,4,5,7,8,9,10};
//		int sum=0;
//		int total_sum=0;
//	    for(int i=0; i<a.length;i++) {
//			sum =sum+a[i];
//		}
//		for(int i=1; i<=10; i++) {
//			total_sum =total_sum+i;
//		}
//		
//		System.out.println("Missing number is:" +(total_sum-sum));
		
		//13. find min/max number in array
//		int a[]= {10,20,30,40};
//		int max=a[0];
//		int min=a[0];
//		for(int i=0; i<a.length;i++) {
//			if(a[i]>max) {
//				max = a[i];
//				
//			}
//			if(a[i]< min) {
//				min = a[i];
//			}
//			
//		}
//		System.out.println("Maximum number is:" +max);
//		System.out.println("Minimum number is:" +min);
		
		//14. duplicate elements in array
//		int[] arr = {10,20,20,30,30,30,40,40,50};
//		int temp=0;
//		for(int i=0; i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					temp = arr[i];
//					
//				}
//				
//			}
//		}

//String arr[]= {"java", "python", "java", "javascript", "python"};
//String temp = " " ;
//for(int i=0; i<arr.length; i++) {
//	for(int j=i+1;j<arr.length;j++) {
//	if(arr[i]==arr[j]) {
//		System.out.println(arr[i]);
//		
//	}
//	}
//}
		
//15. linear search in array
//int arr[] = {10,20,30,40,50};
//boolean flag = false;
//int element_search = 60;
//for(int i=0; i<arr.length;i++) {
//	if(arr[i]==element_search) {
//		System.out.println("Element is present");
//		flag=true;
//	} 
//	
//}	
//if(!flag) {
//	System.out.println("Element is not present");
//}

//16.binary search in array
//		int arr[] = {10,60,30,40,50,70};
//		int mid_value=(0+arr.length)/2;
//		int element = 60;
//		for(int i=0; i<arr.length;i++) {
//			if(i == mid_value) {
//				System.out.println("Element found at:" +i);
//			} 
//			else if (){
//				
//			}
//		}
//		
		
	//17. remove white spaces in string
//		String s = "we lco me";
//		String s1="";
//		for(int i=0;i<s.length();i++) {
//			s1= s.replaceAll("\\s", "");
//			
//		}
//		System.out.println(s1);
//		
	//18. remove special chars in string
//		String s = "we&*%lco!^#$#@me";
//		String s1="";
//		for(int i=0;i<s.length();i++) {
//			s1= s.replaceAll("[^a-zA-Z0-9]", "");
//			
//		}
//		System.out.println(s1);
//		
		
		//19. Count no.of words in string
//		String s = "Welcome to hello world mani";
//		int count =1;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)==' ') {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		//20 count occurrences of chars in string
//		String s = "Welcome to hello world";
//		char search = 'l';
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='l') {
//				count++;
//				
//			}
//			
//			
//		}
//		System.out.println(count);
//		
		
		//21. reverse each word in java
		
}
}
