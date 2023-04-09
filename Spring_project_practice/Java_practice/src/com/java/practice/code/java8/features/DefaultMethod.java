package com.java.practice.code.java8.features;

interface Readable{
	//default method
	default void read() {
		System.out.println("Hello,This is default method.");
	}
	abstract void readMore(String str); // abstract method
}

public class DefaultMethod  implements Readable{

	@Override
	public void readMore(String str) {
		 System.out.println(str); // implementing abstract method 
		
	}
	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.read(); // calling default() method
		dm.readMore("Reading is good for life"); // calling abstract method.
	}

}
