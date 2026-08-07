package JavaStringQuestions;

public class RemoveVowels {

	public static void main(String[] args) {

		String str = "Automation Engineer";
		StringBuilder stb = new StringBuilder();
		for(int i=0 ;i<=str.length()-1;i++) {
				
			char ch = str.charAt(i);
			if("aeiouAEIOU".indexOf(ch)== -1) {
				stb.append(ch);
			}
		}
		System.out.println(stb.toString());
		
		//APPROACH 2ND
		 String str1 = "manisha"; //remove vowels
	        StringBuilder stb2 = new StringBuilder();
	       
//	        for (char ch : str.toCharArray()) {
//
//	            if ("aeiouAEIOU".indexOf(ch) == -1) {
//	                System.out.print(ch);
//	            }
//	        }

	        for(char ch :str1.toCharArray()){
	        if(ch != 'a' && ch !='e' && ch != 'i' && ch !='o' && ch !='u') {
	              
	                stb2.append(ch);
	            }
	            
	        }
	        System.out.println("removing vowels : " + stb2);

	}

}
