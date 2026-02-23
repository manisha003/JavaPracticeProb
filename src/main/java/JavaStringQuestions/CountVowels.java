package JavaStringQuestions;

public class CountVowels {

	public static void main(String[] args) {
		// count vowels and charcaters
		
		String str1 = "PineAppleAndChikoo";
		 str1 =str1.toLowerCase();
		int vowels = 0 ;
		int constant =0;
				
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(ch>= 'a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' ||ch== 'o' ||ch== 'u') {
					vowels ++;
			}
				else {
					constant ++;
				}
			}
		}
	
        System.out.println("total no of vowels are  :" + vowels);
        System.out.println("total no of constants are  :" + constant);

        
	}

}
