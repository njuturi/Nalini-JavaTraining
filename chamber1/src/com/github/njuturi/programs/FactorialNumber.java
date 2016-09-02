package com.github.njuturi.programs;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumber {

	public static String factorial(BigInteger number) {
		BigInteger result = BigInteger.ONE;

		if (number.equals(BigInteger.ZERO)) {
			return "0";
		} else if (number.compareTo(BigInteger.ZERO) == 1) {
			{
				while (number.compareTo(BigInteger.ONE) != 0) {
					result = result.multiply(number);
					number = number.subtract(BigInteger.ONE);

				}
				return result.toString();
			}
		} else {
			return "Please Enter Positive Values";
		}
	}

	
	  public static void main(String[] args) throws IOException { 
		  Scanner scanner = new Scanner(System.in); 
		  System.out.println("Enter The number");
		  BigInteger number = scanner.nextBigInteger(); 
		  String result = FactorialNumber.factorial(number); 
		  System.out.println(result);
		  scanner.close();
	  
	  }
	 

}
