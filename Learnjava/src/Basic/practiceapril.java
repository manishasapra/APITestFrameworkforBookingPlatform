package Basic;

import java.util.*;
import java.util.Map.Entry;


public class practiceapril {
	public static void main (String args[]) {
	
	//1. Find the Largest and Smallest Number in an Array.
		
//		int[] a = {10,20,40,3,60};
//		int max = a[0];
//		int min = a[0];
//		for(int i=0; i<=a.length-1;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			} else {
//				min = a[i];
//			}
//		}
//		System.out.println("Largest number in array is: " + max);
//		System.out.println("Smallest number in array is: " + min);
		
		
	//2.Find the Second Largest Number in an Array.
		// 1 way
//		int[] a = {10,20,40,3,60};
//		Arrays.sort(a);
//		System.out.println(a[a.length-2]);
		
		//2 way
//		int[] a = {10,20,40,3,60};
//		int maxnum = Integer.MIN_VALUE;
//		int second_maxnum = Integer.MIN_VALUE;
//		for(int i=0; i<a.length;i++) {
//			if(a[i] > maxnum) {
//			    second_maxnum = maxnum ;
//				maxnum = a[i];
//			}
//		}
//		System.out.println(second_maxnum);
//		
		
		
	//3. Find Duplicate Elements in an Array.
//		int[] a = {10,20,20,3,60};
//		Map<Integer, Integer> countMap = new HashMap<>();
//        List<Integer> duplicates = new ArrayList<>();
//
//        for (int num : a) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//            if (entry.getValue() > 1) {
//                duplicates.add(entry.getKey());
//            }
//        }
//        System.out.println(duplicates);
	
	//4. first non-repeating character in a string
//		String s = "swiss";
//		Map<Character, Integer> countmap = new HashMap<>();
//		for(int i=0; i<s.length(); i++) {
//			countmap.put(s.charAt(i), countmap.getOrDefault(s.charAt(i), 0) + 1);
//		}
//		
//		for (Map.Entry<Character, Integer> entry : countmap.entrySet()) {
//         if (entry.getValue() == 1) {
//              System.out.println(entry.getKey());
//              break;
//         }
		
	//5. count occurrences of character in a string
//        String s = "swiss";
//        Map<Character, Integer> countmap = new HashMap<>();
//        for(int i=0; i<s.length();i++) {
//        	char c = s.charAt(i);
//        	if(countmap.containsKey(c)) {
//        		countmap.put(c, countmap.get(c)+1);
//        	} else {
//        		countmap.put(c, 1);
//        	}
//        }
//        for(Map.Entry<Character,Integer> entry : countmap.entrySet()) {
//        	System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//        
        
	//6. Given an array of integers, return the indices of two numbers that add up to a given target.
//		       int arr[] = {2, 7, 11, 15};
//			   int target = 9;
//			   boolean found = false;
//			   Map<Integer, Integer> nummap= new HashMap<>();
//			   for( int num=0; num<arr.length; num++) {
//				   int complement = target - arr[num];
//				   if(nummap.containsKey(complement)) {
//					   System.out.println("Indices are " + nummap.get(complement) + " and " + num);
//					   found = true;
//					   break;
//				   } else {
//					   nummap.put(arr[num], num);
//				   }
//			   }
//			   
//			   if (!found) {
//		            System.out.println("Not found!");
//		        }
//		
		//without collections
//		       int arr[] = {2, 17, 7, 15};
//			   int target = 9;
//			   boolean found = false; 
//			   for(int i=0; i<arr.length-1; i++) {
//				   for(int j=0; j<arr.length-1; j++) {
//				   if(arr[i]+arr[j]==target) {
//					   System.out.println("Indices are : " + i + " and " +j);
//					   found = true;
//					   break;
//				   }
//			   }
//				   if (found) {
//				        break; // Exit the outer loop if the pair is found
//				    }
//			   }
//			   if (!found) {
//		            System.out.println("Not found!");
//		        }
//7. Given two arrays, return their intersection (common elements). (output: 4,9)
		int arr1[] = {4,9,5};
		int arr2[] = {9,4,9,8,4};
		Map<Integer,Integer> map1 = new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();
		
		
		
		
//8. Given an array of size n, find the element that appears more than n/2 times.(output:3)
//		int arr[] = {3,2,3};
//		Map<Integer, Integer> countmap = new HashMap<>();
//		boolean found = false;
//		for (int i : arr){
//			if(countmap.containsKey(i)) {
//				countmap.put(i, countmap.get(i)+1);
//			} else {
//				countmap.put(i, 1);
//			}
//		}
//		for(Map.Entry<Integer, Integer> entry: countmap.entrySet()) {
//			if(entry.getValue()>arr.length/2) {
//				System.out.println(entry.getKey());
//				found = true;
//				
//			} 
//		}
//		if(!found) {
//			System.out.println("Not Found");
//		}
		
		

}
}
