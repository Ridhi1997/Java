package com.java.program.Array;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		reverseArray(arr);
		System.out.println();
		
		reverseElementByusingReverseMethod();
	}
	public static void reverseArray(int arr[]) {
		for(int i=arr.length-1; i>0; i--) {
			System.out.print(arr[i]+" ");
			
		}
	}
	
	public static void reverseElementByusingReverseMethod() {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("Before reverse order"+list);
		Collections.reverse(list);
		System.out.println("After reverse"+list);
	}

}
