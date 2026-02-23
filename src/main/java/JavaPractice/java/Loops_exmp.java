package JavaPractice.java;

public class Loops_exmp {

	public static void main(String[] args) {
		// program to sum of N natural number (1 to 100)
		int sum=0;
		int n = 100;
		for(int i =0; i<=n; i++) {
			sum = sum + i;
			//sum +=i;
		}
   System.out.println("sum is :" + sum);
   
   
   // program to print * pattern
   int a =5;
   for(int i =a; i>=1; i--) {
	   for(int j=1; j<=i; j++) {
		   System.out.print("*");  
	   }
	   System.out.println("\n");

   }
   
   System.out.println("..........next pattern increment ..........");
   
   int b =5;
   for(int i =0; i<b; i++) {
//       // inner loop to print spaces.
//       for (int j = b - i;  j > 1; j--) {
//           System.out.print(" ");
//       }

	   for(int j=0; j<=i ; j++) {
		   System.out.print("*");  
	   }
	   System.out.println("\n");
	   

   }


	}

}
