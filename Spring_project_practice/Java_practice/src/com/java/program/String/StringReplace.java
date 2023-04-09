package com.java.program.String;

public class StringReplace {
	public static void main(String[] args) {
		String str ="Ridhi Mishra";
		System.out.println(str.replace('i', 'o'));
		System.out.println(str.replaceFirst("Rid", "Hello"));
		System.out.println(str.replaceAll("Ridhi","Hello Java"));
	}

}
