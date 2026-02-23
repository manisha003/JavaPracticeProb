package JavaPractice.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExampleNine {
	
	 public static void main(String[] args) 
	    {
	        //Creating the HashMap 
	         
	        HashMap<Integer, String> map = new HashMap<Integer, String>();
	         
	        //Adding key-value pairs to HashMap
	         
	        map.put(1, "AAA");
	         
	        map.put(2, "BBB");
	         
	        map.put(3, "CCC");
	         
	        map.put(4, "DDD");
	         
	        map.put(5, "EEE");
	         
	        //Retrieving the Collection view of values present in map
	         
	        Collection<String> values = map.values();
	      Set<Integer>keyValue =  map.keySet();
	      
	      for(Integer keys : keyValue) {
	            System.out.println("printing the keys values: " + keys);

	      }
	         
	        for (String value : values) 
	        {
	            System.out.println("Values are : "+value);
	        }
	        
	       
	        
	        System.out.println("Printing the map values: " + map.get(5));
	    }   

}
