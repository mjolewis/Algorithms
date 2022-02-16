package maps;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (anagrams.containsKey(sortedWord)) {
                anagrams.get(sortedWord).add(word);
            } else {
                anagrams.put(sortedWord, new ArrayList<>(Arrays.asList(word)));
            }
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        System.out.println(GroupAnagrams.groupAnagrams(words));

        words = new ArrayList<>(Arrays.asList("abc", "dabd", "bca", "cab", "ddba"));
        System.out.println(GroupAnagrams.groupAnagrams(words));

        words = new ArrayList<>();
        System.out.println(GroupAnagrams.groupAnagrams(words));
    }
}
