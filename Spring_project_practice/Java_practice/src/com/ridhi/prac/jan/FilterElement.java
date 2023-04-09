package com.ridhi.prac.jan;

public class FilterElement {
public static void main(String[] args) {
	int arr[]= {10,20,5,40,80};
	 getMultipleOfFive(arr);
	 
	 System.out.println();
	 int arr1[] = {10,40,60,70,90};
	 getMultipleOfTen(arr1);
	 
	}
	  
	
 
public  static void getMultipleOfFive(int []arr) {
 
	for(int i=0;i<arr.length;i++) {
		if(arr[i] % 8==0) {
			 System.out.print(arr[i]+" ");
			
		}
		
	}	 
}
public static void getMultipleOfTen(int arr1[]){
	for(int i=0; i<arr1.length;i++) {
		if(arr1[i] % 9==0) {
			System.out.print(arr1[i]+" ");
		}
	}
	
	
}

}
