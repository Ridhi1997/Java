package com.java.concept.List.LinkedList;

import java.lang.invoke.CallSite;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Ridhi");
		list.add("Nidhi");
		list.add("gopal");
		list.add("Deepa");
		
		System.out.println(list);
		
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		list.addFirst("Sonali"); // to add first in the list.
		System.out.println(list); 
		
		list.addLast("Tina"); //to add last in the list.
		System.out.println(list);
		
		 
	}

}
