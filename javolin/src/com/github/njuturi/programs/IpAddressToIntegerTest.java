package com.github.njuturi.programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IpAddressToIntegerTest {
	
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Ip is Not valid",IpAddressToInteger.ipToInteger("a12.257.234.170"));
	}
	
	@Test
	public void testIp1() {
		assertEquals("Ip is Not valid",IpAddressToInteger.ipToInteger("257.12.34.89"));
	}
	
	@Test
	public void testIp2() {
		assertEquals("Ip is Not valid",IpAddressToInteger.ipToInteger("256.170.34.89"));
	}
	
	@Test
	public void testIp3() {
		assertEquals("3232235778",IpAddressToInteger.ipToInteger("192.168.1.2"));
	}

}
