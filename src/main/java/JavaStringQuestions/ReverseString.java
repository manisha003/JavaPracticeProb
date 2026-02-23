package JavaStringQuestions;

public class ReverseString {

	public static void main(String[] args) {
//		String name= "Manisha";
//		String revname = "";
//		 for(int i =name.length()-1 ;i>=0; i--) {
//			//revname += name.charAt(i);
//			 revname = revname + name.charAt(i);
//			  
//			
//		 }
//		 System.out.println("reverse string is: " + revname);
      
		String str = "1me2gh3a";   //output: 1ah2ge3m
		String result = " "; 

		  for(int i= str.length()-1; i>=0; i-- ){
		    result =  result + str.charAt(i);
		  }
		   System.out.println("result :" +  result);

	}

}
