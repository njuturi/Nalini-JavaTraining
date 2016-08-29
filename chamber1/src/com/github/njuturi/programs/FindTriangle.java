package com.github.njuturi.programs;
//http://www.mathwarehouse.com/geometry/triangles/triangle-types.php

import java.util.Scanner;

public class FindTriangle {
	
	
	public static String getTriangle(double side1,double side2,double side3){
		
		boolean isTriangle;
		String triangleName = null;
		
		
		if((side1+side2)>side3 && (side2+side3)>side1 && (side3+side1)>side2 ){
			isTriangle = true;
		}else{
			isTriangle = false;
		}
		
		if(isTriangle){
			if(((side1*side1) == ((side2*side2) + (side3*side3))) ||
					((side2*side2) == ((side1*side1) + (side3*side3)))||
					((side3*side3) == ((side2*side2) + (side1*side1)))){
				
				triangleName = "RightAngle";
				
			}else if((side1==side2) && (side1==side3)){
				triangleName = "Equilateral Triangle";
			}else if(((side1==side2)&&(side1!=side3)) || 
					((side1==side3)&&(side1!=side2)) ||
					((side2==side3)&&(side2!=side1))){
				triangleName = "isosceles Triangle";
			}else if((side1!=side2)&&(side1!=side3)&&(side2!=side3)){
				triangleName = "scalene Triangle";
			}
			
			return triangleName;
		}
		else{
			return "Triangle Not Formed";
		}
	
	}
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three sides of the triangle");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		String result = FindTriangle.getTriangle(a,b,c);
		System.out.println(result);
		scanner.close();
	}

}
