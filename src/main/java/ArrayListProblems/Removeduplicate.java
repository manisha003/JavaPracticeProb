package ArrayListProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Removeduplicate {

	public static void main(String[] args) {
		// remove duplicate from the arraylist
		
		List<String> list = new ArrayList<>();
		list.add("man");
		list.add("man");
		list.add("boy");
		list.add("girl");
		list.add("boy");
		list.add("women");
		
		System.out.println("list are:" + list);
		
		HashSet<String>removeduplicate = new HashSet<>(list);
		System.out.println("after removal" + removeduplicate);

	}
	
	

}
