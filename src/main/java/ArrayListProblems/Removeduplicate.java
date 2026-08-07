package ArrayListProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Removeduplicate {

	public static void main(String[] args) {
		// remove duplicate from the arraylist with hashset
		
		List<String> list = new ArrayList<>();
		list.add("man");
		list.add("man");
		list.add("boy");
		list.add("girl");
		list.add("boy");
		list.add("women");
		
		System.out.println("Old list are:" + list);
		
		HashSet<String>removeduplicate = new HashSet<>(list);
		List<String>uniqueArrayList = new ArrayList<>(removeduplicate);
	    System.out.println("remove duplicates from the list : " + uniqueArrayList);
	    

	}
	
	

}
