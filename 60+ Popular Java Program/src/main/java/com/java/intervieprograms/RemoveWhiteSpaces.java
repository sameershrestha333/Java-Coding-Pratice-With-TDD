package com.java.intervieprograms;

/**
 * Write a java program to remove all white spaces from a string.?
 * 
 * @author sameer
 *
 */
public class RemoveWhiteSpaces {

	public String removeWS(String str) {
		StringBuilder builder = new StringBuilder();
			char[] charArray = str.toCharArray();
			for (char ch : charArray) {
				if (ch != ' ' && ch!= '\t') {
					builder.append(ch);
				}
			}		
		return builder.toString();
	}

}
