package com.java.freetime.Practice;

import java.util.ArrayList;
import java.util.List;

public class Digit {
	public static void main(String[] args) {
		
		int num=420;
		int val=num;
		List<Integer> ls = new ArrayList<>();
		 
		 while(val > 0) {	
			int vala =val % 10;
			val=val/10;
			 ls.add(vala);	 
			
		}
		 for(int i=ls.size()-1; i>=0;i--) {
			 System.out.println(ls.get(i));
		 }
		  
		 
		 
			 
		 
		
			
		
	}

}
