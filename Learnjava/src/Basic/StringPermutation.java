package Basic;

import java.util.Arrays;

public class StringPermutation {
	
	static boolean arePermutation(String str1, String str2) {
		
		if(str1.length()!=str2.length())
			return false;
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<str1.length();i++) {
		if(ch1[i] != ch2[i]) {
			return false;
			
		}
		
		}
		return true;
		
	}
	public static void main(String[] args) {
		String str1 = "Manisha";
		String str2 = "Manish";
		
		if(arePermutation(str1,str2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
