package com.github.njuturi.stringmetrics;

public class LongestPalindromicSequence {

	public static int palindromicSequence(String s) {
		int n = s.length();
		int palinSeq[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			palinSeq[i][i] = 1;
		}
		for (int cur_len = 2; cur_len <= n; cur_len++) {
			for (int i = 0; i < n - cur_len + 1; i++) {
				int j = i + cur_len - 1;
				if (s.charAt(i) == s.charAt(j))// Trim if match and add 2
				{
					palinSeq[i][j] = palinSeq[i + 1][j - 1] + 2;
				} else {
					palinSeq[i][j] = Math.max(palinSeq[i + 1][j], palinSeq[i][j - 1]);
				}
			}
		}
		return palinSeq[0][n - 1];
	}
	
	public static void main(String[] args) {
		int len = LongestPalindromicSequence.palindromicSequence("LPSSAPAL");
		System.out.println(len);
	}

}
