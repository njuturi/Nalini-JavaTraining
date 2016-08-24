package javolin.training.chamber1;

import java.io.*;
import java.math.BigInteger;

public class ReverseTheNumber {
	
	
	public BigInteger reverseNumber(String numberedString){
		
		BigInteger result = BigInteger.ZERO;
		if(numberedString!=null){
		char[] ch = numberedString.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isDigit(ch[i])){
				sb.append(ch[i]);
			}
		}
		String s = sb.toString();
		char[] a = s.toCharArray();
		sb.delete(0, sb.length());
		for(int i=a.length-1;i>=0;i--){
			sb.append(a[i]);
		}
		s= sb.toString();
		result = new BigInteger(sb.toString());
		return result;
		}
		else {
			return result;
		}
		
		
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String number;
		System.out.println("Enter The number");
		number = reader.readLine();
		ReverseTheNumber obj = new ReverseTheNumber();
		BigInteger reverseNumber = obj.reverseNumber(number);
		System.out.println("ReverseNumber:"+reverseNumber);
		

	}

}
