package com.java.intervieprograms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseAstringInSentenceTest {
		private ReverseAstringInSentence reverseAstringInSentence;
		private String input1 = "This is Java class";

	
	@Before
	public void setUp() throws Exception {
		reverseAstringInSentence = new ReverseAstringInSentence();
	}

	@Test
	public void testReverseSenctence() {
		String actual = reverseAstringInSentence.reverseSenctence(input1);
		assertEquals("ssalc avaJ si sihT", actual);

	}

}
