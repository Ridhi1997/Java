package com.java.concept.map;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	map.put("Fruits","Apple");
	map.put("Vegetable","Oninon");
	map.put("Biriyani","Mutton Biriyani");
	map.put("Non-Veg","Dum Biriyani");
	
	System.out.println(map);
	System.out.println(map.get("Fruits"));
	System.out.println("--------------");
	
	for(String res : map.keySet()) {
		System.out.println("Key "+res);
	}
	System.out.println("-------------");
	for(String res : map.values()) {
		System.out.println("Value "+res);
	}
	 
	
}
}
