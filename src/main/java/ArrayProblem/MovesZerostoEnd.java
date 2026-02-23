package ArrayProblem;

import java.util.Arrays;

public class MovesZerostoEnd {

	public static void main(String[] args) {
		// move all zeros to the end of array
//		int[] a1 ={1,0,9,0,5,0,3,5,0};
//		for(int i=0; i<a1.length;i++) {
//			if(a1[i]== 0) {
//				for(int j=i+1; j<a1.length; j++) {
//					if(a1[j] !=0) {
//						int temp = a1[i];
//						a1[i]= a1[j];
//						a1[j]= temp;
//					}
//
//				}
//			}
//		}
//		System.out.println("shifting all zeros to the end " + Arrays.toString(a1));
		
		
		// with using Index
		int arr[] = {1,0,9,0,5,0,3,5,0};
        int index = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while(index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));
        
       	}

}
