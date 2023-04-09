package com.java.interview.code;

import java.util.*;

public class ArrayaListProgram {

	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("Ridhi");
		name.add("Nidhi");
		name.add("Rakhi");
		name.add("Golu");
		for(int i=0;i<name.size();i++) {
			if(i%2!=0) {
				System.out.println(name.get(i));
			}
		}
	}

}

