package ArrayListProblems;

public class SecondHighest {

	public static void main(String[] args) {
		//2 Find Second Highest Element in ArrayList
        int arr[] = {56,44,34,89,56,90,23};
        
        int highest = 0;
        int secondhigh = 0;
        for(int i =0; i<arr.length; i++) {
        	if(highest<arr[i]) {
        		highest = arr[i];
        	}
        }
        
       System.out.println("highest number is :" + highest);
       
       for(int j=0; j<arr.length; j++ ) {
    	  if( secondhigh>highest) {
    		  highest = secondhigh;
    		  secondhigh = arr[j];
    	  }
       }
       System.out.println("second number is :" + secondhigh);

	}

}
