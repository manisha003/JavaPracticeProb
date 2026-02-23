package JavaPractice.java;

public class Occurencecharacter {

	public static void main(String[] args) {
    //count each character occurence in string
		String words = "Try programming";
		// Create an array to store counts of each character
        // There are 256 ASCII characters
        int[] charCount = new int[256];

        // Convert words to a character array and iterate over each character
        for (char c : words.toCharArray()) {
            charCount[c]++;
            System.out.println( " print the characters :" +c);
        }


        // Display the count of each character that appeared in the words
        System.out.println("Character occurrences:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char)i + ": " + charCount[i]);
            }
        }

		
		
	}

	
}
