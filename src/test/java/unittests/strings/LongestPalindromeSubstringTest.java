package unittests.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import strings.LongestPalindromeSubstring;

public class LongestPalindromeSubstringTest {

    @Test
    public void run() {
        String actual = LongestPalindromeSubstring.longestPalindromicSubstring("abaxyzzyxf");
        String expected = "xyzzyx";
        Assertions.assertEquals(expected, actual);

        actual = LongestPalindromeSubstring.longestPalindromicSubstring("a");
        expected = "a";
        Assertions.assertEquals(expected, actual);

        actual = LongestPalindromeSubstring.longestPalindromicSubstring("it's highnoon");
        expected = "noon";
        Assertions.assertEquals(expected, actual);
    }
}
