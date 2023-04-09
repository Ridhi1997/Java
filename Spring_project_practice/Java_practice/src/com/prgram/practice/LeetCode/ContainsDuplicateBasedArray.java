package com.prgram.practice.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateBasedArray {
	public static void main(String[] args) {
	int	arr[] = {1,2,3,1};
	
	System.out.println(containsDuplicate(arr));
	
	System.out.println();
	
	System.out.println(containsDuplicatebyUsingSortingApproch(arr));
	
	System.out.println();
	
	System.out.println(checkContainDuplicateWithHashTable(arr));
	}
	
	//Approach #1 (Naive Linear Search) [Time Limit Exceeded]
	public static boolean containsDuplicate(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j< i;j++) {
				if(arr[j]== arr[i])
				 return true;
			}
			 	 
		}
		return false;
	}
	
	//Approach #2 Sorting
	public static boolean containsDuplicatebyUsingSortingApproch(int arr[]) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				return true;
			}
		}
		return false;
		
	}
	
	//Approach #3 Hash Table
	public static boolean checkContainDuplicateWithHashTable(int arr[]) {
		Set<Integer> set = new HashSet<>(arr.length);
	    for (int num: arr) {
	      if (set.contains(num)) {
	        return true;
	      }
	    }
		
		return false;
		
	}

}
