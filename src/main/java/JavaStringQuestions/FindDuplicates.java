package JavaStringQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {
		// Find duplicate words in a  occurence string
		
		String str = "manisha kumari";
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			System.out.println("printing chracters: " + c);
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			} else {
				charCount.put(c , 1);
			}
			
		}
		
		System.out.println("printing occurence of each chracter " );
		for(Map.Entry<Character, Integer>entry : charCount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		

		
		
	}

}
