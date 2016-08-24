package javolin.training.chamber1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.math.BigInteger;

public class NumberAnagrams {
	static int count = 0;
	ArrayList<BigInteger> array = new ArrayList<BigInteger>();

	public ArrayList<BigInteger> generateAnagrams(String s1, String s2) {

		if (s2.length() <= 1) {
			count++;
			System.out.println(s1+s2);
			array.add(new BigInteger(s1 + s2));
		} else {
			for (int i = 0; i < s2.length(); i++) {
				String x = s2.substring(i, i + 1);
				String y = s2.substring(0, i);
				String z = s2.substring(i + 1);
				generateAnagrams(s1 + x, y + z);

			}
		}

		return array;
	}

	public void biggestAndSmallestOfAnagram(ArrayList<BigInteger> array) {

		Comparator<BigInteger> comparator = Collections.reverseOrder();
		Collections.sort(array,comparator);
		Iterator<BigInteger> iterator = array.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("Biggest Anagram:"+array.get(0));
		System.out.println("Smallest Anagram:"+array.get(array.size()-1));
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The number");
		String s = scanner.nextLine();
		NumberAnagrams obj = new NumberAnagrams();
		ArrayList<BigInteger> array = obj.generateAnagrams("", s);
		System.out.println("Total Number of Anagrams:" + count);
		obj.biggestAndSmallestOfAnagram(array);
		scanner.close();

	}

}
