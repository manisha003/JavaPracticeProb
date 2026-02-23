package InterviewPractice;

public class CountOccurenceAndReplaceDuplicated {

	public static void main(String[] args) {
		
		 String input = "Automation";   //output = "2u22m22i2n"
		 input = input.toLowerCase();
		 StringBuilder output = new StringBuilder();
		 
		char[] ch = input.toCharArray();
		//int count =0;
		 int [] count = new int[256];

		for(char c : ch) {
			count[c] ++;
			}
		
		for(char c : ch) {
			if(count[c]>1) {
				output.append(count[c]);
			}else {
				output.append(c);
			}
		}
		System.out.println("print the result output: " + output.toString());
	
		 
	}


}
