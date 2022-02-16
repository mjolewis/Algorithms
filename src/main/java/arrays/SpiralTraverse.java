package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> spiralTraverse = new ArrayList<>();
        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;

        while (startCol <= endCol && startRow <= endRow) {
            for (int col = startCol; col <= endCol; ++col) {
                spiralTraverse.add(array[startRow][col]);
            }

            for (int row = startRow + 1; row <= endRow; ++row) {
                spiralTraverse.add(array[row][endCol]);
            }

            for (int col = endCol - 1; col >= startCol; --col) {
                if (startRow == endRow) break;
                spiralTraverse.add(array[endRow][col]);
            }

            for (int row = endRow - 1; row > startRow; --row) {
                if (startCol == endCol) break;
                spiralTraverse.add(array[row][startCol]);
            }

            ++startRow;
            --endRow;
            ++startCol;
            --endCol;
        }
        return spiralTraverse;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3},
                {12, 13, 4},
                {11, 14, 5},
                {10, 15, 6},
                {9, 8, 7}};

        System.out.println(SpiralTraverse.spiralTraverse(array));

        array = new int[][]{
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 15, 6},
                {10, 9, 8, 7}};

        System.out.println(SpiralTraverse.spiralTraverse(array));
    }
}