package Basic;

import java.util.*;

public class CountDuplicateWords {
	
	public static void main(String[] args) {
		String s = "One Two One Two Two";
		String substring = "Two";
		
		Map <String,Integer> store = new HashMap <String,Integer>();
		String[] strarray = s.split(" ");
		for(String str: strarray) {
			if(store.containsKey(str)) {
				store.put(str, store.get(str)+1);
			} else {
				store.put(str, 1);
			}
			
		}
		
		String maxKey = "";
		
		for(String key : store.keySet()) {
			if(maxKey.equals("")) {
				maxKey = key;
			}
			if(store.get(key) > store.get(maxKey)) {
				maxKey = key;
			}
		}
		System.out.println((maxKey + ":" + store.get(maxKey)));
			
	}

}
