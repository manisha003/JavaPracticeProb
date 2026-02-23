package JavaStringQuestions;

public class ReverseEachWord {

	public static void main(String[] args) {
		// wap to reverse each word in a string
		String s1 = "we Love India";
		 String[] newstr =s1.split(" ");
		StringBuilder reverseword = new StringBuilder();
		for(String word: newstr) {
			String s2 = new StringBuilder(word).reverse().toString();
			System.out.println(s2 + "************");
			reverseword.append(s2).append(" ");
		}
		System.out.println(reverseword);
	}

	
//	public static String reverseEachWord(String str) {
//        // Split the string into words
//        String[] words = str.split(" "); // not split the string directly convert into char array
//        String result = "";
//        
//        for (String word : words) {
//            // Reverse each word manually
//            char[] chars = word.toCharArray();
//            String reversedWord = "";
//            for (int i = chars.length - 1; i >= 0; i--) {
//                reversedWord += chars[i];
//            }
//            result += reversedWord + " ";
//        }
//        
//        // Remove the trailing space and return
//        return result.trim();
// 
}
