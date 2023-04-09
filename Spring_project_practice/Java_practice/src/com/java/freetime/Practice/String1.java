package com.java.freetime.Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;

//sample input : "2023-09-31";
//output : Day: 31
//Month :09
//year:2023
public class String1 {
public static void main(String[] args) {
	String str="2023-09-31";
	String[] word =str.split("-");
	for(String words: word) {
	
//	System.out.println(words);
	}
	LocalDate ldt = LocalDate.now();
	System.out.println(ldt);
	
}
}

