package com.java.basicConcept.Operator;

public class DemoByUsingTernaryOperator {
	public static void main(String[] args) {
		int ageOfClient=13;
		String ageText=ageOfClient>=18?"Over Eighteen":"Still a kid";
		System.out.println(ageText);
		
		
		String makeOverCar="BMW";
		boolean isDomestic=makeOverCar=="BMW"?false:true;
		String s=(isDomestic)?"This car is domestic":"This car is not a domestic";
		System.out.println(s);
		Math.round(2);
	}

}
