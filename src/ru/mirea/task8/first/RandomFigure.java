package ru.mirea.task8.first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ru.mirea.task7.shape.Shape;
import ru.mirea.task7.shape.Circle;
import ru.mirea.task7.shape.Rectangle;
import ru.mirea.task7.shape.Square;
import java.util.Random;

class Risovach extends JComponent {
    public void paintComponent(Graphics g) {
        Random objGenerator = new Random();
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        String[] colors  = new String[] {"BLUE", "RED ","GREEN", "BLACK","ORANGE","MAGENTA"};

        for (int i = 0; i < 20; i++) {
            int randomNumber = objGenerator.nextInt(3);
            switch (randomNumber) {
                case (0): {
                    double rR = objGenerator.nextInt(40);
                    int value = (int) rR;
                    int rC = objGenerator.nextInt(6);
                    Shape s1 = new Circle(rR, colors[rC],false);
                            switch(rC)
                            {
                                case(0):    g2d.setPaint(Color.BLUE);   break;
                                case(1):    g2d.setPaint(Color.RED);    break;
                                case(2):    g2d.setPaint(Color.GREEN);  break;
                                case(3):    g2d.setPaint(Color.BLACK);  break;
                                case(4):    g2d.setPaint(Color.ORANGE); break;
                                case(5):    g2d.setPaint(Color.MAGENTA);break;
                            }
                    g2d.fillOval(objGenerator.nextInt(400),objGenerator.nextInt(400),value,value);
                            break;
                }
                case (1): {
                    double rW = objGenerator.nextInt(30);
                    double rH = objGenerator.nextInt(50);
                    int valueW = (int) rW;
                    int valueH = (int) rH;

                    int rC = objGenerator.nextInt(6);
                    Shape s1 = new Rectangle(rW, rH, colors[rC],false);
                    switch(rC)
                    {
                        case(0):    g2d.setPaint(Color.BLUE);   break;
                        case(1):    g2d.setPaint(Color.RED);    break;
                        case(2):    g2d.setPaint(Color.GREEN);  break;
                        case(3):    g2d.setPaint(Color.BLACK);  break;
                        case(4):    g2d.setPaint(Color.ORANGE); break;
                        case(5):    g2d.setPaint(Color.MAGENTA);break;
                    }
                    g2d.drawRect(objGenerator.nextInt(400),objGenerator.nextInt(400),valueH,valueW);
                    break;
                }
                case (2): {
                    double rH = objGenerator.nextInt(50);
                    int valueH = (int) rH;

                    int rC = objGenerator.nextInt(6);
                    Shape s1 = new Square(rH, colors[rC],false);
                    switch(rC)
                    {
                        case(0):    g2d.setPaint(Color.BLUE);   break;
                        case(1):    g2d.setPaint(Color.RED);    break;
                        case(2):    g2d.setPaint(Color.GREEN);  break;
                        case(3):    g2d.setPaint(Color.BLACK);  break;
                        case(4):    g2d.setPaint(Color.ORANGE); break;
                        case(5):    g2d.setPaint(Color.MAGENTA);break;
                    }
                    g2d.fillRect(objGenerator.nextInt(400),objGenerator.nextInt(400),valueH,valueH);
                    break;
                }
            }
        }
    }
}

class RandomFigure extends JFrame
{
    public static void main(String[] args) {
        JFrame w = new JFrame("Окно с изображением");
        w.setSize(400, 400);

        Risovach p = new Risovach();
        w.add(p);
        w.setVisible(true);
    }
}