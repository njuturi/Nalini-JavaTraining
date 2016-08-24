package javolin.training.chamber1;

import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.math3.complex.Complex;

public class SquareRoot {

	public static void squareRoot(double num) {
		double squareResult, t, a;
		
		if(num>0){
			squareResult = num/2;
			do{
				t = squareResult;
				a = num / t;
				squareResult = (t + a) / 2;
			}while((t - squareResult) != 0);
			System.out.println("squareResult:"+squareResult);
		}else if(num == 0){
			System.out.println("squareResult:"+0);
		}else{
			Complex number = new Complex(num);
			System.out.println("squareResult:"+number.sqrt());
		}
	}

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The number");
		double number = scanner.nextDouble();
		SquareRoot.squareRoot(number);
		scanner.close();

	}

}
