package com.java.freetime.Practice;

import java.util.HashMap;
import java.util.Map;

public class VowelCount {
public static void main(String[] args) {
	String str="RIDHIee MISHRA";
	getVowelCount(str);
	getConstantCount(str);
}
	public static void getVowelCount(String str) {
	Map<Character, Integer> map = new HashMap<>();
	for(int i=0; i<str.length();i++) {
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'  || str.charAt(i)=='o' || str.charAt(i)=='u'
				|| str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
				
	}
	System.out.println(map);
	 
	
	}
	
	public static void getConstantCount(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)!='a' || str.charAt(i)!='e' || str.charAt(i)!='i'  || str.charAt(i)!='o' || str.charAt(i)!='u'
					|| str.charAt(i)!='A' || str.charAt(i)!='E' || str.charAt(i)!='I' || str.charAt(i)!='O' || str.charAt(i)!='U') {
				if(map.containsKey(str.charAt(i))){
					map.put(str.charAt(i),map.get(str.charAt(i))+1);
				}else {
					map.put(str.charAt(i), 1);
				}
			} 
			
		}
		System.out.println(map);
	}
}

