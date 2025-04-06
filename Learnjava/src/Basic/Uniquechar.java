package Basic;
import java.util.*;

public class Uniquechar {
	
	boolean Uniquechar(String s) {
		for (int i=0; i<s.length(); i++) {
			for(int j = i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return false;
					}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Uniquechar uni = new Uniquechar();
		String s = "manisha";
		System.out.println(uni.Uniquechar(s));
		
		
			
		}
	}


