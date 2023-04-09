package com.java.code.practice;

public class DigitSum {
	public static void main(String[] args) {
		int number =12345;
		
		System.out.println(digtSum(number));
	}
	 
	public static int digtSum(int number) {
		 if(number < 0) {
			 return -1;
		 }
		 int sum =0;
		 while(number > 9) {
			 sum = (sum+number) %10;
			 number = number /10;
		 }
		 sum +=number;
		return sum;
		  
	}

}
