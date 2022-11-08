package com.scaphyxx.main;

import java.awt.*;
import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    // Array 10 Labels numberd 1 - 10
    JLabel[] labels = new JLabel[10];
    for (int i = 0; i < labels.length; i++) {
      labels[i] = new JLabel(Integer.toString(i + 1));
    }

    // Create a new JFrame
    JFrame frame = new JFrame("Test");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    // Set Layout to flowLayout
    frame.setLayout(new FlowLayout());

    // Add the labels to the frame
    for (JLabel label : labels) {
      frame.add(label);
    }

    // Set the size of the frame to 400x400 and make it visible
    frame.setSize(400, 400);
    frame.setVisible(true);
  }
}
