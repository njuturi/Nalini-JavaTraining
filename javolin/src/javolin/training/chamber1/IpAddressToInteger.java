package javolin.training.chamber1;

import java.math.BigInteger;
import java.util.Scanner;

import org.apache.commons.validator.routines.InetAddressValidator;

public class IpAddressToInteger {

	public static void ipToInteger(String inetAddress) {

		InetAddressValidator obj = new InetAddressValidator();
		BigInteger result = BigInteger.ZERO;

		if (obj.isValid(inetAddress)) {
			String[] ip = inetAddress.split("\\.");
			for (int i = 0, j = ip.length - 1; i < ip.length; i++, j--) {
				int number = Integer.parseInt(ip[i]);
				result = BigInteger.valueOf(number).multiply(BigInteger.valueOf(256).pow(j)).add(result);

			}
			System.out.println("IpToDecimalValue:"+result);

		} else {
			System.out.println("The Ip address is Invalid");
		}
		

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The number");
		String s = scanner.nextLine();
		IpAddressToInteger.ipToInteger(s);
		scanner.close();
	}

}
