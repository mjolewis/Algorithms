package unittests.arrays;

import arrays.SmallestDifference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestDifferenceTest {

    @Test
    public void run() {
        int[] arrayOne = new int[] {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = new int[] {26, 134, 135, 15, 17};
        int[] actual = SmallestDifference.smallestDifference(arrayOne, arrayTwo);
        int[] expected = new int[] {28, 26};
        Assertions.assertArrayEquals(expected, actual);

        arrayOne = new int[] {10, 0, 20, 25};
        arrayTwo = new int[] {1005, 1006, 1014, 1032, 1031};
        actual = SmallestDifference.smallestDifference(arrayOne, arrayTwo);
        expected = new int[] {25, 1005};
        Assertions.assertArrayEquals(expected, actual);
    }
}
