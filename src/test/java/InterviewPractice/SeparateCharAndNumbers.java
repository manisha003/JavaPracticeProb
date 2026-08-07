package InterviewPractice;

public class SeparateCharAndNumbers {

	public static void main(String[] args) {
		// Separate character and numbers
		
		String str = "XYZ123";
	       String num ="";
	       String str2 = "";
	        char ch [] = str.toCharArray();
	        for(int i=0; i<=ch.length-1; i++){
	            if(!Character.isDigit(ch[i])){
	                str2 += ch[i];
	            }else{
	                num += ch[i];
	            }
	        }
	        System.out.println("numbers:" + num + " " + " characters:" + str2);

	}

}
