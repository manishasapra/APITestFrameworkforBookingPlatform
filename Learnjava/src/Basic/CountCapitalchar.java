package Basic;

public class CountCapitalchar {
	
	public static int CountCharacters(String s) {
		int count=0;
		for(int i=0; i<s.length();i++){  
	        char c = s.charAt(i);  
	    
		if(c>='A' && c<='Z') {
			count++;
			
		}
		
	}
		return count;
	}
	
	public static void main(String[] args) {
		String s = "My Name is Manisha Sapra";
		
		System.out.println(CountCharacters(s));
		
		
	}

}
