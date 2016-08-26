package javolin.training.chamber1;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberConvertionsTest {
	
	NumberConvertions obj;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		obj = new NumberConvertions();
		assertEquals(new BigInteger("1010101111001100011101110001000110000"),obj.decimalToBinary(new BigInteger("92233720368")));
	}
	
	@Test
	public void testDecimalToBinary() {
		obj = new NumberConvertions();
		assertEquals(new BigInteger("01100100"),obj.decimalToBinary(new BigInteger("100")));
	}
	
	@Test
	public void testbinaryToDecimal() {
		obj = new NumberConvertions();
		assertEquals(new BigInteger("3271"),obj.binaryToDecimal(new BigInteger("110011000111")));
	}
	
	@Test
	public void testbinaryToDecimal1() {
		obj = new NumberConvertions();
		assertEquals(new BigInteger("209351"),obj.binaryToDecimal(new BigInteger("110011000111000111")));
	}
	
}
