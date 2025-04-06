package Basic;

public class reversedString {
	public static void main (String[] args) {
		String inputstring = "Hello World";
		char[] charArray = inputstring.toCharArray();
		int length = charArray.length;
		
		for(int i=0; i<length/2;i++) {
			char temp = charArray[i];
			charArray[i] = charArray[length-i-1];
			charArray[length-i-1] = temp;
			}
		
		String str = new String(charArray);
		System.out.println(str);
	}

}
		
		
		
		
		

	
	


