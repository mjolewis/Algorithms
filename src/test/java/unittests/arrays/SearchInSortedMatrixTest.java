package unittests.arrays;

import arrays.SearchInSortedMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SearchInSortedMatrixTest {

    @Test
    public void run() {
        int[][] matrix = new int[][] {
                {1, 4, 7, 12, 15, 1000},
                {2, 5, 19, 31, 32, 1001},
                {3, 8, 24, 33, 35, 1002},
                {40, 41, 42, 44, 45, 1003},
                {99, 100, 103, 106, 128, 1004}};
        int target = 44;
        int[] actual = SearchInSortedMatrix.searchInSortedMatrix(matrix, target);
        int[] expected = new int[] {3, 3};
        Assertions.assertArrayEquals(expected, actual);

        matrix = new int[][] {
                {1, 4, 7, 12, 15, 1000},
                {2, 5, 19, 31, 32, 1001},
                {3, 8, 24, 33, 35, 1002},
                {40, 41, 42, 44, 45, 1003},
                {99, 100, 103, 106, 128, 1004}};
        target = 1;
        actual = SearchInSortedMatrix.searchInSortedMatrix(matrix, target);
        expected = new int[] {0, 0};
        Assertions.assertArrayEquals(expected, actual);

        matrix = new int[][] {
                {1, 4, 7, 12, 15, 1000},
                {2, 5, 19, 31, 32, 1001},
                {3, 8, 24, 33, 35, 1002},
                {40, 41, 42, 44, 45, 1003},
                {99, 100, 103, 106, 128, 1004}};
        target = -1;
        actual = SearchInSortedMatrix.searchInSortedMatrix(matrix, target);
        expected = new int[] {-1, -1};
        Assertions.assertArrayEquals(expected, actual);
    }
}
