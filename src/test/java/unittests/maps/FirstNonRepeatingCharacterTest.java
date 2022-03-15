package unittests.maps;

import maps.FirstNonRepeatingCharacter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstNonRepeatingCharacterTest {

    @Test
    public void run() {
        String word = "abcdcaf";
        int actual = FirstNonRepeatingCharacter.firstNonRepeatingCharacter(word);
        int expected = 1;
        Assertions.assertEquals(expected, actual);

        word = "faadabcbbebdf";
        actual = FirstNonRepeatingCharacter.firstNonRepeatingCharacter(word);
        expected = 6;
        Assertions.assertEquals(expected, actual);
    }
}
