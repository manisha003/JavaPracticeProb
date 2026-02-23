package InterviewPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		 String s = sc.nextLine();
		String str = "";
		for(int i = s.length()-1; i>=0; i--) {
			
				str = str + s.charAt(i);
		}
		
		if(s.equals(str)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string are not palindrome");
		}

	}

}
