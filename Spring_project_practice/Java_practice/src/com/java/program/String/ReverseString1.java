package com.java.program.String;

public class ReverseString1 {
public static void main(String[] args) {
	String str = "abcdefgh";
	String  reverse = new StringBuffer(str).reverse().toString();
	System.out.println("Before reverse string "+str);
	System.out.println("After reverse string  "+reverse);
}
}
