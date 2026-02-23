package JavaPractice.java;

public class StringProblem {

	public static void main(String[] args) {
		// To remove duplicate character in a string
		String sentance = "manishha kumariii" ;
		 boolean[] seen = new boolean[256];
		 //StringBuilder strnew = new StringBuilder();  
		 String strnew = " ";
		for(char str : sentance.toCharArray()) {
		    if(!seen[str]) {
		    	strnew += str;
		    	seen[str]=true;
		    }
			

		}
		System.out.print(strnew);
		
		//without using string builder
		
		

	}

	
}
