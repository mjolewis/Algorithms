package unittests.arrays;

import arrays.MergeOverlappingIntervals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeOverlappingIntervalsTest {

    @Test
    public void run() {

        int[][] intervals = new int[][] {
                {1, 2},
                {3, 5},
                {4, 7},
                {6, 8},
                {9, 10}};

        int[][] actual = MergeOverlappingIntervals.mergeOverlappingIntervals(intervals);
        int[][] expected = new int[][] {{1, 2}, {3, 8}, {9, 10}};
        Assertions.assertTrue(Arrays.deepEquals(expected, actual));

        intervals = new int[][] {
                {89, 90},
                {-10, 20},
                {-50, 0},
                {70, 90},
                {90, 91},
                {90, 95}};
        actual = MergeOverlappingIntervals.mergeOverlappingIntervals(intervals);
        expected = new int[][] {{-50, 20}, {70, 95}};
        Assertions.assertTrue(Arrays.deepEquals(expected, actual));

        intervals = new int[][] {
                {1, 22},
                {-20, 30}};
        actual = MergeOverlappingIntervals.mergeOverlappingIntervals(intervals);
        expected = new int[][] {{-20, 30}};
        Assertions.assertTrue(Arrays.deepEquals(expected, actual));
    }
}
