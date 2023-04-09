package com.java.DSA;
/* Note :-
Time Complexity: O(log10 n), where n is the input number. 
Auxiliary Space: O(1)*/

public class ReverseDigitsOfNumber {
public static void main(String[] args) {
	 int num = 4562;
	
	 System.out.println(" "+reverseDigitNumber(num));
}
//logic by using ITERATIVE WAY .
 public static int reverseDigitNumber(int num) {
	 int rev_num=0;
	 while(num > 0) {
		 rev_num =rev_num *10 + num%10;
		 num =num/10;
	 }
	return rev_num;
	 
 }
}
