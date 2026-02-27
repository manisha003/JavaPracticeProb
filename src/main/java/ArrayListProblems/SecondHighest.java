package ArrayListProblems;

public class SecondHighest {

	public static void main(String[] args) {
		//2 Find Second Highest Element in ArrayList
        int arr[] = {56,44,34,89,56,90,23};
        
        int highest = 0;
        int secondhigh = 0;
        for(int i =0; i<arr.length; i++) {
        	if(arr[i]>highest) {
        		secondhigh = highest;
        		highest = arr[i];
        	}else {
        		if(arr[i]>secondhigh && secondhigh != highest) {
        			secondhigh = arr[i];
        		}
        	}
        }
        
       System.out.println("highest number is: " + highest + " and Second highest number is: " + secondhigh);
       
       

	}

}
