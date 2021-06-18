package com.Gojek.gameOfLife;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    public int[][] readInput(String fileName) {
        int rows = 0, cols = 0;
        String inputLine;
        Scanner fileReader = null;
        int[][] grid = new int[0][0];
        int currentRow = 0;

        try {
            fileReader = new Scanner(new FileInputStream(fileName));
        } catch (FileNotFoundException err) {
            err.printStackTrace();
            return grid;
        }
        if (fileReader.hasNextLine()) {
            rows = Integer.parseInt(fileReader.nextLine());
        }
        if(fileReader.hasNextLine()) {
            cols = Integer.parseInt(fileReader.nextLine());
        }
        grid = new int[rows][cols];
        while(fileReader.hasNextLine() && currentRow < rows) {
            inputLine = (fileReader.nextLine()).replace(",", "");
            for(int i = 0; i < cols; i++) {
                grid[currentRow][i] = inputLine.charAt(i) - '0';
            }
            currentRow++;
        }
        fileReader.close();
        return grid;
    }
}
