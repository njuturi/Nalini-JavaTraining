package javolin.training.chamber1;

import java.util.Scanner;

public class CubeRoot {

	public static void findCubeRoot(double number) {
		if (number > 0) {
			for (int i = 1; i < number / 2; i++) {
				if ((i * i * i) == number) {
					System.out.println("Inside first if");
					System.out.print("The Cube root of the number is: " + i);
					return;
				} else if (((i * i * i) < number) && ((i + 1) * (i + 1) * (i + 1)) > number) {
					System.out.println(i);
					System.out.println("second");
					float cubeRoot = ((float) (number)) / (i + 1);
					System.out.print("The cube root of the number is: " + cubeRoot);
				}
			}
		} else {
			System.out.print("Cube root of that number cannot be found");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		double number = scanner.nextDouble();
		CubeRoot.findCubeRoot(number);
		scanner.close();
	}

}
