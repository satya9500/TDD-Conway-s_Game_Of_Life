package com.Gojek.gameOfLife;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class InputTest {
 
    @Test
    public void checkReadInputForEmptyFile() {
        String actual = "./testInputFiles/emptyFileTest/actual.txt";
        Input obj = new Input();

        assertArrayEquals(new int[0][0], obj.readInput(actual));
    }
}
