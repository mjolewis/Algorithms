package maps;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> frequnecy = new HashMap<>();

        for (int i = 0; i < string.length(); ++i) {
            char character = string.charAt(i);
            frequnecy.put(character, frequnecy.getOrDefault(character, 0) + 1);
        }

        for (int i = 0; i < string.length(); ++i) {
            char character = string.charAt(i);
            if (frequnecy.get(character) == 1) {
                return i;
            }
        }
        return -1;
    }
}
