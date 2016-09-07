package com.github.njuturi.stringmetrics;

import org.slf4j.LoggerFactory;
import org.slf4j.*;

public class LongestPalindromicSequence {

	Logger logger = LoggerFactory.getLogger(LongestPalindromicSequence.class);

	private String s;

	public LongestPalindromicSequence(String s) {
		this.setS(s);
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int palindromicSequence() {
		String s =this.getS();
		int n = s.length();
		int palinSeq[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			palinSeq[i][i] = 1;
		}
		for (int cur_len = 2; cur_len <= n; cur_len++) {
			for (int i = 0; i < n - cur_len + 1; i++) {
				int j = i + cur_len - 1;
				if (s.charAt(i) == s.charAt(j) && cur_len == 2)
				{
					palinSeq[i][j] = 2;
				}else if (s.charAt(i) == s.charAt(j)){
					palinSeq[i][j] = palinSeq[i + 1][j - 1] + 2;
				} else {
					palinSeq[i][j] = Math.max(palinSeq[i + 1][j], palinSeq[i][j - 1]);
				}
			}
		}
		logger.info("LongPalindromicSeq:" + palinSeq[0][n - 1]);
		return palinSeq[0][n - 1];

	}

	public static void main(String[] args) {

		LongestPalindromicSequence obj = new LongestPalindromicSequence("bbbabbacabbaaaa");
		obj.palindromicSequence();
	}

}
