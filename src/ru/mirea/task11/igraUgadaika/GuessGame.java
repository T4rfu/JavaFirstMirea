package ru.mirea.task11.igraUgadaika;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class GuessGame extends JFrame{

    JTextField guessField = new JTextField(2);
    Random random = new Random();
    int amountOfTries = 0;

    public GuessGame() {
        super("Guess game...");
        guessField.setBounds(100,150,100,40);
        add(guessField);
        setSize(300,300);
        setLayout(null);
        int numberWeShouldGuess = random.nextInt(20);

            guessField.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int intEnteredNumber = Integer.parseInt(guessField.getText());
                    if (intEnteredNumber == numberWeShouldGuess) {
                        JOptionPane.showMessageDialog(GuessGame.this,
                                "You won! This hidden number is: " + guessField.getText());
                        System.exit(0);
                    } else if (intEnteredNumber > numberWeShouldGuess) {
                        JOptionPane.showMessageDialog(GuessGame.this,
                                "Wrong! " + guessField.getText() + " is bigger than the hidden number!");
                    } else {
                        JOptionPane.showMessageDialog(GuessGame.this,
                                "Wrong! " + guessField.getText() + " is under the hidden number!");
                    }
                    amountOfTries++;
                    if (amountOfTries > 2) {
                        JOptionPane.showMessageDialog(GuessGame.this, "Game over! You have lost all your tries!");
                        System.exit(0);
                    }

                }
            });
    }

    public static void main(String[] args)
    {
        new GuessGame().setVisible(true);
    }
}