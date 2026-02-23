package JavaStringQuestions;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Madam";
		str = str.toLowerCase();
		String str2 = "";
		for(int i = str.length()-1; i>=0;i--) {
			str2 = str2 + str.charAt(i);
			
		}
            if(str.equals(str2)) {
            	System.out.println("string are palindrome " +str + "old str" + " new str"+str2);
            }else {
            	System.out.println("string are not palindrome ");
            }
	}

}
