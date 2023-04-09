package com.java.program.String;

public class StringCompareByUsingComparedTo {
	public static void main(String[] args) {
		String s1 = "Ridhi mishra";
		String s2 = "ridhi mishra";
		Object objStr =s1;
		
		String s3 = "Ridhi mishra";
		String s4 = "Ridhi mishra";
		Object objStr1 =s1;
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareTo(objStr.toString()));
		
		

		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));
		System.out.println(s3.compareTo(objStr1.toString()));
	}

}
