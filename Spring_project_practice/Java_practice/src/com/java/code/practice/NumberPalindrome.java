package com.java.code.practice;
/*Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.*/

public class NumberPalindrome {
public static void main(String[] args) {
	//System.out.println(isPalindrome(707));
	//System.out.println(isPalindrome(11212));
	System.out.println(isPalindrome(-1221));
	
}
public static boolean isPalindrome(int number) {
	int  reverse = 0 ;
	int orginalNumber = number;
	while( number != 0) {
		int lastDigit = number % 10;
		reverse = (reverse * 10)+lastDigit;
		number = number / 10;
		
	}
	return orginalNumber == reverse;
	
}
}
