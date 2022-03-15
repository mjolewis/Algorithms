package unittests.arrays;

import arrays.LongestPeak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPeakTest {

    @Test
    public void run() {
        int[] array = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int actual = LongestPeak.longestPeak(array);
        int expected = 6;
        Assertions.assertEquals(expected, actual);

        array = new int[] {1, 3, 2};
        actual = LongestPeak.longestPeak(array);
        expected = 3;
        Assertions.assertEquals(expected, actual);

        array = new int[] {};
        actual = LongestPeak.longestPeak(array);
        expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
