package ArrayProblem;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1,23,45,56,32,77};
		    int largest = 0;
		    int secondLargest = 0;
		    int thirdLargest =0;
		    for(int i = 0 ;i<arr.length; i++){
		        if(arr[i]>largest){
		            thirdLargest = secondLargest;
		            secondLargest = largest;
		            largest = arr[i];
		        }else if( arr[i]> secondLargest && arr[i]  != largest){
		            secondLargest = arr[i];
		            thirdLargest = secondLargest;
		        }   else if (arr[i] > thirdLargest &&
		                     arr[i] != largest &&
		                     arr[i] != secondLargest) {
		                thirdLargest = arr[i];
		            }
		        
		    }
		       System.out.println("3rd largest :" + thirdLargest);
		       System.out.println("2nd largest :" + secondLargest);
		        System.out.println(" largest :" + largest);



	}

}
