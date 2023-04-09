package com.java.program.String;

public class RemoveCharaterFromString {
	public static void main(String[] args) {
		String str ="RidhiMisjhra";
		
		System.out.println(remvoeCharacter(str, 3));
	}
	public static String remvoeCharacter(String s, int position ) {
		return s.substring(0, position)+s.substring(position+1);
		
	}

}
