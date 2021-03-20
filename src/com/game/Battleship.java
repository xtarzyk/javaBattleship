package com.game;

import java.util.Arrays;
import java.util.Scanner;

public class Battleship {
    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        Display display = new Display();
        char[][] gameBoard = display.gameBoard;
        char water = display.getWater();
        char ship = display.getShip();

        boolean isRunning = true;
        Display.printMenu();
        while (isRunning) {
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Display.printGameBoard(gameBoard,water,ship);

//                    Arrays.deepToString(display.gameBoard)
//                            .replace("[", "")
//                            .replace("]", "")
//                            .replace(",", "");
                    break;
                case 2:
                    System.out.println("GOOD BYE");
                    isRunning = false;
            }
        }
    }
}
