package javolin.training.chamber1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.math.BigInteger;

public class DecimalToOctalTest {
	
	DecimalToOctal obj;

	@Before
	public void setUp() throws Exception {
		obj = new DecimalToOctal();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		BigInteger a =new BigInteger("9223372036854775807");
		assertEquals("777777777777777777777",obj.decimalToOctal(a));
	
	}
	
	@Test
	public void testDecimalToOctal() {
		BigInteger a =new BigInteger("32142343535");
		assertEquals("357365236557",obj.decimalToOctal(a));
	
	}
	
	@Test
	public void testDecimalToOctal1() {
		BigInteger a =new BigInteger("0");
		assertEquals("0",obj.decimalToOctal(a));
	
	}
	
	@Test
	public void testDecimalToOctal2() {
		assertEquals("Please Enter +Ve Value",obj.decimalToOctal(BigInteger.valueOf(-120000)));
	
	}
	
	@Test
	public void octalTodecimalTest() {
		assertEquals("2726044",obj.octalToDecimal(BigInteger.valueOf(12314234)));
	
	}
	
	@Test
	public void octalTodecimalTest1() {
		BigInteger a =new BigInteger("1231423412423543");
		assertEquals("45735431776099",obj.octalToDecimal(a));
	
	}
	
	@Test
	public void octalTodecimalTest2() {
		BigInteger a =new BigInteger("0");
		assertEquals("0",obj.octalToDecimal(a));
	
	}
	
	@Test
	public void octalTodecimalTest3() {
		assertEquals("Please Enter +Ve Value",obj.octalToDecimal(BigInteger.valueOf(-120000)));	
	}


}
