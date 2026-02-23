package JavaPractice.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		//Write a program to sort a Map by its values.
		HashMap<String, Integer>hashmap = new HashMap<>();
		hashmap.put("Orange", 4);
		hashmap.put("Apple", 2);
		hashmap.put("Grapes",6);
		hashmap.put("Banana",1);
		hashmap.put("Cherry",3);
		
	TreeMap<Integer, String> tm= new TreeMap();
	 System.out.println("unsorted map");

		 for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
				System.out.println( entry );
	           tm.put(entry.getValue(), entry.getKey());
	       }
		 
		System.out.println("sorted map" + tm);
		
		
		
		
		
		/*
		for(int value : hashmap.values()) {
			System.out.println(value);
		}
		
		/*
       System.out.println("hashmap unsorted values are: " + hashmap);
       
       //sort the map by its values
       List<Map.Entry<String, Integer>> sortMap = new ArrayList<>(hashmap.entrySet());
        
       // Using a custom comparator to sort by values
        sortMap.sort(Map.Entry.comparingByValue());
       
       // Create a LinkedHashMap to preserve the sorted order
       Map<String, Integer> sortedMap = new LinkedHashMap<>();
       for (Map.Entry<String, Integer> entry : sortMap) {
           sortedMap.put(entry.getKey(), entry.getValue());
       }

       System.out.println("Map sorted by values: " + sortedMap);
       
    // Display the sorted map in a readable format
       System.out.println("Map sorted by values:");
       for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }

	}
	*/

	}	
}
