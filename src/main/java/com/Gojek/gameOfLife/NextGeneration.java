package com.Gojek.gameOfLife;

public class NextGeneration {
    
    public int[][] generateNextState(String fileName) {
        Input inputObject = new Input();
        int[][] grid = inputObject.readInput(fileName);

        return grid;
    }
}
