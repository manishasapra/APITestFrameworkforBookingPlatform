package Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class CountDuplicateCharacters {
	
	public static void CountDupe(String s) {
		Map <Character,Integer> table = new HashMap<Character, Integer>();
		char[] strarray = s.toCharArray();
		for(char c: strarray) {
			if(table.containsKey(c)) {
				table.put(c, table.get(c) + 1);
			}

			else {
			table.put(c, 1);
			}

			}
		Set<Character> keys = table.keySet();
		for (char c : keys) {

           if (table.get(c) > 1) {
        	   System.out.println(c + ":" + table.get(c));
           }
       }

		}

	
	public static void main(String[] args) {
		String s = "manishasapra";
		CountDupe(s);
		
	}
	}


