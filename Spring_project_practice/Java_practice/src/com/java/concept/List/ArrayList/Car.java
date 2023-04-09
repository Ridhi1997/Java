package com.java.concept.List.ArrayList;

 
import java.util.ArrayList;

public class Car {
	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<>();
		car.add("BMW");
		car.add("XUV");
		car.add("Audi");
		car.add("maruti");
		System.out.println(car);
		System.out.println(car.get(2)); //access an element 
		 car.set(1, "i3"); // to moidify and update the elements
		 System.out.println(car);
	}

}
