package Basic;
public class reversestring {
	public static void main (String[] args) {
		String inputstring = "Hello World";
		String reversestring = reverse(inputstring);
		System.out.println("Reversed String: " + reverseString);
		}
	

public static String reverse(String input) {
	char[] charArray = input.toCharArray();
	int length = charArray.length;
	
	for(int i=0; i<length/2;i++) {
		char temp = charArray[i];
		charArray[i] = charArray[length-i-1];
		charArray[length-i-1] = temp;
		
		}
	
	return new String(charArray);
}
    

}
