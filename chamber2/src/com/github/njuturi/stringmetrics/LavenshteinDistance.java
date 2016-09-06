package com.github.njuturi.stringmetrics;

public class LavenshteinDistance {

	private String s1, s2;

	public LavenshteinDistance(String s1, String s2) {
		this.setS1(s1);
		this.setS1(s2);
	}

	public String getS1() {
		return s1;
	}
	
	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	private int Minimum(int a, int b, int c) {
		int mi;
		mi = a;
		if (b < mi) {
			mi = b;
		}
		if (c < mi) {
			mi = c;
		}
		return mi;
	}

	public int getLavenSteinDistance(String s, String t) {
		int d[][];
		int n;
		int m;
		int i;
		int j;
		char s_i;
		char t_j;
		int cost;
		n = s.length();
		m = t.length();
		if (n == 0) {
			return m;
		}
		if (m == 0) {
			return n;
		}
		d = new int[n + 1][m + 1];
		for (i = 0; i <= n; i++) {
			d[i][0] = i;
		}

		for (j = 0; j <= m; j++) {
			d[0][j] = j;
		}
		for (i = 1; i <= n; i++) {

			s_i = s.charAt(i - 1);
			for (j = 1; j <= m; j++) {

				t_j = t.charAt(j - 1);
				if (s_i == t_j) {
					cost = 0;
				} else {
					cost = 1;
				}
				d[i][j] = Minimum(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1] + cost);
			}

		}
		return d[n][m];

	}

}
