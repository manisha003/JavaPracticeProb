package JavaStringQuestions;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Sshubham Kkumarrr";
		s= s.toLowerCase().trim();
		String result="";
		
//		for(int i=0;i<s.length();i++) {
//			char currentChar=s.charAt(i);
//			String updatedCurrentChar=Character.toString(currentChar);
//			
//			if(!result.contains(updatedCurrentChar)) {
//				result= result+ updatedCurrentChar;			
//			}
//			
//		}
//		System.out.println(result);
		
		//.............Another ways using indexoff
//		for(int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if(result.indexOf(ch) == -1) {   // agar pehle nahi aaya
//                result = result + ch;
//            }
//        }
//
//        System.out.println(result);

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            boolean found = false;

            // check in result
            for(int j = 0; j < result.length(); j++) {
                if(ch == result.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                result = result + ch;
            }
        }
        System.out.println(result);
	}

}
