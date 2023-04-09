package com.ridhi.prac.jan;

public class ReverseElement {
	public static void main(String[] args) {
		int arr[]= {10,20,5,40,80};
		for(int i =arr.length-1; i>=0;i--) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		getPrint(arr);
	}
   
	public static void getPrint(int arr[]) {
		int i=0;
		while (i < arr.length) {
			System.out.print(arr[i]+" ");
			i++;
			
		}
	}

}
