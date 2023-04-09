package com.java.code.practice;

public class EvenDigitSum {
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(25236));
		//System.out.println(getEvenDigitSum(-22));
		
	}
	public static int getEvenDigitSum(int number) {
		int sumEvenDigit=0;
		int lastDigit;
		 
		if(number < 0) {
			return -1;
		}
		while(number !=0) {
			lastDigit = number %10;
			if(number % 2==0) {
				sumEvenDigit += lastDigit;
			}
			number =number/10;
		}
		
		 
		return sumEvenDigit;
		 
	}

}
