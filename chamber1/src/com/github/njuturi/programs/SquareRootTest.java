package com.github.njuturi.programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SquareRootTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("the Possible value is:",0.0,SquareRoot.squareRoot(0.0),0.01);
	}
	
	@Test
	public void testSquareRoot() {
		assertEquals("the Possible value is:",11.0905,SquareRoot.squareRoot(123),0.01);
	}
	
	@Test
	public void testSquareRoot1() {
		assertEquals("the Possible value is:",1111.11070555548,SquareRoot.squareRoot(1234567),0.001);
	}

}
