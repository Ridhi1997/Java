package com.java.program.String;

public class StringRegionMatch {
	public static void main(String[] args) {
		String firstWord = "Welcome to AccionLabs ";
		String secondWord = "I work with AccionLabs ";
		boolean match = firstWord.regionMatches(11, secondWord, 12, 10);
		System.out.println(match);
	}

}
