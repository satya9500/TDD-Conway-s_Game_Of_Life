package com.Gojek.gameOfLife;

public class Coordinate {

    public boolean checkBoundAndAliveCell(int i, int j, int[][] currentGen) {
        if(i < 0 || j < 0 || i >= currentGen.length || j >= currentGen[i].length) {
            return false;
        }
        return currentGen[i][j] == 1 ? true : false;
    }
}
