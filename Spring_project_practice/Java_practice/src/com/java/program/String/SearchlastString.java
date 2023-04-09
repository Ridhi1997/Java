package com.java.program.String;

public class SearchlastString {
	public static void main(String[] args) {
		String word =" Helloworld";
		int lastIndex = word.lastIndexOf("world");
		
		if(lastIndex == -1) {
			System.out.println("world not found ");
		}else {
			System.out.println("Last occurance of index "+lastIndex);
		}
		String  str ="RidhiMishra";
		int index = str.lastIndexOf("M");
		System.out.println(index);
		
	}
	
	
 

}
