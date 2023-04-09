package com.ridhi.prac.jan;

import java.util.Arrays;

/*3 sections
 section a
{19,123,345,98,12,34,67};
u have to reverse the array
{67,34,12,98,345,123,19}

section b
find the second largest
output : 123

section c
find the minimum and maximum
 minimum: 12,max: 345

coding instructions:
separate methods for each
static methods
return type should be proper
*/

public class Practice {
	public static void main(String[] args) {
		int arr[] = { 21,33,12,66,55,7,19 };
		int[] a = reverseArray(arr);
		for (int res : a) {
			System.out.print(res + " ");
		}
		System.out.println();
		int r = findSecondLargest(arr);
		System.out.println(r);
		
	
		int   ab =findMinimumAndMaximum(arr);
		 System.out.println(ab);

	}

	public static int[] reverseArray(int arr[]) {
		int[] res = new int[arr.length];
		int val = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			res[val] = arr[i];
			val++;
		}
		return res;

	}

	public static int findSecondLargest(int arr[]) {
		int max = 0;
		int secondLargest =0;
		 
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > max) {
				secondLargest = max;
				max = arr[i];
			}else if(secondLargest < arr[i] && arr[i]!=max) {
				secondLargest = arr[i];
			}
			

		}
		return secondLargest;
		 
	}

	public static int findMinimumAndMaximum(int arr[]) {
		int min =arr[0];
		for(int i=0; i < arr.length-1;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
		
	}
}
