package JavaPractice.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StringsProblem {

	//private static final String "ababacad"; = null;

	public static void  main(String[] args) {
		// count the occurrence of the character
		
	    String str = "HELLO WORLD LLL";
	    char rep  = 'L';
	    int count =0;
	    
	    
	     for(int i=0; i<str.length(); i++) {
	  
	    	if(str.charAt(i) == rep) {
				count ++;
	    	 }

 	     }
	   	 System.out.println("count of  occurence " + count + " times");
	   	 
	   	 //count occurence of each character in a string
	   	 

	  // Remove Duplicates from a String
	   	 
	   	 String str2 = "ababacad";
	   	 StringBuilder sb = new StringBuilder();
	   	 boolean[] seen = new boolean[256];
	   	 for(int i=0; i<str2.length(); i++ ) {
	   		 char c = str2.charAt(i);
	   		 if(!seen[c] ) {
	   			 sb.append(c);
	   			 seen[c] = true;
	   		 }
	   		 
	   	 }
	   	 
	   	 System.out.println("remove duplicate from the string : " + sb.toString());
	   	 
	   	 
	   	 // using HashSet method to remove duplicate
	   	 String input = "programming";
	   	 HashSet<Character> charset =  new HashSet<>();
	   	 StringBuilder result = new StringBuilder();
	   	 
	   	 for(char c : input.toCharArray() ) {
	   		 // add the character in the set if not already present
	   		 if(charset.add(c)) {
	   			 result.append(c);
	   		 }
	   		 
	   	 }
	   	 
	   	 System.out.println("remove duplicate from the string using Hashset: " + result.toString());  	 

	   	 
	   	 // reverse each word in a string without reversing the whole sentence
	   	 
	   	 String oldstr = "Try programming";
	   	 String []newstr = oldstr.split("\\s+");
	   	 StringBuilder reverseSentance = new StringBuilder();
             
	   	 for(String word : newstr) {
	   		 String reverseword = new StringBuilder(word).reverse().toString();
	   		reverseSentance.append(reverseword).append(" ");
	   	 }

	   	 
	   	 System.out.println("reverse each word: " + reverseSentance);

	   	
	   	//using for loop  first iterate using for loop
	   	
//	   	for(int i =0; i<newstr.length; i++) {
//	   		String s1 = newstr[i];
//	   		String s2 = " ";
//	   		
	   		//reverse each word using a for loop
	   		//for(int j=s1.length()-1; j>=0; j--) {
	   		//	s2 = s2+ s1.charAt(j);
	   		//}
            // Add the reversed word to the result and a space if not the last word
	   		//reverseSentance.append(s2);
//            if (i < newstr.length - 1) {
//            	reverseSentance.append(" ");
//            }

	   		
	   	}
	   	
	   	
		 // System.out.println("reverse each word: " + reverseSentance);

	   	
	   	
	}
	

	//}

	





		
		





