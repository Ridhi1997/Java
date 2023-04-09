package com.ridhi.prac.jan;

public class Practice2 {
	public static void main(String[] args) {
		int arr [] ={ 21, 33,12,66,55,7};
		int res1=findNumberDivisibleByThree(arr);
		System.out.println();
		int res2=findEvenNumber(arr);
		System.out.println();
		checkEvenAndOddNumberIsDivisibleByThree(arr);
		int res3=res1+res2;
		int finalRes=getValue(res3);
		System.out.println(finalRes);
		
	}
	public static int findNumberDivisibleByThree(int arr[]) {
		int sum1=0;
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i] % 3 == 0) {
				sum1+=arr[i];
			}
			 
		}
		return sum1;
	}
	public static int  findEvenNumber(int arr[]) {
		int sum2=0;
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i] % 2 == 0) {
				sum2+=arr[i];
			}
		}
		return sum2;
	}
	public static void checkEvenAndOddNumberIsDivisibleByThree(int arr[]) {
//		int sumOfOdd=0;
//		for(int i=0; i<arr.length-1;i++) {
//			if(arr[i] % 3 == 0) {
//				sumOfOdd +=arr[i];
//			}
//			 
//		}
//		System.out.print(sumOfOdd+" ");
//		
//		int sumOfEven=0;
//		for(int i=0; i<arr.length-1;i++) {
//			
//			if(arr[i] % 2 == 0) {
//				sumOfEven +=arr[i];
//			}
//		}
//		System.out.println(sumOfEven+" ");
//		
//		int sumOfOddEven=sumOfEven+sumOfOdd;
//		if(sumOfOddEven % 3==0) {
//			int res=sumOfOddEven/3;
//			System.out.println("sumOfOddEven is  divisible by 3 : "+sumOfOddEven + "result re  "+ res );
//		}else {
//			System.out.println("sumOfOddEven is not divisible by 3");
//		}
		
		
	}
	public static int getValue (int finlava) {
		int val=0;
		System.err.println(finlava);
		if(finlava%3==0) {
			val=finlava/3;
		}
		return val;
	}

}
