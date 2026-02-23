package JavaStringQuestions;

public class Reversedcharacter {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 String word = "Manish Kumari";
//		    String reversedWord = " ";
//		    // String[] data = word.split(word);
//		    for(int i = word.length()-1 ;i>=0; i--){
//		        reversedWord =  reversedWord + word.charAt(i);
//		    }
//		  
//		    System.out.println(reversedWord);
		
		 String str = "Manisha Kumari";
	        String str2 = " ";
	       String[] str3 = str.split(" ");
	      //  System.out.println(str3);

	       for(int i=str3.length-1; i>=0; i--){
	         str2 = str2 + str3[i] + " ";
	        }
	        System.out.println(str2);
	}

}
