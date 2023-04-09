package com.java.program.Array;

import java.util.Arrays;

public class InitializeElementsWithFill {
	public static void main(String[] args) {
		int arr [] = new int[]{1,4,7,8,9};
		
		System.out.println("Actual values");
		for(int values : arr) {
			System.out.println("values = "+values);
		}
		
		 // using fill for placing 18
		Arrays.fill(arr, 18);
		
		System.out.println("value using fill method ");
		for(int values :arr) {
			System.out.println("Values = "+values);
		}
		
	}

}
