package javolin.training.chamber1;

import java.util.Scanner;

//Reffered StackOverflow

public class NextPowerOfTwoUsingShift {
	

	public static void nextPower(int number) {
		int b = 1;
		while(b < number){
			b = b <<1;
		}
		System.out.println("NextPower of Two:"+b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scanner.nextInt();
		NextPowerOfTwoUsingShift.nextPower(number);
		scanner.close();
	}

}
