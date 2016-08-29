package com.github.njuturi.programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MissingNumberUsingXORTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMissNumber() {
		int a[] = new int[4];
		a[0] = 1;
		a[1] = 2;
		a[2] = 4;
		a[3] = 5;
		System.out.println(a.length);
		assertEquals(3,MissingNumberUsingXOR.findMiss(a,4));
	}
	
	@Test
	public void testMissNumber1() {
		int a[] = {1, 2, 4, 5, 6};
		System.out.println(a.length);
		assertEquals(3,MissingNumberUsingXOR.findMiss(a,a.length));
	}
	

}
