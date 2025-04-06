package Basic;

public class StringProblems {
	public static void main(String[] args) {
		
		//1.Reverse the string
//		String s = "Hello World";
//		String reverse = "";
//		for (int i=s.length()-1; i>=0;i--) {
//			reverse = reverse + s.charAt(i);
//		}
//		System.out.println(reverse);
		
		
		//2. Check Palindrome
//		String s ="Madam";
//		String reverse = "";
//		for(int i= s.length()-1; i>=0; i--) {
//			reverse = reverse + s.charAt(i);
//		}
//		
//		if(s.equalsIgnoreCase(reverse)) {
//			System.out.println("Its a Palindrome");
//		} else {
//			System.out.println("No, its not a Palindrome");
//		}
//		
		//3. Remove white spaces
//		String s = "We lco me";
//		String s1 = " ";
//		for(int i=0; i<=s.length()-1;i++) {
//			s1= s.replaceAll("\\s", "");
//		}
//		
//		System.out.println(s1);
		
		//4. Remove special character
//		String s = "We+-&^lco me";
//		String s1 = " ";
//		for(int i=0; i<=s.length()-1;i++) {
//			s1= s.replaceAll("\\W", "");
//		}
//		
//		System.out.println(s1);
		
		//second approach
//		String s = "We+-&%#lco! me";
//		String s1 = " ";
//		for(int i=0; i<=s.length()-1;i++) {
//			if(s.charAt(i)>64 && s.charAt(i)<122) {
//				s1 = s1 + s.charAt(i);
//			}
//		}
//		
//		System.out.println(s1);
		
		//5.Count duplicate char 
//		String s = "Manisha";
//		int count=0;
//		for(int i=0; i<=s.length()-1; i++) {
//			for(int j=i+1; j<=s.length()-1; j++) {
//				if(s.charAt(i)==s.charAt(j)){
//					
//					count = count+1;
//				}
//				
//			}
//			
//		}
//		System.out.println(count);
//		
		
		//6. Count occurrences of char
//		String s = "aabbbcdddd";
//		for (int i = 0; i < s.length(); i++) {
//		    char currentChar = s.charAt(i);
//		    int count = 0;
//		    for (int j = 0; j < s.length(); j++) {
//		        if (s.charAt(j) == currentChar) {
//		            count++;
//		        }
//		    }
//
//		    System.out.println("Character " + currentChar + " occurs " + count + " times");
//		    s = s.replace(Character.toString(currentChar), "");
//            i=i-1;
//		    
//		    
//		     
//		}

		
		//7. Count words in a string
		String str = "Welcome to my hello world";
		
		int count=1;
        for(int i=0;i<str.length();i++) {
				 if(str.charAt(i)== ' ') {
					 count++;
				 }
			 }
			 System.out.println("The number of words in the string are: " + count); 
		}
		
		
	

}
