package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class   Football extends JFrame
{
    private int AC = 0;
    private int real = 0;
    private String win;
    private String last;
    private String space = "                                          ";

    JButton bW = new JButton("AC Milan");
    JButton bE = new JButton("Real Madrid");
    JLabel lS = new JLabel("Winner: ");
    JLabel lN = new JLabel("Last Scorer: ");
    JLabel lC = new JLabel(space+AC+" X "+real);

    public void w()
    {
        if(AC == real)
            win = "draw";
        else if (AC > real)
            win = "AC Milan";
        else
            win = "Real Madrid";
        lS.setText("Winner: "+win);
    }

    JPanel[] pnl = new JPanel[0];
    public Football()
    {
        super("Football...");
        setSize(500,500);

        setLayout(new BorderLayout());
        add(bW,BorderLayout.WEST);
        add(bE,BorderLayout.EAST);
        add(lS,BorderLayout.SOUTH);
        add(lN,BorderLayout.NORTH);
        add(lC,BorderLayout.CENTER);

        bW.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent ae)
        {
            ++AC;
            lC.setText(space+AC+" X "+real);
            w();
            last = "AC Milan";
            lN.setText("Last Scorer: "+last);
        } });
        bE.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent ae)
        {
            ++real;
            lC.setText(space+AC+" X "+real);
            w();
            last = "Real Madrid";
            lN.setText("Last Scorer: "+last);
        } });
    }
    public static void main(String[]args)
    {new Football().setVisible(true);}
}
