package Basic;

public class CountVowels {
	
	public static void main(String[] args) {
		String s = "My name is manisha" ;
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='v') {
				count++;
				
				
			}
			
		}
		System.out.println(count);
	}

}
