package com.scaphyxx.panels;

import java.awt.*;
import javax.swing.*;

public class CenterGrid extends JLabel {

  public CenterGrid() {
    this.setLayout(new GridLayout(2, 2));

    JPanel redPanel = new JPanel();
    JPanel bluePanel = new JPanel();
    JPanel greenPanel = new JPanel();
    JPanel yellowPanel = new JPanel();


    // Hintergrundfarbe setzen
    redPanel.setBackground(Color.RED);
    bluePanel.setBackground(Color.BLUE);
    greenPanel.setBackground(Color.GREEN);
    yellowPanel.setBackground(Color.YELLOW);

    this.add(redPanel);
    this.add(bluePanel);
    this.add(greenPanel);
    this.add(yellowPanel);
  }
}
