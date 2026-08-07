package ArrayListProblems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrintUniqueandDuplicate {

	public static void main(String[] args) {
		// print two outputs unique and duplicate element
		String st[] = {"A","B","C","X","A","a","b"};

        Map<String, Integer> map = new LinkedHashMap<>();

        // Count frequency
        for (String s : st) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> unique = new ArrayList<>();
        List<String> duplicates = new ArrayList<>();

        for (String s : st) {
            if (map.get(s) == 1) {
                unique.add(s);
            } else {
                duplicates.add(s);
            }
        }
        
        System.out.println("Unique Elements: " + unique);
        System.out.println("Duplicate Elements: " + duplicates);

	}

}
