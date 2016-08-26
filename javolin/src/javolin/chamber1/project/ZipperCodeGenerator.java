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
			int number = getRandomNumber(24, 0);
			builder.append(s1.charAt(number));
		}
		for (int i = 0; i < 4; i++) {
			int number = getRandomNumber(8, 0);
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

}
