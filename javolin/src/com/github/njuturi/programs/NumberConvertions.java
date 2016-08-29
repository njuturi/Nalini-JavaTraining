package com.github.njuturi.programs;

import java.io.IOException;
import java.lang.StringBuilder;
import java.math.BigInteger;
import java.util.Scanner;

public class NumberConvertions {

	public BigInteger decimalToBinary(BigInteger number) {
		StringBuilder builder = new StringBuilder();
		BigInteger result = BigInteger.ZERO;

		while (number.compareTo(BigInteger.ZERO) > 0) {
			int r = (number.mod(new BigInteger("2"))).intValue();
			builder.append(r);
			number = number.divide(BigInteger.valueOf(2));
		}
		result = new BigInteger(builder.reverse().toString());
		System.out.println("Binary Form:" + result);
		return result;
	}

	public BigInteger binaryToDecimal(BigInteger binaryNumber) {

		int power = 0;
		BigInteger temp, decimalNo = BigInteger.ZERO, result = BigInteger.ZERO;
		while (true) {
			if (binaryNumber.equals(BigInteger.ZERO)) {
				break;
			} else {
				temp = binaryNumber.mod(BigInteger.valueOf(10));
				decimalNo = temp.multiply(new BigInteger("2").pow(power));
				decimalNo = result.add(decimalNo);
				result = decimalNo;
				binaryNumber = binaryNumber.divide(BigInteger.valueOf(10));
				power++;
			}
		}
		System.out.println("DecimalNumber:" + decimalNo);
		
		return decimalNo;

	}

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The number");
		BigInteger number = scanner.nextBigInteger();
		NumberConvertions obj = new NumberConvertions();
		BigInteger result = obj.decimalToBinary(number);
		obj.binaryToDecimal(result);
		scanner.close();
	}

}
