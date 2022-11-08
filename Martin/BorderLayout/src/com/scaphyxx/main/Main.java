package com.scaphyxx.main;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setSize(800, 800);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);

    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel centerPanel = new JPanel();

    JPanel redPanel = new JPanel();
    JPanel bluePanel = new JPanel();
    JPanel greenPanel = new JPanel();
    JPanel yellowPanel = new JPanel();

    // Hintergrundfarbe setzen
    redPanel.setBackground(Color.RED);
    bluePanel.setBackground(Color.BLUE);
    greenPanel.setBackground(Color.GREEN);
    yellowPanel.setBackground(Color.YELLOW);

    northPanel.setBackground(Color.WHITE);
    southPanel.setBackground(Color.WHITE);
    eastPanel.setBackground(Color.WHITE);
    westPanel.setBackground(Color.WHITE);
    centerPanel.setBackground(Color.BLACK);

    northPanel.setPreferredSize(new Dimension(100, 100));
    southPanel.setPreferredSize(new Dimension(50, 50));
    eastPanel.setPreferredSize(new Dimension(50, 50));
    westPanel.setPreferredSize(new Dimension(50, 50));


    f.add(centerPanel, BorderLayout.CENTER);
    f.add(northPanel, BorderLayout.NORTH);
    f.add(southPanel, BorderLayout.SOUTH);
    f.add(eastPanel, BorderLayout.EAST);
    f.add(westPanel, BorderLayout.WEST);

    centerPanel.add(redPanel);
    centerPanel.add(greenPanel);
    centerPanel.add(bluePanel);
    centerPanel.add(yellowPanel);
  }
}
