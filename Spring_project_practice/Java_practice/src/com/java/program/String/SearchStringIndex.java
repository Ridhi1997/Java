package com.java.program.String;

public class SearchStringIndex {
public static void main(String[] args) {
	String str = "Hello World Welcome to india ";
	int index = str.indexOf("World");
	
	if(index == -1) {
		System.out.println("World not found ");  // it's give proper index
	}else {
		System.out.println("Found World at index " +index);
	}
	
	
	// second way to find index.
	System.out.println(str.contains("Hello"));  // it will give true   and false values.
	
}
}
