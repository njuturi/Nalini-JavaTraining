package javolin.training.chamber1;

import java.util.Scanner;

public class CounterProgram {

	long start;
	long end;
	long noOfHits = 0;

	public CounterProgram(long start, long end) {
		this.start = start;
		this.end = end;
	}

	public long returnNextNumber(long temp) {
		if (start > 0 && end > 0) {
			if (start == end) {
				return 0;
			} else {
				if (start > end) {
					start = temp;
					System.out.println("Next Number:" + start);
					return start;
				} else {
					start++;
					System.out.println("Next Number:" + start);
					return start;
				}
			}
		} else {
			System.out.println("Please enter positive and different start and and Values");
			return 0;
		}

	}

	/**
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); System.out.println(
	 * "Enter start and end for the counter"); long start = scanner.nextLong();
	 * long end = scanner.nextLong(); CounterProgram obj = new
	 * CounterProgram(start,end); long temp =start; System.out.println(
	 * "Start Number:"+start); for(int i=0;i<=end;i++) {
	 * obj.returnNextNumber(temp); } scanner.close();
	 * 
	 * }
	 */

}
