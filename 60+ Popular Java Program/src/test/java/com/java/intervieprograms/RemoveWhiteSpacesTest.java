package com.java.intervieprograms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveWhiteSpacesTest {
	private RemoveWhiteSpaces removeWhiteSpaces;
	private String inputString = "  Core Java jsp servlets             jdbc struts hibernate spring  ";

	@Before
	public void setUp() throws Exception {
		removeWhiteSpaces = new RemoveWhiteSpaces();
	}

	@Test
	public void testRemoveWS() {
		String actualString = removeWhiteSpaces.removeWS(inputString);
		assertEquals("CoreJavajspservletsjdbcstrutshibernatespring", actualString);
	}

}
