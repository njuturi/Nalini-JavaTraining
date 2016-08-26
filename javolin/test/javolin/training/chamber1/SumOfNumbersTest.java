package javolin.training.chamber1;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumOfNumbersTest {
	
	SumOfNumbers obj;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("5050",SumOfNumbers.sum(new BigInteger("100")));
	}
	
	@Test
	public void testSumNumbers() {
		assertEquals("15",SumOfNumbers.sum(new BigInteger("5")));
	}
	
	@Test
	public void testSumNumbers1() {
		assertEquals("0",SumOfNumbers.sum(new BigInteger("0")));
	}
	
	@Test
	public void testSumNumbers2() {
		assertEquals("7620753696",SumOfNumbers.sum(new BigInteger("123456")));
	}
	
	@Test
	public void testSquaresSum() {
		assertEquals("5",SumOfNumbers.squareSum(new BigInteger("2")));
	}
	
	@Test
	public void testSquaresSum1() {
		assertEquals("385",SumOfNumbers.squareSum(new BigInteger("10")));
	}
	
	@Test
	public void testSquaresSum2() {
		assertEquals("0",SumOfNumbers.squareSum(new BigInteger("0")));
	}
	
	@Test
	public void testCubesSum() {
		assertEquals("0",SumOfNumbers.cubesSum(new BigInteger("0")));
	}
	
	@Test
	public void testCubesSum1() {
		assertEquals("9",SumOfNumbers.cubesSum(new BigInteger("2")));
	}
	
	@Test
	public void testCubesSum2() {
		assertEquals("5807306426319225",SumOfNumbers.cubesSum(new BigInteger("12345")));
	}

}
