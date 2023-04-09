package com.java.code.practice;

public class MinutesToYearsAndDaysCalculator {
	public static void main(String[] args) {
	 /*long res= printYearsAndDays(561600);
		 
		 System.out.println(res);*/
		printYearsAndDays(525600);
		printYearsAndDays(561600);
		printYearsAndDays(1051200);
	}
	/*public static long printYearsAndDays(long minutes) {
		if(minutes < 0) {
			System.out.println("Invalid Value");
			}
		else {
			long mintuesInYear =60*24*365;
			long year=(minutes/mintuesInYear);
			long days =(minutes/60/24)%365;
		 
			 
			System.out.println(minutes+" min ="+year+"y and "+days+"d");
		}
		return minutes;
		 
	}*/
	public static void printYearsAndDays(long minutes){

        if (minutes <0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long minutesRemaining = (minutes - (years * 525600));
            long daysRemaining = minutesRemaining / 1440;

            System.out.println(minutes + " min = " + years + " y and " + daysRemaining + " d");
        }
    }
	

}
