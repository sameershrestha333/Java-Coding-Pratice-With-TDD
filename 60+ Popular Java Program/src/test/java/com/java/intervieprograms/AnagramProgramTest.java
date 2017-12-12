package com.java.intervieprograms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramProgramTest {
	
	private AnagramProgram anagramProgram;
	
	String input1 = "Dormitory";
	String input2 = "Dirty Room";
	
	String input3 = "keep";
	String input4 = "peek";
	
	String input5 = "School Master";
	String input6 = "The Classroom";
	
	@Before
	public void setUp() throws Exception {
		anagramProgram = new AnagramProgram();
	}

	@Test
	public void testIsAnagram() {
		assertTrue(anagramProgram.isAnagram(input1, input2));
		assertTrue(anagramProgram.isAnagram(input3, input4));
		assertTrue(anagramProgram.isAnagram(input5, input6));

	}

}
