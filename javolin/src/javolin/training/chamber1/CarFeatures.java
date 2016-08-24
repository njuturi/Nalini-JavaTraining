package javolin.training.chamber1;

import java.util.Scanner;

public class CarFeatures {

	String[] feature = { "ABS", "Rear-view Camera", "Power Steering", "Power windows", "AC", "FM Radio", "CD Player",
			"MP3 Player" };

	public void printFeature(byte number) {

		byte i = 1;
		byte j = 0;
		System.out.println("\nThe car has the following features: ");
		while (i != 0) {
			if ((number & i) != 0) {
				System.out.println(feature[j]);
			}
			i <<= 1;
			j++;
		}
	}


	public static void main(String[] args) {
		CarFeatures carFeature = new CarFeatures();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the byte: ");
		byte number = scan.nextByte();
		
			carFeature.printFeature(number);
		
	}

}
