package com.java.DSA;

/*Time Complexity: O(log(n)) 
Auxiliary Space: O(log(n)),  where n is the input number. */

public class ReverseDigitsOfNumberRecursive {
	static int rev_num=0;
	static int base_position=1;
	public static int reverseDigitOfNumber(int num) {
		if(num > 0) {
		reverseDigitOfNumber(num/10);
		rev_num +=(num % 10) *base_position;
		base_position *=10;
		}
		return rev_num;
		
	}
public static void main(String[] args) {
	 int num = 4562;
	
	 System.out.println( reverseDigitOfNumber(num));
}

}
