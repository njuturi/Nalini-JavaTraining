package javolin.training.chamber1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class DecimalToOctal {

	public String decimalToOctal(BigInteger decimalNumber) {

		StringBuilder builder = new StringBuilder();

		int reminder;
		if (decimalNumber.equals(BigInteger.ZERO)) {
			return "0";
		} else if (decimalNumber.compareTo(BigInteger.ZERO) == -1) {
			return "Please Enter +Ve Value";

		} else {
			do {
				reminder = decimalNumber.mod(BigInteger.valueOf(8)).intValue();
				builder.append(reminder);
				decimalNumber = decimalNumber.divide(BigInteger.valueOf(8));
			} while (decimalNumber.compareTo(BigInteger.ZERO) > 0);

			String result = builder.reverse().toString();
			System.out.println("OctalNumber:" + result);

			return result;
		}

	}

	public String octalToDecimal(BigInteger octalNumber) {

		BigInteger result = BigInteger.ZERO;
		if(octalNumber.equals(BigInteger.ZERO)){
			return "0";
		}else if (octalNumber.compareTo(BigInteger.ZERO) == -1) {
			return "Please Enter +Ve Value";

		}else{
			
		String number = octalNumber.toString();
		int a[] = new int[number.length()];
		char c[] = number.toCharArray();
		for (int i = c.length - 1, j = 0; i >= 0; i--, j++) {
			a[j] = Integer.parseInt(String.valueOf(c[i]));
		}
		for (int i = 0; i < c.length; i++) {
			result = BigInteger.valueOf(a[i]).multiply(BigInteger.valueOf(8).pow(i)).add(result);
		}
		System.out.println("DecimalNumbet:" + result);
		
		return result.toString();
		}
	}

	/**
	 * public static void main(String[] args) throws IOException { Scanner
	 * scanner = new Scanner(System.in); System.out.println("Enter The number");
	 * BigInteger number = scanner.nextBigInteger(); DecimalToOctal obj = new
	 * DecimalToOctal(); //String s = scanner.nextLine();
	 * obj.octalToDecimal(number); scanner.close(); }
	 */

}
