package Basic;

public class DeleteString {
	
	public static String Replace(String str1, String str2) {
		for(int i=0; i<str2.length();i++) {
			char ch = str2.charAt(i);
		
			while (str1.contains(ch + "")) {
                int itr = str1.indexOf(ch);
                str1 = str1.replace((ch + ""), "");
			
		}
			
		
	}
		return str1;
	}
	
	public static void main(String[] args) {
		String str1 = "Welcome India";
		String str2 = "ind";
		
		System.out.println(Replace(str1, str2));
		
		
		
	}

}
