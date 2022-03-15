package unittests.arrays;

import arrays.MonotonicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonotonicArrayTest {

    @Test
    public void run() {
        int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        Assertions.assertTrue(MonotonicArray.isMonotonic(array));

        array = new int[] {1, 5, 10, 1100, 1101, 1102, 9001};
        Assertions.assertTrue(MonotonicArray.isMonotonic(array));

        array = new int[] {};
        Assertions.assertTrue(MonotonicArray.isMonotonic(array));

        array = new int[] {1, -5, -10, 7, 6, 10, 11};
        Assertions.assertFalse(MonotonicArray.isMonotonic(array));
    }
}
