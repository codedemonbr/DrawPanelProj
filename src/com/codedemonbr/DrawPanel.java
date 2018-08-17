package com.codedemonbr;

import javax.swing.JPanel;
import java.awt.*;

public class DrawPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        //starts on (0,0) and stoped over (width, height)
        g.setColor(Color.red);
        g.drawLine(0,0,width, 0);
        g.drawLine(0,0,width, 10);

        for (int counter = 0; counter < height/10; counter++)
        {
            g.drawLine(0,0, width, counter*10);
        }
        g.setColor(Color.blue);
        for (int counter = 0; counter < height/10; counter++)
        {
            g.drawLine(width, 0, 0, counter*10);
        }
        g.setColor(Color.green);
        for (int counter = 0; counter < width/10; counter++)
        {
            g.drawLine(counter*10, 0, counter*10, height );
        }
        //g.drawLine(0,0, width, height);
        //g.drawLine(0, width, height, 0);
        //g.drawOval(width/2,height/2, 50, 50);
    }
}
