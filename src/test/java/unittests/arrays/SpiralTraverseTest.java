package unittests.arrays;

import arrays.SpiralTraverse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralTraverseTest {

    @Test
    public void run() {
        int[][] array = new int[][]{
                {1, 2, 3},
                {12, 13, 4},
                {11, 14, 5},
                {10, 15, 6},
                {9, 8, 7}};

        List<Integer> actual = SpiralTraverse.spiralTraverse(array);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Assertions.assertEquals(expected, actual);

        array = new int[][]{
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}};

        actual = SpiralTraverse.spiralTraverse(array);
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        Assertions.assertEquals(expected, actual);
    }
}
