package graphs;

public class NumberOfIslands {

    public int numIslands(char[][] islandGrid) {
        if (islandGrid.length == 0) return 0;

        int rows = islandGrid.length;
        int columns = islandGrid[0].length;

        int numberOfIslands = 0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (islandGrid[i][j] == '1') {
                    DFS(islandGrid, i, j);
                    ++numberOfIslands;
                }
            }
        }
        return numberOfIslands;
    }

    public void DFS(char[][] islandGrid, int row, int column) {

        int rows = islandGrid.length;
        int columns = islandGrid[0].length;

        if (row < 0 || column < 0 || row >= rows || column >= columns || islandGrid[row][column] != '1') {
            return;
        }

        islandGrid[row][column] = '0';  // mark it as visited
        DFS(islandGrid, row - 1, column); // Look left
        DFS(islandGrid, row + 1, column); // Look right
        DFS(islandGrid, row, column - 1); // Look up
        DFS(islandGrid, row, column + 1); // Look down
    }

    public static void main(String[] args) {

        char [][] islandGrid = new char[][] {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        NumberOfIslands noOfIslands = new NumberOfIslands();
        System.out.println("No of Islands: " + noOfIslands.numIslands(islandGrid));

        islandGrid = new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println("No of Islands: " + noOfIslands.numIslands(islandGrid));

        islandGrid = new char[][] {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','1'},
                {'0','0','0','1','1'}};
        System.out.println("No of Islands: " + noOfIslands.numIslands(islandGrid));
    }
}
