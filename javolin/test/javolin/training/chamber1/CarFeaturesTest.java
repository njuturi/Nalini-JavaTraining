package javolin.training.chamber1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarFeaturesTest {
	
	CarFeatures obj;

	@Before
	public void setUp() throws Exception {
	 obj = new CarFeatures();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void carFeaturestest() {
		byte a =10;
		obj.printFeature(a);
	}
	
	@Test
	public void carFeaturestest1() {
		byte a =-10;
		obj.printFeature(a);
	}
	
	@Test
	public void carFeaturestest2() {
		byte a =-128;
		obj.printFeature(a);
	}

}
