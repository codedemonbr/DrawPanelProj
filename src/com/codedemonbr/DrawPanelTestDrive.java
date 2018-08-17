package com.codedemonbr;

import javax.swing.JFrame;


public class DrawPanelTestDrive
{
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();
        application.add(panel);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        application.setSize(600, 600);
        application.setVisible(true);
    }
}
