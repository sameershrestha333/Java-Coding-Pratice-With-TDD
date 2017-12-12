package com.java.intervieprograms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EqualityOfTwoArraysTest {

	private EqualityOfTwoArrays equalityOfTwoArrays;

	int[] input1 = { 1, 2, 3, 4, 5 };

	int[] input2 = { 1, 2, 3, 4, 5 };

	@Before
	public void setUp() throws Exception {
		equalityOfTwoArrays = new EqualityOfTwoArrays();
	}

	@Test
	public void testCheckEquality() {
		assertTrue(equalityOfTwoArrays.checkEquality(input1, input2));
	}

}
