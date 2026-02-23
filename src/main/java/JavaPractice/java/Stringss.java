package JavaPractice.java;

public class Stringss {
	

	public static void main(String[] args) {
		// Reverse a string
		String word = "Language";
		
		// conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(word);
        // To reverse the string
       sbr.reverse();
	  System.out.println("reverse string :" + sbr);
	  
	  
	  //reverse string using for loop
	  
	  String rev = "";
		for(int i=0; i<word.length(); i++){
			rev = word.charAt(i) + rev;
			}
		 System.out.println("reverse using for loop: " + rev);
	  
	  
	//,,,,,,,,,,,,,,,,,,,,,NEXT PROGRAM,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,//	
	  String str2 = "Program";
			  
        // Using StringBuilder's reverse() method
        String newstr2 = new StringBuilder(str2).reverse().toString();
		 System.out.println("next exmp to reverse the string Using String Builder : " + newstr2);
		
		
        
		// check if a string is palindrome
		String  str1 = "madam";
		String reverseStr = " ";
		//System.out.print(" ****" + reverseStr);
		for(int i =str1.length()-1;i>=0;i--) {
			reverseStr = reverseStr + str1.charAt(i);
		}
		
		System.out.println("reverse string :" + reverseStr);

		if(str1.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str1 + " is a palindrome string");
	
		}else {
			System.out.println(str1 + " is not a palindrome string");

		}
		

	}

}
