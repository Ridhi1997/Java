package com.java.program.String;

public class StringSplit1 {
public static void main(String[] args) {
	String str = "Ridhi";
	String [] word = str.split("");
	for(String words : word) {
		System.out.println(words);
	}
}
}
