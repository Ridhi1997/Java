package com.prgram.practice.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
public static void main(String[] args) {
	//int nums[] = {3,0,1};
	int nums []  = {0,1};

	System.out.println(	missingNumber(nums));
	
	System.out.println();
	
	
	System.out.println(missingNumberWithHashSet(nums));
	System.out.println();
	
	
	System.out.println(missingNumberByusingBitMannipulation(nums));
	
	System.out.println();
	
	System.out.println(missingNumber4(nums));
	
	
}
//Approach #1 Sorting
public static int missingNumber(int[] nums) {
	Arrays.sort(nums);
	
	//check length for num.length
	if(nums[nums.length-1] != nums.length) {
		return nums.length;
	}
	  // Ensure that 0 is at the first index
	else if(nums[0] != 0){
		return 0;
	}
	for(int i= 1; i<nums.length; i++) {
		int expectedNumber = nums[i-1]+1;
		if(nums[i] != expectedNumber) {
			return expectedNumber;
		}
	}
	
	return -1;
	
}

//Approach #2 HashSet
public static int missingNumberWithHashSet(int nums[]) {
	Set<Integer> setNum = new HashSet<>();
	for(int num :nums) {
		setNum.add(num);
	}
	int expectedNumberCount = nums.length+1;
	for(int number =0; number<expectedNumberCount; number++) {
		if(!setNum.contains(number)) {
			return number;
		}
	}
	return -1;
	
}
//Approach #3 Bit Mannipulation
public static int missingNumberByusingBitMannipulation(int nums[]) {
	int missingNumber = nums.length;
	for(int i=0; i<nums.length; i++) {
		missingNumber ^= i ^ nums[i];
	}
	return missingNumber;	
}

//Approach #4 Gauss' Formula
public static int missingNumber4(int[] nums) {
	int expectedSum = nums.length * (nums.length+1)/2;
	int actualSum=0;
	for(int num : nums) {
		actualSum += num;
	}
	
	return expectedSum- actualSum;
	
}



}
