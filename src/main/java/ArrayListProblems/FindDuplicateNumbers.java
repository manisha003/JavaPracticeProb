package ArrayListProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		//Approach 2 - Using HASHSET
		int num []= {1,2,3,2,4,5,3};
		
		HashSet<Integer>unique = new HashSet<>();
		HashSet<Integer>duplicate = new HashSet<>();
		for(Integer i :num) {
			if(!unique.add(i)) {
				duplicate.add(i);
			}
		}

		
      System.out.println("Duplicate numbers: " + duplicate);
		
		//***************************************************************************************
      
      //APPROACH 3 - USING ARRAYLIST
//		int num []= {1,2,3,2,4,5,3};
//		ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,2,4,5,3));
//		
//		//count frequency
//		 HashMap<Integer, Integer>hashmap = new HashMap<>();
//	       for(Integer x :list){
//	           hashmap.put(x, hashmap.getOrDefault(x, 0)+1);
//       }
//		
//	       // Print duplicates
//	        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
//	            if (entry.getValue() > 1) {
//	                System.out.println(entry.getKey());
//	            }
//	        }
//		
		
		// APPROACH 1 - USING HASHAMP
//		int num []= {1,2,3,2,4,5,3};
//	       HashMap<Integer, Integer>hashmap = new HashMap<>();
//	       for(Integer x :num){
//	           hashmap.put(x, hashmap.getOrDefault(x, 0)+1);
//	       }
//	       //printing the result
//	       for(Map.Entry<Integer, Integer>entry: hashmap.entrySet()){
//	           if(entry.getValue()>1){
//	               
//	               System.out.println(entry.getKey() + ":" + entry.getValue());
//	           }
//		
//
//	}

	}}

