package com.snakegame;

import java.util.Random;

public class App {

    static final int WIDTH = 10;
    static final int HEIGHT = 10;

    static int snakeX = 5;
    static int snakeY = 5;

    static int appleX;
    static int appleY;

    static int score = 0;

    static Random random = new Random();

    public static void main(String[] args) {

        spawnApple();

        while (true) {

            printBoard();

            System.out.println("Score: " + score);

            snakeX++;

            if (snakeX == appleX && snakeY == appleY) {

                score++;
                spawnApple();
            }

            if (snakeX < 0 || snakeX >= WIDTH || snakeY < 0 || snakeY >= HEIGHT) {

                System.out.println("Game Over!");
                System.out.println("Final Score: " + score);
                break;
            }

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    static void spawnApple() {

        appleX = random.nextInt(WIDTH);
        appleY = random.nextInt(HEIGHT);
    }

    static void printBoard() {

        for (int i = 0; i < HEIGHT; i++) {

            for (int j = 0; j < WIDTH; j++) {

                if (j == snakeX && i == snakeY) {

                    System.out.print("S ");
                }

                else if (j == appleX && i == appleY) {

                    System.out.print("A ");
                }

                else {

                    System.out.print(". ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }
}
