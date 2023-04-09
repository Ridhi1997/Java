package com.java.DSA;
/*Input  arr[] = {4, 5, 1, 2}
		Output : arr[] = {2, 1, 5, 4}*/

public class ReverseAnArray {
	public static void main(String[] args) {
		int arr[] = {4, 5, 1, 2};
		reverseArray(arr); // calling method for 1st logic.
		
		System.out.println(  );
		reverseArray2(arr, 0, 3);
		printReverseArray2(arr, 4);
		
		
	}
	//logic 1. Iterative way :
	public static void reverseArray(int arr []) {
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	// Logic 2 Iterative way :
	public static void reverseArray2(int arr[],int start, int end) {
		int temp;
		while(start <  end){
			temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start++;
			end--;
			
		}
	}
	public static void printReverseArray2(int arr[], int size) {
		for(int i =0; i< size; i++) {
			System.out.print(arr[i]+" ");
		}
		 System.out.println();
	}
	
	

}
//Note->Time Complexity : O(n) only one for loop .