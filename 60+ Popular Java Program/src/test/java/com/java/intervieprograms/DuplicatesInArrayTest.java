package com.java.intervieprograms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DuplicatesInArrayTest {
	
	private DuplicatesInArray<String> duplicatesInArray1;
	private DuplicatesInArray<Integer> duplicatesInArray2;

	private String [] input1 =  {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
	private Integer [] input2 =  {1,2,2,3,4};

	@Before
	public void setUp() throws Exception {
		duplicatesInArray1 = new DuplicatesInArray<String>();
		duplicatesInArray2 = new DuplicatesInArray<Integer>();

	}

	@Test
	public void testFindDuplicate() {
		String actualValue1 = duplicatesInArray1.findDuplicate(input1);
		Integer	actualValue2 = duplicatesInArray2.findDuplicate(input2);

		assertEquals("def", actualValue1);
		assertEquals((Object) 2, actualValue2);

	}

}
