package InterviewPractice;

public class Reverse_Digit {

	public static void main(String[] args) {

		 //program to reverse the first and last digits of a number
        int num = 2895;
        int original = num;
        int lastNumber = num % 10;
        //find first num and divisor
        int divisor = 1;
        while(num>=10){
            num = num /10;
            divisor = divisor * 10;
        }
        int firstnum = num;
        
        int middleNum = (original % divisor) / 10;
        
        int result = lastNumber*divisor + middleNum *10 + firstnum;
        
        System.out.println(result);
	}

}
