package com.github.njuturi.programs;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialNumberTest {

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFactorial() {
		BigInteger a = new BigInteger("5");
		assertEquals("120",FactorialNumber.factorial(a));
		
	}
	
	@Test
	public void testFactorial1() {
		BigInteger a = new BigInteger("23");
		assertEquals("25852016738884976640000",FactorialNumber.factorial(a));
		
	}
	
	@Test
	public void testFactorial2() {
		try{
		FactorialNumber.factorial(BigInteger.valueOf(-10));
		fail("-ve number is not Valid Value");
		}catch(IllegalArgumentException e){
			assertTrue(true);
		}
		
	}
	
	@Test
	public void testFactorial3() {
		BigInteger a = new BigInteger("0");
		assertEquals("0",FactorialNumber.factorial(a));
		
	}
	
	@Test
	public void testFactorial4() {
		BigInteger a = new BigInteger("28");
		assertEquals("304888344611713860501504000000",FactorialNumber.factorial(a));
		
	}
	
	@Test
	public void testFactorial5() {
		BigInteger a = new BigInteger("28");
		assertEquals("304888344611713860501504000000",FactorialNumber.factorial(a));
		
	}

}
