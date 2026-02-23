package JavaStringQuestions;

public class ReverseStringwithoutchangingspaces {

	public static void main(String[] args) {
		// string ko character array mein convert karo
		//Approach is using two pointers (start and end)
		//if sapce milta h to skip and nahi milta toh, chars ko swipe karo
		String a = "i am a java lover";
		  a = a.toLowerCase();
		  char[] ch = a.toCharArray();
		  int left = 0;
		  int right = ch.length-1;
		  
		  while(left<right) {
			  if(ch[left ]==  ' ') {
				 left++; 
			  }
			  else if(ch[right]== ' ') {
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

	        System.out.println(new String(ch));

	}

}
