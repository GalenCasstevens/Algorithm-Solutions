import java.util.HashMap;

public class Algorithms {
	// Implement an algorithm to determine if a string has all unique characters.
	// What if you cannot use data structures?
	static public boolean isStringUnique(String sample) {
		HashMap<String, Boolean> map = new HashMap<>();
		char charInString;
		
		for(int i = 0; i < sample.length(); i++) {
			charInString = sample.charAt(i);
			map.put(Character.toString(charInString), true);
			
			for(int j = i + 1; j < sample.length(); j++) {
				charInString = sample.charAt(j);
				if(map.containsKey(Character.toString(charInString))) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	static public boolean isStringUnique2(String sample) {
		if(sample.length() > 128) return false;
		
		boolean[] charSet = new boolean[128];
		
		for(int i = 0; i < sample.length(); i++) {
			int val = sample.charAt(i);
			if(charSet[val]) return false;
			charSet[val] = true;
		}
		
		return true;
	}
}
