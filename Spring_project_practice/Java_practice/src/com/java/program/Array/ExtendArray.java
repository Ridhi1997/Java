package com.java.program.Array;

public class ExtendArray {
	public static void main(String[] args) {
		extendArraySize();
		
	}
	public static void extendArraySize() {
		String names[] =new String[] {"Ridhi","Nidhi"};
		String extended [] = new String[5];
		extended [2] = "golu";
		extended [3] = "Guddi";
		extended [4] = "Rupa";
        System.arraycopy(names, 0, extended, 0, names.length);
		
		for(String str : extended)
		{
			System.out.println(str);
		}
	}

}
