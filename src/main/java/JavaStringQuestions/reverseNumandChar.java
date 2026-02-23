package JavaStringQuestions;

public class reverseNumandChar {

	public static void main(String[] args) {
		//String = 1me2gh3a 
		// output = 1ah2ge3m
		String str = "11me66gh42a";
        char [] ch =str.toCharArray();
        
       //using two pointers approach, only letters pe work hoga
       int left = 0;
       int right = ch.length-1;
       
       while(left<right) {
    	   if(!Character.isLetter(ch[left])){
    		   left++;
    	   }else if (!Character.isLetter(ch[right])) {
    		   right--;
    	   }
    	   else {
    		   char temp = ch[left];
    		   ch[left] = ch[right];
    		   ch[right] = temp;
    		   left ++;
    		   right --;
    	   }

       }
      
       System.out.println( "new output: " + new String(ch));

       // another approach
//       String str = "1me2gh3a";
//       char[] arr = str.toCharArray();
//
//       String letters = "";
//
//       // collect letters
//       for (int i = 0; i < arr.length; i++) {
//           if (Character.isLetter(arr[i])) {
//               letters = letters + arr[i];
//           }
//       }
//
//       // reverse letters back
//       int j = letters.length() - 1;
//
//       for (int i = 0; i < arr.length; i++) {
//           if (Character.isLetter(arr[i])) {
//               arr[i] = letters.charAt(j--);
//           }
//       }


	}

}
