package javolin.training.chamber1;

import java.util.Scanner;
//http://www.geeksforgeeks.org/find-the-missing-number/

public class FindMissingNumberUsingXOR {

	public static int findMiss(int a[],int size) {

		int x1 = a[0];
		int x2 = 1;

		for (int i = 1; i < size; i++) {
			x1 = x1 ^ a[i];
		}

		for (int i = 2; i <= size + 1; i++) {
			x2 = x2 ^ i;
		}
		int result = x1^x2;

		System.out.println("The missing value is:" + result);
		
		return result;

	}

	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numbers to Swap");
		//int sizearray = scanner.nextInt();
		int a[] = {1, 2, 4, 5, 6};
		for (int i = 0; i < sizearray; i++) {
			a[i] = scanner.nextInt();
		}
		int num = FindMissingNumberUsingXOR.findMiss(a, a.length);
		System.out.println(num);
		scanner.close();
	}*/

}
