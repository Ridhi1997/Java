package com.java.code.practice;

public class PrimeNumber {
public static void main(String[] args) {
	int wholeNumber =4;
	
	System.out.println(isPrime(wholeNumber));
	
}
public static boolean isPrime(int wholeNumber) {
	if(wholeNumber <= 2) {
		return (wholeNumber==2);
	}
	for(int divisor =2; divisor <=wholeNumber/2; divisor++) {
		if(wholeNumber % divisor ==0) {
			return false;
		}
	}
	return true;
	
}
}
