package InterviewPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word: ");
		 String s1 =sc.nextLine();
		//Enter second word
		System.out.println("Enter second word: ");
		 String s2 =sc.nextLine();
		 
		 
		 //remove space and convert to lowercase
		 s1 = s1.replace(" ", "").toLowerCase();
		 s2 = s2.replace(" ", "").toLowerCase();
		 
		 if(s1.length() != s2.length()) {
			 System.out.println("Not Anagram");
			 return;
		 }
		 char[]a1 =s1.toCharArray();
		 char[] a2 = s2.toCharArray();
		 Arrays.sort(a1);
		 Arrays.sort(a2);
		 
		 if(Arrays.equals(a1,a2)) {
			 System.out.println("string are anagrams");
		 }else {
			 System.out.println("string are not anagram");
		 }
		 



	}

}
