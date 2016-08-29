package javolin.chamber1.project;

import java.util.Scanner;

//https://github.com/blackdoor/blackdoor/blob/master/src/main/java/black/door/util/Base256.java

public class Base256EncodeAndDcode {

	private static final String base256CharSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ+-/*="+
											"abcdefghijklmnopqrstuvwxyzÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷"+
			"øùúûüýþÿΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡ΢ΣΤΥΦΧΨΩαβγδεζηθικλμνξοπρςστυφχψωЁЂЃЄЅІЇЈЉЊЋЌЍЎЏАБВГДЕЖЗИЙКЛМНОПР"+
											"СТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийклмнопрстуфхцчшщъы";

	public static String encode(byte[] bytes) {
		String out = "";
		for (byte b : bytes) {
			out += base256CharSet.charAt(0xff & (int) b);
		}
		return out;
	}

	public static byte[] decode(String string) {
		byte[] bytes = new byte[string.length()];
		for (int i = 0; i < string.length(); i++) {
			bytes[i] = (byte) base256CharSet.indexOf(string.charAt(i));
		}
		return bytes;
	}

	public static void main(String a[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scanner.nextLine();
		String encoded = Base256EncodeAndDcode.encode(s.getBytes());
		System.out.println("Encoded String:"+encoded);
		byte[] decodedArray = Base256EncodeAndDcode.decode(encoded);
		String decoded = new String(decodedArray);
		System.out.println("Decoded String:"+decoded);
		scanner.close();

	}

}
