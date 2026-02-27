package JavaStringQuestions;

import java.util.LinkedHashSet;

public class UniqueWordPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
        String input="testing is important testing abc is";
         String [] input1 = input.split(" ");
        LinkedHashSet<String>lhs = new LinkedHashSet<>();
        for(String s :input1) {
        	lhs.add(s);
        }
        
       
        System.out.println("print unique words one by one");
        for(String uniqueWords:lhs) {
        	System.out.println(uniqueWords);
        }
	}

}
