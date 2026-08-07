package JavaStringQuestions;

public class FisrtandLastReverse {

	public static void main(String[] args) {
		  //program to reverse the first and last digits of a String
        String str = "Testing Love Java";
        str = str.toLowerCase();
        String words[] = str.split(" ");
        for(String word :words ){
            
            if(word.length() <=1){
                System.out.println(word + " " );
                continue;
            }
            char first = word.charAt(0);
            char last = word.charAt(word.length() -1);
            String middle  =  word.substring(1, word.length()-1);
            String result = last +middle + first;
            System.out.print(  result + " " );


        }

	}

}
