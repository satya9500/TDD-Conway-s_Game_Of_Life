package com.Gojek.gameOfLife;

public class NextGeneration {
    
    public int[][] generateNextState(String fileName) {
        Input inputObject = new Input();
        int[][] grid = inputObject.readInput(fileName);
        int aliveNeighbors = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                aliveNeighbors = 0;
                if(i - 1 > 0 && j - 1 > 0 && i - 1 < grid.length && j - 1 < grid[i].length && grid[i - 1][j - 1] == 1) {
                    aliveNeighbors++;
                }
                if(i - 1 > 0 && j > 0 && i - 1 < grid.length && j < grid[i].length && grid[i - 1][j] == 1) {
                    aliveNeighbors++;
                }
                if(i - 1 > 0 && j + 1 > 0 && i - 1 < grid.length && j + 1 < grid[i].length && grid[i - 1][j + 1] == 1) {
                    aliveNeighbors++;
                }
                if(i > 0 && j - 1 > 0 && i < grid.length && j - 1 < grid[i].length && grid[i][j - 1] == 1) {
                    aliveNeighbors++;
                }
                if(i > 0 && j + 1 > 0 && i < grid.length && j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                    aliveNeighbors++;
                }
                if(i + 1 > 0 && j - 1 > 0 && i + 1 < grid.length && j - 1 < grid[i].length && grid[i + 1][j - 1] == 1) {
                    aliveNeighbors++;
                }
                if(i + 1 > 0 && j > 0 && i + 1 < grid.length && j < grid[i].length && grid[i + 1][j] == 1) {
                    aliveNeighbors++;
                }
                if(i + 1 > 0 && j + 1 > 0 && i + 1 < grid.length && j + 1 < grid[i].length && grid[i + 1][j + 1] == 1) {
                    aliveNeighbors++;
                }
                if(aliveNeighbors == 0) {
                    grid[i][j] = 0;
                }
            }
        }
        return grid;
    }
}
