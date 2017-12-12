package com.java.intervieprograms;

import java.util.ArrayList;

/**
 * Write a java program to reverse a given string
 * 
 * @author sameer
 *
 */

public class ReverseAstring {

	/**
	 * 
	 * @param str : takes the string
	 * @return : reverse the string
	 * Using iterative method
	 */
	public String reverseString(String str) {
		// Defining ArrayList
		StringBuilder builder = new StringBuilder();
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			builder.append(strArray[i]);
		}
		return builder.toString();
	}

	
	/**
	 * 
	 * @param str : takes the string
	 * @return : reverse the string
	 * Using recursive method
	 */
	public String reverseStringRecursive(String str) {
		 if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
		
		return reverseStringRecursive(str.substring(1)) + str.charAt(0);
		
	}
}
