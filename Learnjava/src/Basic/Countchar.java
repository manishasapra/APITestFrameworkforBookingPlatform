package Basic;


import java.util.Scanner;

public class Countchar {
	
	public static void main(String[] args) {
		String str = "My name is manisha";
		
		String[] s = str.split("");
        int count=0;
	      for (String ch : s) {
	            count++;
	        }
	      System.out.println(count);
		
		}

}
