package com.java.program.Array;

public class ArrayOfStrings {
	public static void main(String[] args) {
		String  world [] = new String[3];
		world[0] = "Hello";
		world [1] = "Guys";
		world [2] = "Welcome to this world";
		for(int i=0; i<world.length;i++) {
			System.out.println(world[i]);	
		}
		
	}

}
