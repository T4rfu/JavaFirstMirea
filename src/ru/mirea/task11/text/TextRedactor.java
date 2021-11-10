package ru.mirea.task11.text;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class TextRedactor extends JFrame
{
    JTextArea area = new JTextArea("text", 8, 10);
    JMenuBar menuBar = new JMenuBar();


    public TextRedactor()
    {
        super ("Redactor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        menuBar.add(createColorMenu());
        menuBar.add(createFontMenu());

        setJMenuBar(menuBar);

        area.setFont(new Font("Dialog", Font.PLAIN, 14));
        area.setTabSize(10);
        add(area);

        JPanel contents = new JPanel();
        contents.add(new JScrollPane(area));
        setContentPane(contents);
        setSize(400, 300);

    }

    private JMenu createColorMenu()
    {
        JMenu color = new JMenu("Color");

        JMenuItem red = new JMenuItem("Red");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem black = new JMenuItem("Black");

        color.add(red);
        color.add(blue);
        color.add(black);

        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aRed) {
                area.setForeground(Color.RED);
            }});

        blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aBlue) {
                area.setForeground(Color.BLUE);
            }});

        black.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aBlack) {
                area.setForeground(Color.BLACK);
            }});
        return color;
    }

    private JMenu createFontMenu()
    {
        JMenu font = new JMenu("Font");

        JMenuItem times = new JMenuItem("TimesRoman");
        JMenuItem courier = new JMenuItem("Courier");
        JMenuItem arial = new JMenuItem("Arial");

        font.add(times);
        font.add(courier);
        font.add(arial);

        times.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aRed) {
                area.setFont(new Font("TimesRoman", Font.BOLD, 14));
            }});

        courier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aRed) {
                area.setFont(new Font("Courier", Font.ITALIC, 18));
            }});

        arial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aRed) {
                area.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 16));
            }});
        return font;
    }

    public static void main(String[] args)
    {
        new TextRedactor().setVisible(true);
    }
}
