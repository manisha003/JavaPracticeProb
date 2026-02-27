package JavaStringQuestions;

import java.util.HashMap;
import java.util.Map;
public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String input="testing is important testing abc is manisha important";
	    String []countWords = input.split(" ");
	    HashMap<String, Integer> hashmap = new HashMap<>();
	    for(String words : countWords){
	        hashmap.put(words, hashmap.getOrDefault(words, 0)+1);
	    }
	     System.out.println("printing count of each words");
	     for(Map.Entry<String, Integer>entry : hashmap.entrySet()){
	         System.out.println(entry.getKey() + " " + entry.getValue());
	     }

	     //print only duplicate words
	     System.out.println("printing count of only duplicate words");
	     for(Map.Entry<String, Integer>entry : hashmap.entrySet()){
	    	 if(entry.getValue()>1) {
	         System.out.println(entry.getKey() + " " + entry.getValue());
	     }}

	}

}
