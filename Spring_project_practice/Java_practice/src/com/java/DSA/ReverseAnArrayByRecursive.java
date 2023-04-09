package com.java.DSA;

/*input = {1 2 3 4 5 6 }
 
output= {6 5 4 3 2 1 }
*/
public class ReverseAnArrayByRecursive {
public static void main(String[] args) {
	int arr[]={1, 2 ,3, 4, 5 ,6 };
	reverseArrayByusingRecursive(arr, 0, 5);
	printReverseArray(arr, 6);
	
}
public static void reverseArrayByusingRecursive(int arr[],int start, int end) {
	int temp;
	if(start >=end)
		return;
	temp =arr[start];
	arr[start]= arr[end];
	arr[end]= temp;
	reverseArrayByusingRecursive(arr, start+1, end-1);
}

public static void printReverseArray(int arr[], int size) {
	for(int i=0; i<size;i++)
	System.out.print(arr[i]+" ");
}
}

// Note: Time Complexity : O(n) because using only one loop.
