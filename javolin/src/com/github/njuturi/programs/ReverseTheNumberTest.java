package com.github.njuturi.programs;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseTheNumberTest {
	
	ReverseTheNumber obj;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseNumber() {
		obj = new ReverseTheNumber();
		assertEquals(new BigInteger("87654321"),obj.reverseNumber("12345678"));
		
	}
	
	@Test
	public void testReverseNumber1() {
		obj = new ReverseTheNumber();
		assertEquals(new BigInteger("0"),obj.reverseNumber("0"));
		
	}

}
