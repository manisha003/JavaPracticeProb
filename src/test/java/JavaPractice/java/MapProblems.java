package JavaPractice.java;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProblems {

	public static void main(String[] args) {
		
		//Write a program to sort a Map by its values.
				HashMap<String, Integer>hashmap = new HashMap<>();
				hashmap.put("Orange", 4);
				hashmap.put("Apple", 2);
				hashmap.put("Grapes", 6);
				hashmap.put("Banana", 1);
				hashmap.put("Cherry", 3);
				
		       System.out.println("hashmap unsorted values are: " + hashmap);
		     //Printing key-value pairs 
		         
		        Set<Entry<String, Integer>> entrySet = hashmap.entrySet();
		         
		        for (Entry<String, Integer> entry : entrySet) 
		        {
		            System.out.println(entry.getKey()+" : "+entry.getValue());
		        }
		         
		       
//		        for(Map.Entry<String, Integer> entry : hashmap.entrySet()) {
//				       System.out.println(entry.getKey() + " : " + entry.getValue());
//
//		        }
		        
		        
		       
	}

}
