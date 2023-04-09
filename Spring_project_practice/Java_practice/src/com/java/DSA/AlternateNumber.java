package com.java.DSA;

public class AlternateNumber {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
 
	for(int i=0; i<arr.length;i++) {
		if(i %2==0) {
		 
		System.out.print(" "+arr[i]);
		
		} 	 
	}
	System.out.println();
	
	for(int j=arr.length-1; j>=0;j--) {
		if(j % 2 !=0) {
			System.out.print(" "+arr[j]);
		}
	}
	 
	}
	 
}

