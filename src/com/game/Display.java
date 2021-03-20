package com.game;

import java.util.Arrays;



public class Display {
    int gameBoardLength = 10;
    char water = '-';
    char ship = 'X';
    char hit = 'H';
    char miss = 'M';


    char[][] gameBoard = createGameBoard(gameBoardLength, water, ship);


    public static void printGameBoard(char[][] gameBoard, char water, char ship) {
        int gameBoardLength = gameBoard.length;
        System.out.print("  ");
        for (int i = 0; i < gameBoardLength; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int row = 0; row < gameBoardLength; row++) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < gameBoardLength; col++) {
                char position = gameBoard[row][col];
                if (position == ship) {
                    System.out.print(water + " ");
                } else {
                    System.out.print(position + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    private static char[][] createGameBoard(int gameBoardLength, char water, char ship) {
        char[][] gameBoard = new char[gameBoardLength][gameBoardLength];
        for (char[] row : gameBoard) {
            Arrays.fill(row,water);
//            System.out.println(row);
        }
        return gameBoard;
    }


    public static void printMenu() {
        String menu = "";

        System.out.println("\nMAIN MENU\n");
        menu += "(1) NEW GAME" + System.lineSeparator();
        menu += "(2) EXIT" + System.lineSeparator();

        System.out.println(menu);
    }


    public char getWater() {
        return water;
    }


    public char getShip() {
        return ship;
    }

    public int getGameBoardLength() {
        return gameBoardLength;
    }

    public void setGameBoardLength(int gameBoardLength) {
        this.gameBoardLength = gameBoardLength;
    }
}
