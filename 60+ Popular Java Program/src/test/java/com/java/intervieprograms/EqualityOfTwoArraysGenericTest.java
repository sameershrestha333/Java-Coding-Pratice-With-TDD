package com.java.intervieprograms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EqualityOfTwoArraysGenericTest {

	private EqualityOfTwoArraysGeneric<Integer> equalityOfTwoArraysGenericA;
	private EqualityOfTwoArraysGeneric<String> equalityOfTwoArraysGenericB;

	Integer[] input1 = { 1, 2, 3, 4, 5 };

	Integer[] input2 = { 1, 2, 3, 4, 5 };

	String[] input3 = { "one", "two", "three" };

	String[] input4 = { "one", "two", "three" };

	@Before
	public void setUp() throws Exception {
		equalityOfTwoArraysGenericA = new EqualityOfTwoArraysGeneric<Integer>();
		equalityOfTwoArraysGenericB = new EqualityOfTwoArraysGeneric<String>();

	}

	@Test
	public void testCheckEquality() {
		assertTrue(equalityOfTwoArraysGenericA.checkEquality(input1, input2));
		assertTrue(equalityOfTwoArraysGenericB.checkEquality(input3, input4));
	}

}
