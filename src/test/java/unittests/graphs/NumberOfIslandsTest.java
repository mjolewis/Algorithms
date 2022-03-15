package unittests.graphs;

import graphs.NumberOfIslands;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {

    @Test
    public void run() {

        char [][] islandGrid = new char[][] {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int actual = NumberOfIslands.numIslands(islandGrid);
        int expected = 1;
        Assertions.assertEquals(expected, actual);

        islandGrid = new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        actual = NumberOfIslands.numIslands(islandGrid);
        expected = 3;
        Assertions.assertEquals(expected, actual);

        islandGrid = new char[][] {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','1'},
                {'0','0','0','1','1'}};
        actual = NumberOfIslands.numIslands(islandGrid);
        expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}
