package javolin.training.chamber1;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HexToDecimalTest {
	
	HexToDecimal obj;

	@Before
	public void setUp() throws Exception {
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void hexToDecimalTest() {
		obj =new HexToDecimal();
		assertEquals("9223372036854775807",obj.hexToDecimal("7fffffffffffffff"));
	}
	
	@Test
	public void decimalToHexTest() {
		obj =new HexToDecimal();
		BigInteger a = new BigInteger("9223372036854775807");
		assertEquals("7fffffffffffffff",obj.decimalToHex(a));
	}
	
	@Test
	public void decimalToHexTest2() {
		obj =new HexToDecimal();
		BigInteger a = new BigInteger("0");
		assertEquals("0",obj.decimalToHex(a));
	}

}
