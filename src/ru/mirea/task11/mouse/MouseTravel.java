package ru.mirea.task11.mouse;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MouseTravel extends JFrame
{
    JLabel lbl = new JLabel("");
    public MouseTravel()
    {
        super("Dude! Where's my mouse?");
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                if(a.getY()<100)
                {lbl.setText("Welcome to Gulag!");}
                else if(a.getY()>300)
                {lbl.setText("Welcome to South!");}
                else if(a.getY()>100&&a.getY()<300&&a.getX()<100)
                {lbl.setText("Welcome to West!");}
                else if(a.getY()>100&&a.getY()<300&&a.getX()>300)
                {lbl.setText("Welcome to East!");}
                else
                {lbl.setText("Welcome to center!");}
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new MouseTravel().setVisible(true);
    }
}