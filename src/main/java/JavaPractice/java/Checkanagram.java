package JavaPractice.java;

import java.util.Arrays;
import java.util.Scanner;

public class Checkanagram {

	public static void main(String[] args) {
		//create and object of scanner class "Two string having the same character and frequency"
        Scanner sc = new Scanner(System.in);
           
        // take input from user
        System.out.println("Enter first string: ");
         String str1 = sc.nextLine();
         
         System.out.println("Enter second string: ");
         String str2 = sc.nextLine();
         
        // check length of both string
         if(str1.length() == str2.length()) {
        	 
        	   // convert the string toCharArray
        	char[] chararray1 = str1.toCharArray();
        	char[] chararray2 = str2.toCharArray();
        	
        	//sort the array
        	Arrays.sort(chararray1);
        	Arrays.sort(chararray2);
        	
        	// if sorted char array are same then string are anagram
        	
        	boolean result = Arrays.equals(chararray1, chararray2);
        	
        	if(result) {
        		
        		System.out.println("Strings are anagram with each other");
        	}
        	else {
        		System.out.println("Strings are not anagram with each other");

        	}  	 
         }
         else {
 		System.out.println("Strings are not  anagram with each other");
         }
	}

}
