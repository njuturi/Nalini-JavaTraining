package com.github.njuturi.stringmetrics;

import org.slf4j.*;

/**
 * 
 * Reference http://www.geeksforgeeks.org/longest-palindromic-substring-set-2/
 *
 */

public class ManchersLongestPalindromicString {

	Logger logger = LoggerFactory.getLogger(ManchersLongestPalindromicString.class);

	private String str;

	public ManchersLongestPalindromicString(String str) {
		this.setStr(str);
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int longestPalindromicSubstringLinear() {
		int index = 0;
		String s = this.getStr();
		char input[] = s.toCharArray();
		char newInput[] = new char[2 * input.length + 1];
		for (int i = 0; i < newInput.length; i++) {
			if (i % 2 != 0) {
				newInput[i] = input[index++];
			} else {
				newInput[i] = '$';
			}
		}

		int T[] = new int[newInput.length];
		int start = 0;
		int end = 0;
		for (int i = 0; i < newInput.length;) {
			while (start > 0 && end < newInput.length - 1 && newInput[start - 1] == newInput[end + 1]) {
				start--;
				end++;
			}
			T[i] = end - start + 1;

			if (end == T.length - 1) {
				break;
			}
			int newCenter = end + (i % 2 == 0 ? 1 : 0);
			for (int j = i + 1; j <= end; j++) {
				T[j] = Math.min(T[i - (j - i)], 2 * (end - j) + 1);
				if (j + T[i - (j - i)] / 2 == end) {
					newCenter = j;
					break;
				}
			}
			i = newCenter;
			end = i + T[i] / 2;
			start = i - T[i] / 2;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < T.length; i++) {
			int val;
			val = T[i] / 2;
			if (max < val) {
				max = val;
			}
		}
		logger.info("Max:" + max);
		return max;
	}

	public static void main(String arg[]) {

		ManchersLongestPalindromicString obj = new ManchersLongestPalindromicString("bbbabbacabbaaaa");
		obj.longestPalindromicSubstringLinear();

	}

}
