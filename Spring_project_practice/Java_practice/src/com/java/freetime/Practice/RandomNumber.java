package com.java.freetime.Practice;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
public static void main(String[] args) {
	int [] result =getRandomNumber(10);
	System.out.println(Arrays.toString(result));
	
}
public static  int[] getRandomNumber(int len) {
	Random random = new Random();
	int [] arr = new int[len];
	for(int i=0; i<len; i++) {
		arr[i]=random.nextInt(100);
	}
	return arr;
	
}
 
}
