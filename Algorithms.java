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
	
	
	// Given two strings, write a method to decide if one is a permutation of the other.
	static public boolean areStringsPermutation(String string1, String string2) {
		if(string1.length() != string2.length()) return false;
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		Character charInString1;
		Character charInString2;
		
		for(int i = 0; i < string1.length(); i++) {
			charInString1 = string1.charAt(i);
			charInString2 = string2.charAt(i);
			
			if(!map1.containsKey(charInString1)) {
				map1.put(charInString1, 0);
			} else {
				map1.put(charInString1, map1.get(charInString1) + 1);
			}
			
			if(!map2.containsKey(charInString2)) {
				map2.put(charInString2, 0);
			} else {
				map1.put(charInString2, map2.get(charInString2) + 1);
			}
			
			map2.put(charInString2, 0);
		}
		
		for(Character c: map1.keySet()) {
			if(map1.get(c) != map2.get(c)) return false;
		}
		
		return true;
	}
}
