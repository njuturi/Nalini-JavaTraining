package com.github.njuturi.programs;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FibonacciSequence {

	public static String getFibonacciSeries(BigInteger number) {

		if (number.compareTo(BigInteger.ZERO) != 0) {
			BigInteger f1 = BigInteger.ZERO, f2 = BigInteger.ONE, f3;
			double ratioValue, ratioValue1;
			DecimalFormat df = new DecimalFormat("#.#####");
			System.out.println(f1);
			System.out.println(f2);
			number = number.subtract(BigInteger.valueOf(2));
			StringBuilder result = new StringBuilder();
			while (number.compareTo(BigInteger.ZERO) != 0) {
				if (f1.compareTo(BigInteger.ZERO) == 1 & f2.compareTo(BigInteger.ZERO) == 1) {
					double a1 = f1.doubleValue();
					double a2 = f2.doubleValue();
					double c = a1 + a2;
					ratioValue = c / a2;
					ratioValue1 = a2 / a1;
					ratioValue = Double.parseDouble(df.format(ratioValue));
					ratioValue1 = Double.parseDouble(df.format(ratioValue1));
					if (ratioValue == ratioValue1) {
						//System.out.println("Golden Ratio Numbers are:" + f1 + "," + f2);
						result.append("("+f2+","+f1+")");
					}
				}
				f3 = f1.add(f2);
				f1 = f2;
				f2 = f3;
				System.out.println(f3);
				number = number.subtract(BigInteger.ONE);
			}
			System.out.println("Golden Ratio Numbers for Resulted Series");
			return result.toString();
		} else {
			return "0";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		BigInteger number = scanner.nextBigInteger();
		String str = FibonacciSequence.getFibonacciSeries(number);
		System.out.println(str);
		scanner.close();

	}

}
