package javolin.training.chamber1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class NPowersofTwo {

	public static void nPowersOfTwo(BigInteger number) {

		BigInteger result = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;
		BigInteger i = BigInteger.ONE;

		while (i.compareTo(number) != 1 || i.compareTo(number) == 0) {
			result = result.multiply(BigInteger.valueOf(2));
			System.out.println(result);
			sum = sum.add(result);
			i = i.add(BigInteger.valueOf(1));

		}
		System.out.println("Sum Of Npowers:" + sum);
	}

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The number");
		BigInteger number = scanner.nextBigInteger();
		NPowersofTwo.nPowersOfTwo(number);
		scanner.close();

	}
}
