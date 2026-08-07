package MapPrroblem;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "swiss";
  		char ch[] = str.toLowerCase().toCharArray();
  		LinkedHashMap<Character, Integer>hashmap = new LinkedHashMap<>();
  	    for(char c:ch){
  	        if(c !=' '){
  	        hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
  	    }}
  	//printing the character and First NON repeating character
  	for(Map.Entry<Character, Integer>entry : hashmap.entrySet()){
  	    if(entry.getValue()==1){
  	        System.out.println(entry.getKey() + ":" );
  	        break;
  	    }
  	}			
		

	}

}
