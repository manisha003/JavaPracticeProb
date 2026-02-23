package ArrayListProblems;

import java.util.ArrayList;

public class Removedupli2 {

	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<>();
		list1.add(35);
		list1.add(30);
		list1.add(30);
		list1.add(30);
		list1.add(30);
		list1.add(50);
		list1.add(50);
		list1.add(20);
		list1.add(10);
		list1.add(5);
		list1.add(5);
		list1.add(25);
		
		//remove duplicate form the integer list
		System.out.println("this is old list data: " + list1);
		ArrayList<Integer> UniqueList = new ArrayList<>();
		//for each loop 
		for(Integer i : list1) {
		   if(!UniqueList.contains(i)) {
			   UniqueList.add(i);
		   }
			
		}
		


		System.out.println("New List:" + UniqueList);


	}

}
