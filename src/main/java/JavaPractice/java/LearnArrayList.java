package JavaPractice.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		
		
		 // Write a program to remove duplicates from an ArrayList.
		ArrayList<Integer>arraylist = new ArrayList<Integer>();
		arraylist.add(4);
		arraylist.add(2);
		arraylist.add(4);
		arraylist.add(1);
		arraylist.add(3);
		arraylist.add(1);
		System.out.println(" Orginal arraylist is: " + arraylist);
		
       // HashSet<Integer> hashSet = new HashSet<>(arraylist);
        //we can use linked hashset to maintan order 
       // List<Integer>uniquenumber = new ArrayList<>(new LinkedHashSet<>(arraylist));
        
		//System.out.println("remove duplicate : " + hashSet);
		//System.out.println("remove duplicate with linkedhashed set : " + uniquenumber);

		ArrayList<Integer> uniqueNumbers = new ArrayList<>();
		for(Integer num : arraylist) {
			if(!uniqueNumbers.contains(num)) {
				uniqueNumbers.add(num);
			}
		}

		System.out.println("remove duplicate from arraylist with for loop : " + uniqueNumbers);
		
		


	}

}
