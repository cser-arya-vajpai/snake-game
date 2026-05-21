package com.snakegame;

import javax.swing.JFrame;

public class App {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake Game");

        Snake snakePanel = new Snake();

        frame.add(snakePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
