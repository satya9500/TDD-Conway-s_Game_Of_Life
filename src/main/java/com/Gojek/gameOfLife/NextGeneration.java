package com.Gojek.gameOfLife;

public class NextGeneration {
    
    public int[][] generateNextState(String fileName) {
        Input inputObject = new Input();
        int[][] grid = inputObject.readInput(fileName);
        int aliveNeighbors = 0;
        Coordinate coordinateObject = new Coordinate();
        Grid gridObj = new Grid();
        int[][] nextGen = gridObj.copyGrid(grid);

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                aliveNeighbors = 0;
                for(int dx = -1; dx <= 1; dx++) {
                    for(int dy = -1; dy <= 1; dy++) {
                        if(dx != 0 || dy != 0) {
                            if(coordinateObject.checkBoundAndAliveCell(i + dx, j + dy, grid)) {
                                aliveNeighbors++;
                            }
                        }
                    }
                }
                if(aliveNeighbors !=2 && aliveNeighbors != 3) {
                    nextGen[i][j] = 0;
                }
                if(aliveNeighbors == 3) {
                    nextGen[i][j] = 1;
                }
            }
        }
        return nextGen;
    }
}
