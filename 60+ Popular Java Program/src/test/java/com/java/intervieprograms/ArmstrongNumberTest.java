package com.java.intervieprograms;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ArmstrongNumberTest {
	
	private ArmstrongNumber armstrongNumber;
	
	private int[] listinput = {153, 371, 407, 9474, 54748};

	@Before
	public void setUp() throws Exception {
		armstrongNumber = new ArmstrongNumber();
	}

	@Test
	public void testIsArmstrongNumber() {
		for(int in : listinput) {
			assertTrue(armstrongNumber.isArmstrongNumber(in));

		}
	}

	@Test
	public void testcheckArmstrongNumber() {
		for(int in : listinput) {
			assertTrue(armstrongNumber.checkArmstrongNumber(in));

		}
	}

}
