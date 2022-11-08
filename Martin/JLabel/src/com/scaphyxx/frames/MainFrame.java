package com.scaphyxx.frames;

import javax.swing.JFrame;

public class MainFrame {
  private final int height = 680;
  private final int width = 680;
  private final JFrame jf = new JFrame();

  public MainFrame() {
    jf.setSize(width, height);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public JFrame getJf() {
    return jf;
  }
}
