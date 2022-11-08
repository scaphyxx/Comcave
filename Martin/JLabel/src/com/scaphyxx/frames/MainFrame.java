package com.scaphyxx.frames;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

  private final int height = 640;
  private final int width = 640;

  public MainFrame() {
    super();
    this.setSize(width, height);
    this.setVisible(true);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
