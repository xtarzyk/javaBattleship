package com.game;

import java.util.Scanner;

public class Game {
    Display display = new Display();


    public class Placement {
        int maxNumber = 5;
        int shipNumber = 0;

        do {
            int[] givenCoordinates = getUserCoordinates(display.getGameBoardLength());
            char locationUpdate = checkField(givenCoordinates, display.gameBoard, display.getShip(), display.getWater());
            if (locationUpdate == display.getShip()) {
                shipNumber++;
            }
            while (shipNumber < maxNumber) ;
        }

        private char checkField(int[] givenCoordinates, char[][] gameBoard, char ship, char water) {
            int row = givenCoordinates[0];
            int col = givenCoordinates[1];

            char target = gameBoard[row][col];
            if (target == water) {
                target = ship;
            }
            return target;
        }

        private int[] getUserCoordinates(int gameBoardLength) {
            int row;
            int col;
            do {
                System.out.println("Select row: ");
                row = new Scanner(System.in).nextInt();
            } while (row < 0 || row > gameBoardLength + 1);
            do {
                System.out.println("Select column: ");
                col = new Scanner(System.in).nextInt();
            } while (col < 0 || col > gameBoardLength + 1);
            return new int[]{row - 1, col - 1};
        }
    }
}
