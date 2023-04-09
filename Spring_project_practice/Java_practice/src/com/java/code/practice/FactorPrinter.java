package com.java.code.practice;

public class FactorPrinter {
public static void main(String[] args) {
	printFactors(32);
	
}
public static void printFactors(int numbers) {
	if(numbers < 1) {
		System.out.println("Invalid Value");
	}
	int factotr=0;
	for(int i =1;i<=numbers; i++) {
		if(numbers % i ==0) {
			factotr =i;
			System.out.println(factotr);
		}
	}
	
}
}
