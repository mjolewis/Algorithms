package unittests.maps;

import maps.RansomNote;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RansomNoteTest {

    @Test
    public void run() {
        String ransomNote = "a";
        String magazine = "b";
        Assertions.assertFalse(RansomNote.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "ab";
        Assertions.assertFalse(RansomNote.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "aab";
        Assertions.assertTrue(RansomNote.canConstruct(ransomNote, magazine));
    }
}
