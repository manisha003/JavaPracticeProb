package JavaPractice.java;

public class StringProblem1 {

	public static void main(String[] args) {
		
		
		//reverse the srting word
		String newstring = "Java Programming";
		String[] str2 = newstring.split("\\s+");
	   	 StringBuilder reverseWord = new StringBuilder();

	   	 
	   	 for(String word : str2) {
	   		 String reverseword = new StringBuilder(word).reverse().toString();
	   		reverseWord.append(reverseword).append(" ");
	   	 }

	   	 
	   	 System.out.println("reverse each word: " + reverseWord);

         
	   	 //reverse the sentence not word
	   	String str11 = "Java Programming";
		String[] str12 = str11.split("\\s+"); 
  		 StringBuilder reverseSentance = new StringBuilder();
	   	 for(int i = str12.length-1; i>=0; i--) {
	   		 reverseSentance.append(str12[i]);
	   		 if(i!=0) {
	   			 reverseSentance.append(" "); // Add space between words
	   		 }
	   	 }
		
	   	 System.out.println("reverse sentance: " + reverseSentance);
	   	 
	   //	 int marks [] = {20,20,20,44,94}; 
}
}