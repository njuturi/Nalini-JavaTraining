package com.github.njuturi.zippr.project;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipCodesDistanceTest {
	
	ZipprCodeGenerator zipprObj;
	ZipCodesDistance distanceObj;

	@Before
	public void setUp() throws Exception {
		zipprObj = new ZipprCodeGenerator();
		distanceObj = new ZipCodesDistance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Address addr = new Address();
		addr.setBuildingName("K.R.K Residency");
		addr.setPlotNo("3-68&3-69");
		addr.setAppFaltNo("G103");
		addr.setLandMark("MyHome Jewel bck Gate");
		addr.setCity("Hyderabad");
		addr.setState("Telanagana");
		addr.setPincode(500050);
		LatAndLong obj = new LatAndLong();
		obj.setLatitude(17.433973);
		obj.setLongitude(78.360581);
		addr.setLatAndLong(obj);
		String zipCode = zipprObj.generateZipperCode(addr);
		System.out.println("Your New Zipper Code  for K.R.K is:" + zipCode);

		Address addr2 = new Address();
		addr2.setBuildingName("Muvva ApartMents");
		addr2.setPlotNo("3-68&3-69&3-70");
		addr2.setAppFaltNo("G503");
		addr2.setLandMark("MyHome Jewel bck Gate");
		addr2.setCity("Hyderabad");
		addr2.setState("Telanagana");
		addr2.setPincode(500050);
		LatAndLong obj1 = new LatAndLong();
		obj1.setLatitude(17.434101);
		obj1.setLongitude(78.360666);
		addr2.setLatAndLong(obj1);

		String zipCode1 = zipprObj.generateZipperCode(addr2);
		System.out.println("Your New Zipper Code  for Muvva is:" + zipCode1);
		
		
		assertEquals("The Two Locations are Same",distanceObj.checkIfTwoLatOrLongAreSame(addr,addr2));
		
		//17.433973, 78.360581
		//17.434101, 78.360666

		
		
	}

}
