package MapPrroblem;

import java.util.HashMap;
import java.util.Map;

public class Hasmap1 {

	public static void main(String[] args) {
		// print the hashmap values
		HashMap<Integer, String>hashmap = new HashMap<>();
		hashmap.put(1, "Mango");
		hashmap.put(2, "Apple");
		hashmap.put(3, "Grapes");
		hashmap.put(4, "Banana");
		hashmap.put(5, "Plum");

//         for(Map.Entry<Integer, String>entry : hashmap.entrySet()) {
//        	 System.out.println(entry.getKey() + " " + entry.getValue());
//         }
         
         // when only wants keys using Keyset()

         for(Integer key : hashmap.keySet()) {
        	 System.out.println("Keys are "+ key + " Value :" + hashmap.get(key));
 
         }
	}

}
