package JavaPractice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProblem1 {

	public static void main(String[] args) {

		String  words = "Publicis Sapient";
		words = words.toLowerCase().trim();
		HashMap<Character,Integer>charCount = new HashMap<>();

		for(char c : words.toCharArray()) {
			System.out.println("printing characters: " + c);
			if(c!= ' ') //excludes spaces
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) +1)  ;
			}else { 
				charCount.put(c, 1);
			}		
			}
		
        // Display the character counts
	    System.out.println("Display character count occurence: ");

		
	
	for(Map.Entry<Character, Integer>entry : charCount.entrySet()) {
		
		System.out.println(entry.getKey()+ " : " +entry.getValue());
	}


	}
}
