package com.java.code.practice;

public class LastDigitChecker {
	public static void main(String[] args) {
		//System.out.println(hasSameLastDigit (41, 22, 71));
	 System.out.println(hasSameLastDigit (22, 23, 34));
        // System.out.println(hasSameLastDigit (9, 99, 999));
       //  System.out.println(isValid(10));
	 System.out.println(isValid(1000));
        // System.out.println(isValid(1051));
	}
	public static boolean hasSameLastDigit(int fDigit, int sDigit, int lDigit) {
		  
	    if((isValid(fDigit) && isValid(sDigit) && isValid(lDigit))) {
	    
	      if((fDigit % 10 == sDigit % 10) || (fDigit % 10 == lDigit % 10) ||(sDigit % 10 == lDigit % 10) ) {
	      
	        return true;
	      
	      }
	    
	    }
	    return false;
	  
	  }
	public static boolean  isValid(int range) {
		if(range < 10 || range > 1000) {
			return false;
		}
		return true;
		
	}

}
