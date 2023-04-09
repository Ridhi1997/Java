package com.java.program.String;

public class ReverseStringSentence {
	public static void main(String[] args) {
		String sentence =" i love india ";
		String[] str = sentence.split(" ");
		String reverse = "";
		for(int i = str.length-1; i>=0; i--) {
			reverse += str[i]+" ";
		}
		System.out.println(reverse);
	}

}
