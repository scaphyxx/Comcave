package com.scaphyxx.frames;

import com.scaphyxx.panels.BorderPanel;
import com.scaphyxx.panels.CenterGrid;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
  private final int height = 600;
  private final int width = 600;

  public MainFrame() {
    setTitle("");
    setSize(width, height);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(new BorderLayout());
    setLocationRelativeTo(null);
    this.add("North", new BorderPanel());
    this.add("East", new BorderPanel());
    this.add("South", new BorderPanel());
    this.add("West", new BorderPanel());
    this.add("Center", new CenterGrid());
    this.setVisible(true);
  }
}
