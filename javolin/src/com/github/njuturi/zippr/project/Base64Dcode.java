package com.github.njuturi.zippr.project;

//https://en.wikibooks.org/wiki/Algorithm_Implementation/Miscellaneous/Base64
public class Base64Dcode {

	private final static String base64CharSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

	public static String base64Dcode(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i += 4) {

			int n = (base64CharSet.indexOf(s.charAt(i)) << 18) + 
					(base64CharSet.indexOf(s.charAt(i + 1)) << 12)+ 
					(base64CharSet.indexOf(s.charAt(i + 2)) << 6) + 
					base64CharSet.indexOf(s.charAt(i + 3));
			result += "" + (char) ((n >>> 16) & 0xFF) + 
					(char) ((n >>> 8) & 0xFF) +
					(char) (n & 0xFF);
		}

		return result;
	}

	public static void main(String a[]) {
		String s = Base64Dcode.base64Dcode("YWJjZGUA");
		System.out.println(s);

	}

}
