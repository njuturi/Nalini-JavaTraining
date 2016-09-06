package com.github.njuturi.stringmetrics;

public class LongestCommonSubString {

	public static String commonString(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int r[][] = new int[m][n];

		int subStringLength = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					if (i == 0 || j == 0) {
						r[i][j] = 1;
						sb.append(s1.charAt(i));
					} else {
						r[i][j] = r[i - 1][j - 1] + 1;
						sb.append(s1.charAt(i));
					}
					if (subStringLength < r[i][j]) {
						subStringLength = r[i][j];
					}
				}
			}
		}
		System.out.println("SubStringLength:"+subStringLength);

		return sb.toString();
	}

	public static void main(String[] args) {
		String s = LongestCommonSubString.commonString("abcdef", "abcdefghi");
		System.out.println("LongestCommonSubString"+s);
	}

}
