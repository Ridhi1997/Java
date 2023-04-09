package com.java.code.practice;

public class DecimalComparator {
	public static void main(String[] args) {
		
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
	}
	public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
		a= (int)(a*1000);
		b=(int)(b*1000);
		if(a==b) {
			return true;
		}
		return false;
		
	}

}
