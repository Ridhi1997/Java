package com.java.freetime.Practice;

public class StringPrac2 {
	public static void main(String[] args) {
		String s="RidhiMis";
		String res=" ";
		int count =0;
		for(int i=0; i<s.length();i++) {
			res+=s.charAt(i);
			count ++;
		}
		System.out.println(res);
		System.out.println(count);
	}

}
