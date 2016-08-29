package com.github.njuturi.programs;

public class BitwiseAndLogicalOperatorsTest {
	
	public static void main(String arg[]){
		int i=5;
		int j=7;
		int k=4;
		if(i>j && ++k==i){
			System.out.println("Mahesh");
		}
		if(i>j & ++k==i){
			System.out.println("Pawan Kalyan");
		}
		System.out.printf("%d,%d,%d\t",i,j,k);
		
		if(i>j | ++k == i){
			System.out.println("Chiru");
		}
		
		System.out.printf("%d,%d,%d\t",i,j,k);
		
		if(i>j || ++k == i){
			System.out.println("Ram");
		}
		
		System.out.printf("%d,%d,%d\t",i,j,k);
		
		if(i<j && ++k == i){
			System.out.println("Sitha");
		}
		
		System.out.printf("%d,%d,%d\t",i,j,k);
		
		if(i<j && i==5 && ++k == i){
			System.out.println("lakshman");
		}
		
		System.out.printf("%d,%d,%d\t",i,j,k);
		
		if(i<j || i==5 || ++k == i){
			System.out.println("lakshman");
		}
		
		System.out.printf("%d,%d,%d",i,j,k);
		
		if(i<j | i==5 | ++k == i){
			System.out.println("ravan");
		}
		
		System.out.printf("%d,%d,%d",i,j,k);
		
	}

}
