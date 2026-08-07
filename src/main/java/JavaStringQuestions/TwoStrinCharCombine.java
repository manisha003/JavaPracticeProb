package JavaStringQuestions;

public class TwoStrinCharCombine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Manisha";
        String str2 = "Kumarixyz"; //output:  MK au nm ia sr hi ax y z g

        int max = Math.max(str1.length(), str2.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < max; i++) {
            if(i<str1.length()){
                result.append(str1.charAt(i));
            }
            if(i<str2.length()){
                result.append(str2.charAt(i));
            }
            result.append(" ");
        }
        System.out.println("resul is : " + result.toString());
        /* ....................................................................... */
        // USING Math.min()

//        int min = Math.min(str1.length(), str2.length());
//
//        for (int i = 0; i < min; i++) {
//       System.out.print("" + str1.charAt(i) + str2.charAt(i) + " ");
//   }
//
//     // Print remaining characters of longer string
//      if (str2.length() >min) {
//       System.out.print(str2.substring(min));
//     } else if (str1.length() > min) {
//       System.out.print(str1.substring(min));
//      }

	}

}
