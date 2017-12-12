package com.java.intervieprograms;

/**
 * Write a java program to reverse words in a sentence
 * 
 * @author sameer
 *
 */

public class ReverseAstringInSentence {

	public String reverseSenctence(String str) {
		StringBuilder builder = new StringBuilder();

		String[] strArray = str.split(" ");

		for (int i = strArray.length - 1; i >= 0; i--) {
			char[] charArray = strArray[i].toCharArray();

			for (int j = charArray.length - 1; j >= 0; j--) {
				builder.append(charArray[j]);
			}
			if (i != 0) {
				builder.append(" ");
			}
		}
		return builder.toString();
	}
}
