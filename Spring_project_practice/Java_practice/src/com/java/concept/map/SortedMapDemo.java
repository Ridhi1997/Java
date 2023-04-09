package com.java.concept.map;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
public static void main(String[] args) {
    // Create a SortedMap object.
	 SortedMap<String, Integer>  map = new TreeMap<>();
	 map.put("B",100);
	 map.put("A", 200);
	 map.put("F",400);
	 map.put("D",500);
	 map.put("E",100);
	 
	 System.out.println("------Key set-------");
	 Set<String> keys =map.keySet();
	  for( String key : keys) {
		  System.out.println(key+"-->"+map.get(key));
	  }
	  
	  System.out.println("enetrySet---");
	  Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
	  
	  for(Map.Entry<String, Integer> entry : entrySet) {
		  System.out.println(entry.getKey()+" --->"+entry.getValue());
	  }
}
}
