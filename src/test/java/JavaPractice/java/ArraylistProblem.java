package JavaPractice.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArraylistProblem {

	public static void main(String[] args) {
		 // program to remove duplicates from an ArrayList.
		List<String>list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		list.add("Apple");
		list.add("Gauva");		
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		list.add("Kiwi");
		
		System.out.println(" Orginal list itmes : " + list);
		
		HashSet<String>removeDuplicate = new HashSet<>(list);
		
		System.out.println(" after remove duplicate: "  + removeDuplicate);
		

	}

}
