package com.github.njuturi.programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NextPowerOfTwoUsingShiftTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		try {
			NextPowerOfTwoUsingShift.nextPower(-5);
			fail("Negitive number is not valid");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}

	@Test
	public void test1() {
		assertEquals(8, NextPowerOfTwoUsingShift.nextPower(5));
	}
}
