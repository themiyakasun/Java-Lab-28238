
package com.mycompany.lifeplayercontroller;

import java.util.Scanner;

public class LifePlayerController extends PlayerController {
    public void moveUp() {
        System.out.println("Move Up");
    }

    public void moveDown() {
        System.out.println("Move Down");
    }

    public void moveLeft() {
        System.out.println("Move Left");
    }

    public void moveRight() {
        System.out.println("Move Right");
    }

    public static void main(String[] args) {
        LifePlayerController playerController = new LifePlayerController();
        Scanner scanner = new Scanner(System.in);

        char input;
        do {
            System.out.println("Press 'W' to move Up, 'S' to move Down, 'A' to move Left, 'D' to move Right, or 'Q' to Quit");
            input = scanner.next().charAt(0);

            switch (Character.toUpperCase(input)) {
                case 'W':
                    playerController.moveUp();
                    break;
                case 'S':
                    playerController.moveDown();
                    break;
                case 'A':
                    playerController.moveLeft();
                    break;
                case 'D':
                    playerController.moveRight();
                    break;
                case 'Q':
                    System.out.println("Exiting the game...");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        } while (Character.toUpperCase(input) != 'Q');

        scanner.close();
    }
}