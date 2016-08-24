package javolin.training.chamber1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("In Setup Method:");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("In TearDown Method:");
	}

	@Test
	public void testTriangle() {
		assertEquals("Equilateral Triangle", FindTriangle.getTriangle(1000, 1000, 1000));

	}

	@Test
	public void testTriangle1() {
		assertEquals("Triangle Not Formed", FindTriangle.getTriangle(1, 3, 5));
	}

	@Test
	public void testTriangle2() {
		assertEquals("Triangle Not Formed", FindTriangle.getTriangle(-40.0, -60.0, 70.0));
	}

	@Test
	public void testTriangle3() {
		assertEquals("scalene Triangle", FindTriangle.getTriangle(40.2, 60.3, 70.8));
	}

	@Test
	public void testTriangle4() {
		assertEquals("Triangle Not Formed", FindTriangle.getTriangle(-40.2, -60.3, -70.8));
	}

	@Test
	public void testTriangle5() {
		assertEquals("scalene Triangle", FindTriangle.getTriangle(1000, 1076, 2000));
	}

	@Test
	public void testTriangle6() {
		assertEquals("RightAngle", FindTriangle.getTriangle(3, 4, 5));
	}

	@Test
	public void testTriangle7() {
		assertEquals("Triangle Not Formed", FindTriangle.getTriangle(0, 0, 0));
	}

	@Test
	public void testTriangle8() {
		assertEquals("isosceles Triangle", FindTriangle.getTriangle(10, 50, 50));
	}

}
