package com.java.program.Array;

public class SearchAnElementByusingLinearSearch {
public static void main(String[] args) {
	 int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	 
	 int target = -2;
	 for(int i = 0; i<array.length; i++) {
		 if(array[i] == target) {
			 System.out.println("Element found at index "+ i);
			 break;
		 }
	 }
}
}
