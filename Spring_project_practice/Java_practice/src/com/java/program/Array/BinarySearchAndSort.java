package com.java.program.Array;

import java.util.Arrays;

public class BinarySearchAndSort {
	public static void main(String[] args) {
		 int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		  Arrays.sort(array);
		  printArray(array);
		 
		 int index = Arrays.binarySearch(array, 2);
		 System.out.println("found 2 @ "+ index);
		
	}
	public static void printArray(int array[]) {
		for(int i =0; i<array.length; i++) {
			if(i != 0) {
				System.out.print(" ,");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

}
