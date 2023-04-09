package com.java.program.Array;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMergebysuingInBuiltMethod {
public static void main(String[] args) {
	String a[] = { "A", "E", "I" };
    String b[] = { "O", "U" };
    
    List<String> list = new ArrayList<>(Arrays.asList(a));
  
    list.addAll(Arrays.asList(b));
    
    
    
    Object c [] = list.toArray();
    System.out.println(Arrays.asList(c));
    
}
}
