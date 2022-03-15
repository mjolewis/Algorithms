package unittests.arrays;

import arrays.ThreeNumberSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ThreeNumberSumTest {

    @Test
    public void run() {
        int[] array = new int[] {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        List<Integer[]> actual = ThreeNumberSum.threeNumberSum(array, targetSum);
        List<Integer[]> expected = Arrays.asList(new Integer[]{-8, 2, 6},
                new Integer[]{-8, 3,5},
                new Integer[]{-6, 1, 5});
        for (int i = 0; i < expected.size(); ++i) {
            Assertions.assertArrayEquals(expected.get(i), actual.get(i));
        }
    }
}
