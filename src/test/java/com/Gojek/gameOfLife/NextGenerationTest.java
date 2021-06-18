package com.Gojek.gameOfLife;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class NextGenerationTest {
    
    @Test
    public void checkForAllDeadCells() {
        int[][] expected = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
        };
        String actual = "./testInputFiles/allDeadCells/actual.txt";
        NextGeneration obj = new NextGeneration();

        assertArrayEquals(expected, obj.generateNextState(actual));
    }

    @Test
    public void checkForOneAliveAndZeroAliveNeighbors() {
        int[][] expected = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
        };
        String actual = "./testInputFiles/oneAliveAndZeroAliveNeighbors/actual.txt";
        NextGeneration obj = new NextGeneration();

        assertArrayEquals(expected, obj.generateNextState(actual));
    }
}
