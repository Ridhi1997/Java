package com.java.code.practice;

public class SharedDigit {
	public static void main(String[] args) {
		  System.out.println(hasSharedDigit(12, 23));
		//System.out.println(hasSharedDigit(9, 99));
	}
	public static boolean hasSharedDigit(int num1, int num2) {
		if(num1 < 10 || num2 <10 || num1 >99 || num2 >99) {
			return false;
		}
		int value1= num1 %10;
		int value2 = num2 % 10;
		num1 = num1/10;
		num2 = num2/10;
		
		 
		return (num1 == num2 || num1 == value2 || num2 == value1 || value1== value2);
	}

}
