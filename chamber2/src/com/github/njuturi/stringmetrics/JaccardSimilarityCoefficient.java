package com.github.njuturi.stringmetrics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.*;

public class JaccardSimilarityCoefficient {

	Logger logger = LoggerFactory.getLogger(JaccardSimilarityCoefficient.class);

	private String s1, s2;

	public JaccardSimilarityCoefficient(String s1, String s2) {
		this.setS1(s1);
		this.setS2(s2);

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

	public double jaccardCoefficient() {

		String s1 = this.getS1();
		String s2 = this.getS2();

		double j_coeffecient = 0.0;
		List<String> j1 = new ArrayList<String>();
		List<String> j2 = new ArrayList<String>();

		List<String> intersection = new ArrayList<String>();
		List<String> union = new ArrayList<String>();

		if (s1 != null & s2 != null) {

			int j = 0;
			int i = 2;
			while (i <= s1.length()) {
				j1.add(s1.substring(j, i));
				j++;
				i++;
			}

			j = 0;
			i = 2;
			while (i <= s2.length()) {
				j2.add(s2.substring(j, i));
				j++;
				i++;
			}

			Iterator<String> itr1 = j1.iterator();
			while (itr1.hasNext()) {
				String element = itr1.next();
				logger.info("J1:"+element + " ");
			}
			Iterator<String> itr2 = j2.iterator();
			while (itr2.hasNext()) {
				String element = itr2.next();
				logger.info("J2:"+element + " ");
			}

			Iterator<String> iterator = j1.iterator();
			Iterator<String> iterator1 = j2.iterator();
			while (iterator.hasNext()) {
				String val = iterator.next().toString();
				union.add(val);
				while (iterator1.hasNext()) {
					String val1 = iterator1.next().toString();
					union.add(val1);
					if (!intersection.contains(val1)) {
						if (val1.equalsIgnoreCase(val)) {
							intersection.add(val);
							break;
						}
					}
				}

			}
			
			Iterator<String> itr3 = intersection.iterator();
			while (itr3.hasNext()) {
				String element = itr3.next();
				logger.info("intersection:"+element + " ");
			}
			
			Iterator<String> itr4 = union.iterator();
			while (itr4.hasNext()) {
				String element = itr4.next();
				logger.info("union:"+element + " ");
			}

			double intersectionVal = (double) intersection.size();
			double unionVal = (double) union.size();

			logger.info("Intersection:" + intersection);
			logger.info("Union:" + union);

			try {

				j_coeffecient = intersectionVal / unionVal;
				logger.info("j_coeffecient:" + j_coeffecient);

			} catch (ArithmeticException e) {
				logger.info("ArithmeticException:" + e);
			}

			return j_coeffecient;

		} else {
			logger.info("The Strings Must be not null");
			return 0.0;
		}

	}

	public static void main(String arg[]) {

		JaccardSimilarityCoefficient obj = new JaccardSimilarityCoefficient("apple", "a");
		obj.jaccardCoefficient();

	}

}
