package javolin.chamber1.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ZipperCodeGenerator {
	
	private Map<String, Address> mapper = new HashMap<String, Address>();;

	//https://www.mkyong.com/java/java-generate-random-integers-in-a-range/
	public int getRandomNumber(int maxRange, int minRange) {
		if (maxRange <= minRange) {
			throw new IllegalArgumentException("Max must be greater thn min");
		} else {
			Random random = new Random();
			return random.nextInt((maxRange - minRange) + 1) + minRange;
		}

	}

	public String generateZipperCode(Address a) {

		String s1 = "ABCDEFGHJKLMNPQRSTUVWXYZ";
		String s2 = "23456789";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			int number = getRandomNumber(23, 0);
			builder.append(s1.charAt(number));
		}
		for (int i = 0; i < 4; i++) {
			int number = getRandomNumber(7, 0);
			builder.append(s2.charAt(number));
		}
		System.out.println(builder.toString());
		mappAddressAndZipCode(builder.toString(), a);
		return builder.toString();

	}

	public void mappAddressAndZipCode(String zipperCode, Address a) {
		mapper.put(zipperCode, a);
		System.out.println("Mapped Successfully");

	}
	
	public Map<String,Address> getZipperMap(){
		System.out.println("Mapped Successfully");
		return mapper;
	}
	
	public static void main(String a[]){
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
		
		ZipperCodeGenerator zippergenerator = new ZipperCodeGenerator();

		String zipCode1 = zippergenerator.generateZipperCode(addr2);
		System.out.println("Your New Zipper Code  for Muvva is:" + zipCode1);
		
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

	}

}
