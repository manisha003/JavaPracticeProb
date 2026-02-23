package JavaPractice.java;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {

	public static void main(String[] args) {
		
		// chararcter count occurence
		String  words = " Publicis Sapient ";
		words = words.toLowerCase().trim();
		HashMap<Character, Integer>charcount = new HashMap<>();
        // Iterate through the string and count characters

		for(char c : words.toCharArray()) {
			System.out.println("charcaters :" + c);
			if(c!= ' ') // excludes spaces {
			if( charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c)+1);
			}else {    
				charcount.put(c, 1);
			}
		}
		
	
		System.out.println("charcaters occurence :");
       // print map in readable format
		for(Map.Entry<Character, Integer>entry :charcount.entrySet()) {
			System.out.println(entry.getKey() +  " : " + entry.getValue());
		}
		
		
	
	}
}


