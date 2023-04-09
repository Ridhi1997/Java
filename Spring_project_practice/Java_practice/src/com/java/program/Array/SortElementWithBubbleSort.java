package com.java.program.Array;

public class SortElementWithBubbleSort {
public static void main(String[] args) {
	   int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	   System.out.println("Array before sort");
	   for(int i=0; i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   System.out.println();
	   
	   sortElementWithBubbleSort(arr);
	   System.out.println();
	   System.out.println("Array after bubble sort");
	   
	   for(int i=0; i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
}
public static void sortElementWithBubbleSort(int arr[]) {
	int n = arr.length;
	int temp = 0;
	for(int i=0; i<n; i++) {
		for(int j=1; j<n-i; j++) {
			 if(arr[j-1] > arr[i]) {
				 temp = arr[j-1];
				 arr[j-1] = arr[j];
				 arr[j] = temp;
			 }
		}
	}
}
}
