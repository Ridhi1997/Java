package com.java.code.practice;

public class FirstLastDigitSum {
	public static void main(String[] args) {
		
		//System.out.println(sumFirstAndLastDigit(212));
		//System.out.println(sumFirstAndLastDigit(-10));
		System.out.println(sumFirstAndLastDigit(5));
		
	}
	public static int sumFirstAndLastDigit(int number) {
		if(number < 0) {
			return -1;
		}
		 
		int lastDigit = number % 10;
		while(number >=10) {
			number = number/10;
		}
		 
		return number+ lastDigit;
		
	}

}
