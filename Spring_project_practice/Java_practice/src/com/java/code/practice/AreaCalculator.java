package com.java.code.practice;

public class AreaCalculator {
	public static void main(String[] args) {
		 
		
		System.out.println(area(5.0));
		System.out.println(area(-1));
		
		System.out.println(area(5.0, 4.0));
		System.out.println(area(-2.0, 4.0));
		
	}
	public static double area(double radius) {
        double  areaOfCircle=0.0;
		if(radius >0) {
		     areaOfCircle = Math.PI*radius*radius;
		}
		else if(radius <0){
		    areaOfCircle=-1.0;
		}
		return areaOfCircle;
	}
	public static double area(double x, double y) {
	    double areaOfRectangle=0.0;
		if(x >0 && y >0) {
			areaOfRectangle= x*y;
		}
		else if(x <0 || y <0){
		areaOfRectangle=-1.0;
		}
		return areaOfRectangle;
	}
}
