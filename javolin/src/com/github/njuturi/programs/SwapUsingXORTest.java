package com.github.njuturi.programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SwapUsingXORTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Success",SwapUsingXOR.swap(200, 300));
	}
	
	@Test
	public void testSwap1() {
		assertEquals("Success",SwapUsingXOR.swap(-200, -300));
	}

}
