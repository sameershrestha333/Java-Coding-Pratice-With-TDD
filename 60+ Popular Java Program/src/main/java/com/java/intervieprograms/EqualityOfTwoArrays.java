package com.java.intervieprograms;

/**
 * To Check The Equality Of Two Arrays In Java?
 * 
 * @author sameer
 *
 */

public class EqualityOfTwoArrays {

	public boolean checkEquality(int[] arr1, int[] arr2) {

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j < arr2.length - j; j++) {
				if (arr1[i] != arr2[j]) {
					return false;
				}
				else {
					break;
				}
			}
		}
		return true;

	}

}
