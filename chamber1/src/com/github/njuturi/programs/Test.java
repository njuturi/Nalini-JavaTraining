package com.github.njuturi.programs;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class Test{

	public static void main(String arg[]){
		double a1 = 55;
		double a2 = 89;
		
		double c = a1+a2;
		
		double r1 = c/a2;
		System.out.println(r1);
		double r2 = a2/a1;
		System.out.println(r2);
		
	
		 DecimalFormat df = new DecimalFormat("#.#####");
		 String x = df.format(r1);
		 r1 = Double.parseDouble(x);
		 System.out.println(r1);
		 r2 = Double.parseDouble(df.format(r2));
		System.out.println(r2);
		if(r1 == r2){
			System.out.println("Both Are same");
		}
		
		
		
	}
}