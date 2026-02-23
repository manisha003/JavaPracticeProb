package JavaPractice.java;

public class ArrayProblem1 {

	public static void main(String[] args) {
		
		// Print the highest integer from an array
            int arr[] = {56,88,34,89,56,90,89};
            int  highestnum =0 ;
            for(int i =0 ; i<arr.length; i++) {
            	//highestnum = arr[i];
            	if(highestnum <arr[i]) {
            		highestnum = arr[i];
            	}
            }
        	System.out.println(" highest number : " + highestnum);
        	
        	
    		// Print the highest and second-highest integer from an array
            int arry[] = {56,88,34,89,56,90,89};
            int highestnum1 = 0;
            int secondhighest =0;
            
            for(int i =0 ; i<arry.length; i++) {
            	 if(arry[i]>highestnum1) {
            		 secondhighest = highestnum1;
            		 highestnum1 = arry[i];
            	 }
//            	 }else if( arry[i]>secondhighest & arry[i]!= highestnum1) {
//            		 secondhighest = arry[i];
//          	 }
            	
            }
        	System.out.println(" highest number is  : " + highestnum1 + " second highest is : " + secondhighest);
        	
            


	}

	
}
