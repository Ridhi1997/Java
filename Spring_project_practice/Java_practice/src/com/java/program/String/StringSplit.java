package com.java.program.String;

public class StringSplit {
	public static void main(String[] args) {
		String word = "R i d h i M i s h r a";
		String[] str = word.split("\\s");
		
		for(String str1 : str) {
			System.out.println(str1);
		}
	}

}
