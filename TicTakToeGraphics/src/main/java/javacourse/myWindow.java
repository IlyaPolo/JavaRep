package javacourse;

import javax.swing.*;
import java.awt.*;

public class myWindow {
    public static void main(String[] args) {
        System.out.println("Начинаем");
        JFrame myWindow = new JFrame("TicTacToe");
        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myWindow.setSize(400,400);
        myWindow.setLayout(new BorderLayout());
        myWindow.setLocationRelativeTo(null);
        myWindow.setVisible(true);
        TicTacToe game = new TicTacToe();
        myWindow.add(game);
        System.out.println("Конец");
    }
}
