package JavaPractice.java;

import java.util.Arrays;

public class Arrayproblem {

	public static void main(String[] args) {

		// program to sum of array
//		float []marks = {12.5F, 11.4F, 56.8F, 77.4F,33.9F};
//		float sum = 0;
//		for(float element:marks) {
//			sum = sum + element;
//			
//		}
//		System.out.print("the sum of marks is: " + sum);
//		
		

//		//program to find out given integer is present in an array or not.
//		int []arr  = {12, 13, 3, 4, 49, 70};
//		int num = 3;
//		boolean isArray = false;
//		for(int element:arr) {
//
//			if(num == element) {
//				isArray = true;
//				break;
//			}
//		}
//		if(isArray) {
//			System.out.println("element is present in an array");
//		}
//		else {
//			System.out.println("element is not present in an array");
//
//		}
//
//
		//program to reverse an array
		
		int [] arr = {12,13,3,4,49,70};
		System.out.println("program to reverse an array");

		
		for(int i= arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		//program to find the maximum element in an array
		int [] arr1 = {33,45,77,11,3,1,333,66,777,2100,88,45,99,98};
		int max = 0 ;
		for(int e:arr1) {
			if(e>max) {
				max=e;

			}
		}
		System.out.println("maximum element is: "  + max);
		
		
		//program to remove the specific element from an array
		int [] arr2 = {44,23,49,98,11,65,45,29,77};
		int removeNum = 2;
		for(int i=removeNum; i<arr2.length-1; i++) {
			arr2[i] = arr2[i+1];
		}
        System.out.println("After removing the 2nd element: " + Arrays.toString(arr2));
          
          
        //Program to remove duplicate , we can do with hashset
//        int[] my_array = {3,4,3,5,7,6,6,4,3,1,2,9};
//        int [] new_array = {};
//        int j=0;// for new array indexing
//        System.out.println("Old array" + Arrays.toString(my_array));
//        for(int i =0; i<my_array.length-1 ; i++) {
//        	if(my_array[i]!= my_array[i+1]) {
//        		new_array[j++] = my_array[i];
//        	}
//        }
       // Store the last element as it won't be checked in the loop
       // new_array[j++] = my_array[n - 1];

        // System.out.println("new array is:  " +  new_array);
        
        
        //program to compute sum and average of an array
        int []numbers = {12,10,3,5,8,9};
        int sum = 0;
        for(int i =0; i<numbers.length; i++) {
        	sum = sum + numbers[i];
        	
        }
        System.out.println("sum of numbers array is: " + sum);
        
        float average = sum/numbers.length;
        System.out.println("Average of numbers array is: " + average);

        
                } 

	}








