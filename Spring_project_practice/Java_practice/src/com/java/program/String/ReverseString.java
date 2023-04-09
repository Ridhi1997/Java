package com.java.program.String;

public class ReverseString {
public static void main(String[] args) {
	 String word = "Hello world";
	 String reverse = "";
	 int count =0;
	 for(int i=word.length()-1; i>=0;i--) {
		 reverse += word.charAt(i);
		 count ++;
	 }
	 System.out.println(reverse);
	 System.out.println(count);
}
}
