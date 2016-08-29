package com.github.njuturi.zippr.project;

import java.math.BigInteger;
import java.util.Scanner;

//http://www.herongyang.com/Encoding/Base32-Encoding-Algorithm.html
public class Base32 {

	private static final String base32code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "23456789";

	public static byte[] zeroPad(int length, byte[] bytes) {
		byte[] padded = new byte[length];
		System.arraycopy(bytes, 0, padded, 0, bytes.length);
		return padded;
	}

	public static String encode(String string) {

		String encoded = "";
		byte[] stringArray;
		try {
			stringArray = string.getBytes("UTF-8");
		} catch (Exception ignored) {
			stringArray = string.getBytes();
		}
		int paddingCount = (5 - (stringArray.length % 5)) % 5;
		System.out.println("PaddingCount:" + paddingCount);
		stringArray = zeroPad(stringArray.length + paddingCount, stringArray);
		for (int i = 0; i < stringArray.length; i += 5) {
			BigInteger firstNo = BigInteger.valueOf((stringArray[i] & 0xff)).shiftLeft(32);
			BigInteger secNo = BigInteger.valueOf((stringArray[i + 1] & 0xff)).shiftLeft(24);
			BigInteger thirdNo = BigInteger.valueOf((stringArray[i + 2] & 0xff)).shiftLeft(16);
			BigInteger fourthNo = BigInteger.valueOf((stringArray[i + 3] & 0xff)).shiftLeft(8);
			BigInteger fifthNo = BigInteger.valueOf((stringArray[i + 4] & 0xff));

			BigInteger result = firstNo.add(secNo).add(thirdNo).add(fourthNo).add(fifthNo);

			encoded = encoded + base32code.charAt((result.shiftRight(35).intValue()) & 0x1f)
					+ base32code.charAt((int) (result.shiftRight(30).longValue()) & 0x1f)
					+ base32code.charAt((int) (result.shiftRight(25).longValue()) & 0x1f)
					+ base32code.charAt((int) (result.shiftRight(20).longValue()) & 0x1f)
					+ base32code.charAt((int) (result.shiftRight(15).longValue()) & 0x1f)
					+ base32code.charAt((int) (result.shiftRight(10).longValue()) & 0x1f)
					+ base32code.charAt((int) (result.shiftRight(5).longValue()) & 0x1f)
					+ base32code.charAt((int) (result.longValue()) & 0x1f);
		}
		return encoded;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scanner.nextLine();
		String result = Base32.encode(s);
		System.out.println("Result:" + result);
		scanner.close();

	}

}
