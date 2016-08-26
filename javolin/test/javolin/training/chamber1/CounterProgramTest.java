package javolin.training.chamber1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CounterProgramTest {
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCounter1() {
		long start = 10,end =20;
		CounterProgram obj =new CounterProgram(start,end);
		long temp = start;
		for(int i=0;i<=end;i++){
		obj.returnNextNumber(temp);
		}
		
	}
	
	@Test
	public void testCounter2() {
		long start = -10,end =-20;
		CounterProgram obj =new CounterProgram(start,end);
		long temp = start;
		assertEquals(0,obj.returnNextNumber(temp));
		
	}
	
	@Test
	public void testCounter3() {
		long start = 30,end =30;
		CounterProgram obj =new CounterProgram(start,end);
		long temp = 30;
		assertEquals(0,obj.returnNextNumber(temp));
	}

}
