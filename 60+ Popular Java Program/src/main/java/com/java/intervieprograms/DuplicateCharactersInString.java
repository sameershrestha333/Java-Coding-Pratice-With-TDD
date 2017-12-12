package com.java.intervieprograms;
/**
 * Java Program To Find Duplicate Characters In A String :
 * @author sameer
 *
 */

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

	/**
	 * 
	 * @param : String with Duplicate Characters
	 * @return : Duplicate Characters In A String
	 */
	public static Map<Character, Integer> getDuplicateChar(String str) {
		// Defining two Map
		Map<Character, Integer> returningMap = new HashMap<>();
		Map<Character, Integer> tempMap = new HashMap<>();

		char[] charArray = str.toCharArray();

		for (Character ch : charArray) {
			if (tempMap.containsKey(ch)) {
				tempMap.put(ch, tempMap.get(ch) + 1);
			} else {
				tempMap.put(ch, 1);
			}
		}
		
		// Finding the duplicate character and adding in returningMap.
		for (Map.Entry<Character, Integer> m : tempMap.entrySet()) {
			Integer value = m.getValue();
			if (value > 1) {
				returningMap.put(m.getKey(), m.getValue());
			}

		}		
		return returningMap;
	}

	public static void main(String[] args) {
		System.out.println(getDuplicateChar("Better Butter"));
		System.out.println(getDuplicateChar("JavaJ2EE"));		 
		System.out.println(getDuplicateChar("Fresh Fish"));
	 
	}
}
