package unittests.maps;

import maps.GroupAnagrams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void run() {
        List<String> words = new ArrayList<>(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        List<List<String>> actual = GroupAnagrams.groupAnagrams(words);
        List<List<String>> expected = List.of(List.of("act", "tac", "cat"),
                List.of("flop", "olfp"),
                List.of("foo"),
                List.of("yo", "oy"));
        for (int i = 0; i < expected.size(); ++i) {
            Assertions.assertEquals(expected.get(i), actual.get(i));
        }

        words = new ArrayList<>(Arrays.asList("abc", "dabd", "bca", "cab", "ddba"));
        actual = GroupAnagrams.groupAnagrams(words);
        expected = List.of(List.of("abc", "bca", "cab"),
                List.of("dabd", "ddba"));
        for (int i = 0; i < expected.size(); ++i) {
            Assertions.assertEquals(expected.get(i), actual.get(i));
        }

        words = new ArrayList<>();
        actual = GroupAnagrams.groupAnagrams(words);
//        expected = List.of(List.of(""));
        Assertions.assertTrue(actual.size() == 0);
    }
}
