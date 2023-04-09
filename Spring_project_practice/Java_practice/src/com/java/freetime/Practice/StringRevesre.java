package com.java.freetime.Practice;

public class StringRevesre {
	 
		public static void main(String[] args) {
		    String word ="apple";
		    String result="";
		    for(int i=word.length()-1;i>=0;i--){
		       result+=word.charAt(i);
		    }
		    System.out.print(result);
		}
	}

