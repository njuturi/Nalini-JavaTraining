package com.github.njuturi.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NumberAnagrams {
	static int count = 0;
	List<String> list = new ArrayList<String>();

	public List<String> generateAnagrams(String s1, String s2) {

		if (s2.length() <= 1) {
			count++;
			System.out.println(s1+s2);
			list.add(s1 + s2);
		} else {
			for (int i = 0; i < s2.length(); i++) {
				String x = s2.substring(i, i + 1);
				String y = s2.substring(0, i);
				String z = s2.substring(i + 1);
				generateAnagrams(s1 + x, y + z);

			}
		}

		return list;
	}

	public List<String> biggestAndSmallestOfAnagram(List<String> list) {

		Comparator<String> comparator = Collections.reverseOrder();
		Collections.sort(list,comparator);
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		return list;
	}

	public String bigger(List<String> list){
		return list.get(0);
	}
	
	public String small(List<String> list){
		int size = list.size();
		return list.get(size-1);
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The number");
		String s = scanner.nextLine();
		NumberAnagrams obj = new NumberAnagrams();
		List<String> array = obj.generateAnagrams("", s);
		System.out.println("Total Number of Anagrams:" + count);
		obj.biggestAndSmallestOfAnagram(array);
		scanner.close();

	}

}
