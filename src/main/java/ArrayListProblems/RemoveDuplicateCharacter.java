package ArrayListProblems;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		 //Remove duplicate character from a string
        String str = "automation testing";
         LinkedHashSet<Character>lhs = new LinkedHashSet<>();
         for(int i=0; i<str.length(); i++){
             lhs.add(str.charAt(i));
         }
         //if you want the result as a string
         StringBuilder stb = new StringBuilder();
         for(char c :lhs){
             stb.append(c);
         }
         System.out.println(stb.toString());
         
         
       //**************************************************************************************************//
         LinkedHashSet<Character>lhs2 = new LinkedHashSet<>();

        char []ch= str.toCharArray();
        for(char co : ch) {
        	lhs2.add(co);
        }
        System.out.println("remove duplicate chracter :" + lhs2);
 
         
      
	}

}
