package JavaPractice.java;

public class StringProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input MANISHA KUMARIA
		//output M@NISH@@  KUM@@@RI@@@@
	

		String input = "manisha kumariaia";
		String newoutput = "";
		int countOfa =0;

		for(int i=0; i<input.length(); i++) {
			char currentchar = input.charAt(i);
			if(currentchar == 'a')	
			{		
				++countOfa ;
				for(int j=0;j<countOfa; j++) {
					newoutput = newoutput + "@";
				}
			}else {
				newoutput = newoutput + currentchar ; 
			}
		}
		System.out.println(newoutput);
	}


}
