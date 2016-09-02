package com.github.njuturi.programs;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciSequenceTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		try{
			FibonacciSequence.getFibonacciSeries(BigInteger.valueOf(-10));
			fail("This is not valid for negitive value");
		}catch(IllegalArgumentException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void testFibbonacci() {
			assertEquals("0",FibonacciSequence.getFibonacciSeries(BigInteger.valueOf(0)));
	}

}
