package javolin.training.chamber1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimeAndTwinPrimes {

	public static void generatePrime(BigInteger max) {
		BigInteger c = BigInteger.valueOf(1);
		BigInteger num = BigInteger.valueOf(2);

		StringBuilder builder = new StringBuilder();

		BigInteger lastPrime = BigInteger.valueOf(2), sumOfPrimes = BigInteger.ZERO, sumOfTwinPrimes = BigInteger.ZERO;
		BigInteger twinAddition = BigInteger.ZERO;

		while (c.compareTo(max) != 1 || c.compareTo(max) == 0) {
			if (isPrime(num)) {
				System.out.println(num);
				c = c.add(BigInteger.valueOf(1));
				sumOfPrimes = sumOfPrimes.add(num);
				if (num.subtract(lastPrime).equals(BigInteger.valueOf(2))) {
					builder.append("(" + lastPrime + "," + num + ")");
					twinAddition = lastPrime.add(num);
					sumOfTwinPrimes = sumOfTwinPrimes.add(twinAddition);
				}

				lastPrime = num;
			}
			num = num.add(BigInteger.valueOf(1));

		}
		System.out.println("TwinPrimes:" + builder.substring(0));
		System.out.println("PrimesSum:" + sumOfPrimes);
		System.out.println("TwinPrimesSum:" + sumOfTwinPrimes);

	}

	public static boolean isPrime(BigInteger num) {
		boolean isPrime = true;
		BigInteger i, j;
		for (i = BigInteger.valueOf(2); i.compareTo(num.divide(BigInteger.valueOf(2))) != 1; i = i
				.add(BigInteger.valueOf(1))) {
			j = num.mod(i);
			if (j.compareTo(BigInteger.valueOf(0)) != 1) {
				isPrime = false;
			}
			
			//i.compareTo(num.subtract(BigInteger.valueOf(1))) 

		}
		return isPrime;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter How many primes:");
		BigInteger number = scanner.nextBigInteger();
		if(number.compareTo(BigInteger.ZERO) == -1){
			System.out.println("The Number Must Be Positive");
		}else if(number.equals(BigInteger.ZERO)){
			System.out.println(0);
		}else{
		PrimeAndTwinPrimes.generatePrime(number);
		}
		scanner.close();
	}

}
