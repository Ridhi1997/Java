package com.java.program.Array;

import java.util.Arrays;

public class FillTest {
	public static void main(String[] args) {
		int arr [] = new int[6];
		Arrays.fill(arr, 50);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		Arrays.fill(arr, 3, 6, 20);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
