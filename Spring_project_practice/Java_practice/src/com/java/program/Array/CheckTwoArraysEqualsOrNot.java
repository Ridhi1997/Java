package com.java.program.Array;

import java.util.Arrays;

public class CheckTwoArraysEqualsOrNot {
public static void main(String[] args) {
	int[] arr1 = {1,2,3,4,5,6};
    int[] arr2 = {1,2,3,4,5,6};
    
    //one way
    System.out.println(Arrays.equals(arr1, arr2));
    
    
    //2nd logic
    if(Arrays.equals(arr1, arr2)) {
    	System.out.println("same");
    }else {
    	System.out.println("not same");
    }
    
    // 3rd way
    if(arr1 == arr2)
    {
    	System.out.println("same");
    }else {
    	System.out.println("Not same");
    }
    
}
}
