package ArrayProblem;

import java.util.Arrays;

public class SortTheArray {

	public static void main(String[] args) {

		 String arr [] = {"delhi", "Mumbai" ,"up", "punjab", "Benglore"};
		 
		 // converting to lower case
		 for(int i=0; i<arr.length;i++) {
			 arr[i] = arr[i].toLowerCase();
		 }
		 
		Arrays.sort(arr);
		System.out.println("sorted array: " + Arrays.toString(arr));
	}

}
