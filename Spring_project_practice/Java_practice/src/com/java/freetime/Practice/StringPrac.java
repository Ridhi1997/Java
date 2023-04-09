package com.java.freetime.Practice;

public class StringPrac {
	public static void main(String[] args) {
		String s="RidhiMishra";
		String result =" ";
		String res=" ";
		String rest=" ";
		for(int i=s.length()-1;i>=5;i--) {
			result+=s.charAt(i);
		 
		}
		System.out.println(result);
		
		System.out.println();
		for(int i=2; i>=0; i--) {
			res += s.charAt(i);
		}
		System.out.println(res);
		
	 
		
		 
	}

}
