package maps;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < magazine.length(); ++i) {
            char key = magazine.charAt(i);
            dictionary.put(key, dictionary.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); ++i) {
            char key = ransomNote.charAt(i);
            if (!dictionary.containsKey(key) || dictionary.get(key) == 0) {
                return false;
            } else {
                int frequency = dictionary.get(key);
                dictionary.replace(key, --frequency);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(RansomNote.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "ab";
        System.out.println(RansomNote.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "aab";
        System.out.println(RansomNote.canConstruct(ransomNote, magazine));
    }
}
