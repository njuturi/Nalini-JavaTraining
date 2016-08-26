package javolin.training.chamber1;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NPowersofTwoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(new BigInteger("14"),NPowersofTwo.nPowersOfTwo(new BigInteger("3")));
	}
	
	@Test
	public void test1() {
		assertEquals(new BigInteger("2535301200456458802993406410750"),NPowersofTwo.nPowersOfTwo(new BigInteger("100")));
	}

}
