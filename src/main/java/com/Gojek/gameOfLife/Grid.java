package com.Gojek.gameOfLife;

public class Grid {

    public int[][] copyGrid(int[][] grid) {
        int[][] copyGrid = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                copyGrid[i][j] = grid[i][j];
            }
        }
        return copyGrid;
    }
}
