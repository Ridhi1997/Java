package com.java.code.practice;

public class LeapYearCalculator {
public static void main(String[] args) {
	
	System.out.println(isLeapyear(1800));
}
public static boolean isLeapyear(int year) {
	 if (year>=1 && year<=9999)
    {  if (year%4==0){
        if (year%100==0){

            if (year%400==0){
                return true;

            }else {
                return false; //year%400==0 else
            }

        }else {
            return true; //year%100==0 else
        }

    }else {
        return false; // year%4==0 else
    }

    }
    else return false; //this else associated with upper if

	
	 
	
}
}

