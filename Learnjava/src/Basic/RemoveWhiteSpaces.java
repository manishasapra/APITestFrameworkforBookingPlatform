package Basic;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str = " Manisha  Sapra";
		
		for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ')
            System.out.print(ch);
		}
	}

}
