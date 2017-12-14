package com.java.intervieprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Write a java program to find duplicate elements in an array? For example,
 * duplicate element in {“ONE”, “TWO”, “THREE”, “TWO”, “FOUR”} is “TWO”.
 * 
 * @author sameer
 *
 */
public class DuplicatesInArray<T> {

	// Java Program To Find Duplicate Elements In An Array Using Brute Force Method
	// :
	public T findDuplicate(T[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					return arr[i];
				}
			}
		}
		return null;
	}

	// Java Program To Find Duplicate Elements In An Array Using HashSet :

	public static List<String> findDup(String[] arr) {
		List<String> list = new ArrayList<>();
		HashSet<String> set = new HashSet<String>();
		for(String str : arr) {
			if(!set.add(str)) {
				list.add(str);
			}
		}
		
		return list;
	}
	public static void main(String[] args) {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};        
        System.out.println(findDup(strArray));
	}
}
