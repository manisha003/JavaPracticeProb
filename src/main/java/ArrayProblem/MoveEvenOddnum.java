package ArrayProblem;

import java.util.Arrays;

public class MoveEvenOddnum {

	public static void main(String[] args) {
		//  Move all odd number to the front and even number numbers to the end in an array. 
		int arr[]={6,7,29,2,8,4,7,0};
		int[] newarr = new int[arr.length];
		int index=0;
		
		//shift all odd numbers 
		for(int i =0; i<arr.length;i++) {
			if(arr[i]%2!=0) {
				newarr[index] = arr[i];
				index++;
			}
		}
		//shift all even numbers
		for(int i =0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				newarr[index] = arr[i];
				index++;
			}
		}
		
		System.out.println(" shifting odd and even number: " +  Arrays.toString(newarr));

	}

}
