package com.java.intervieprograms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseAstringTest {
	
	private ReverseAstring reverseAstring;

	private String inputString = "Nepal";
	private String inputString2 = "MyJava";
	
	@Before
	public void setUp() throws Exception {
		reverseAstring = new ReverseAstring();
	}

	@Test
	public void testReverseString() {
		String actual = reverseAstring.reverseString(inputString2);
		assertEquals("avaJyM", actual);
	}

	
	@Test
	public void testreverseStringRecursive() {
		String actual = reverseAstring.reverseStringRecursive(inputString2);
		assertEquals("avaJyM", actual);
	}

}
