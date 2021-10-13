package ru.mirea.task8.third;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Film extends JFrame{
    Film(){
        super("Sosiska");
        setSize(244, 320);
        setLocationRelativeTo(null);
        JLabel jl = new JLabel();
        ImageIcon img = new ImageIcon("C:\\Папка для треша\\sosiska.gif");
        jl.setIcon(img);
        add(jl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Film();
    }
}

