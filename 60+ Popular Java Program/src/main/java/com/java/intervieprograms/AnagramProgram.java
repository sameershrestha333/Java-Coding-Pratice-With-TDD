package com.java.intervieprograms;

import java.util.Arrays;

/**
 *  Java Program To Check Whether Two Strings Are Anagram Or Not?
 * @author sameer
 *
 */
public class AnagramProgram {

	// Using sort() and equals() Methods	
	public boolean isAnagram(String str1, String str2) {
	
		char [] strChar1 = str1.replace(" ", "").toLowerCase().toString().toCharArray();
		char [] strChar2 = str2.replace(" ", "").toLowerCase().toString().toCharArray();
		
		Arrays.sort(strChar1);
		Arrays.sort(strChar2);
		return Arrays.equals(strChar1, strChar2);		
	}	
}
