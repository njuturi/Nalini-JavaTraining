package javolin.training.chamber1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class HexToDecimal {

	public String hexToDecimal(String hexNumber) {

		String s = "0123456789ABCDEF";
		BigInteger result = BigInteger.ZERO;

		if (hexNumber != null || hexNumber != "") {

			hexNumber = hexNumber.toUpperCase();
			StringBuilder builder = new StringBuilder();
			char[] ch = hexNumber.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (s.indexOf(ch[i]) != -1) {
					builder.append(ch[i]);
				}

			}
			hexNumber = builder.reverse().toString();
			System.out.println(hexNumber);
			for (int i = 0; i < hexNumber.length(); i++) {

				char c = hexNumber.charAt(i);
				int index = s.indexOf(c);
				if (index != -1) {
					result = BigInteger.valueOf(index).multiply(BigInteger.valueOf(16).pow(i)).add(result);
				}
			}
			System.out.println(result);
		}
		return result.toString();
	}

	public String decimalToHex(BigInteger decimalNumber) {

		char dig[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		int reminder;
		StringBuilder result = new StringBuilder();
		if (decimalNumber.equals(BigInteger.ZERO)) {
			return "0";
		} else {
			while (decimalNumber.compareTo(BigInteger.ZERO) > 0) {
				reminder = (decimalNumber.mod(BigInteger.valueOf(16))).intValue();
				result.append(dig[reminder]);
				decimalNumber = decimalNumber.divide(BigInteger.valueOf(16));

			}
			String hexTodecimalNo = result.reverse().toString();
			System.out.println("HexToDecimal:" + hexTodecimalNo);

			return hexTodecimalNo;
		}
	}

	/*
	 * public static void main(String[] args) throws IOException { Scanner
	 * scanner = new Scanner(System.in); System.out.println("Enter The number");
	 * //BigInteger number = scanner.nextBigInteger(); HexToDecimal obj = new
	 * HexToDecimal(); //obj.decimalToHex(number); String s =
	 * scanner.nextLine(); obj.hexToDecimal(s); scanner.close(); }
	 */

}
