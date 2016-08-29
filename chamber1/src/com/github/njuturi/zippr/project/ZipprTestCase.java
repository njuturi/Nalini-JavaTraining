package com.github.njuturi.zippr.project;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipprTestCase {

	ZipprCodeGenerator zippergenerator;
	LatAndLong latandlong;

	@Before
	public void setUp() throws Exception {
		zippergenerator = new ZipprCodeGenerator();
		latandlong = new LatAndLong();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testZipperCode() {

		Address addr = new Address();
		addr.setBuildingName("K.R.K Residency");
		addr.setPlotNo("3-68&3-69");
		addr.setAppFaltNo("G103");
		addr.setLandMark("MyHome Jewel bck Gate");
		addr.setCity("Hyderabad");
		addr.setState("Telanagana");
		addr.setPincode(500050);
		LatAndLong obj = new LatAndLong();
		obj.setLatitude(123.90);
		obj.setLongitude(1234.89);
		addr.setLatAndLong(obj);

		String zipCode = zippergenerator.generateZipperCode(addr);
		System.out.println("Your New Zipper Code is:" + zipCode);

	}

	@Test
	public void getAddressWithZipperCode() {

		Address addr = new Address();
		addr.setBuildingName("K.R.K Residency");
		addr.setPlotNo("3-68&3-69");
		addr.setAppFaltNo("G103");
		addr.setLandMark("MyHome Jewel bck Gate");
		addr.setCity("Hyderabad");
		addr.setState("Telanagana");
		addr.setPincode(500050);
		LatAndLong obj = new LatAndLong();
		obj.setLatitude(123.90);
		obj.setLongitude(1234.89);
		addr.setLatAndLong(obj);

		String zipCode = zippergenerator.generateZipperCode(addr);
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
		obj1.setLatitude(178.902323);
		obj1.setLongitude(134.89);
		addr2.setLatAndLong(obj1);

		String zipCode1 = zippergenerator.generateZipperCode(addr2);
		System.out.println("Your New Zipper Code  for Muvva is:" + zipCode1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ZipperCode");
		String code = scanner.nextLine();
		Address addressResult = zippergenerator.getZipperMap().get(code);
		System.out.println(addressResult);
		GetAddressUsingZipperCode.printAddress(addressResult);
		scanner.close();
	}
	
	@Test
	public void testdecimalToDMS(){
		assertEquals("W123°40.68'40.8\"",latandlong.convertLatDecimalToDMS(-123.678));
	}

}
