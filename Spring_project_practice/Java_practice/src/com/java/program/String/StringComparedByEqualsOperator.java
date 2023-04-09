package com.java.program.String;

public class StringComparedByEqualsOperator {
	public static void main(String[] args) {
		String s1 = "RidhiMishra";
		String s2 = "RidhiMishra";
		String s3 = new String("RidhiMishra");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
	}

}
