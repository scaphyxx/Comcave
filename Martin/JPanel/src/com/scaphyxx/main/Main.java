package com.scaphyxx.main;

import java.awt.*;
 
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

  public static void main(String[] args) {
    // JFrame erzeugen
    // GridBagLayout zur Vertiefung
    JFrame f = new JFrame("JPanel");
    f.setLayout(new GridLayout(2, 2, 10, 10));
    f.setSize(800, 800);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // JPanel dient als Container (Behaelter) fuer andere Komponenten
    JPanel redPanel = new JPanel();
    JPanel bluePanel = new JPanel();
    JPanel greenPanel = new JPanel();
    JPanel yellowPanel = new JPanel();


    // Hintergrundfarbe setzen
    redPanel.setBackground(Color.RED);
    bluePanel.setBackground(Color.BLUE);
    greenPanel.setBackground(Color.GREEN);
    yellowPanel.setBackground(Color.YELLOW);


    // redPanel.setBounds(0, 0, 400, 400);
    // bluePanel.setBounds(0, 400, 400, 400);
    // greenPanel.setBounds(400, 0, 400, 400);
    // yellowPanel.setBounds(400, 400, 400, 400);

    f.add(redPanel);
    f.add(bluePanel);
    f.add(greenPanel);
    f.add(yellowPanel);

    f.setVisible(true);
  }
}
