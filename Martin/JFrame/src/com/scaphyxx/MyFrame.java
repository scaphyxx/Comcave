package com.scaphyxx;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
  public MyFrame(String title) {
    super(title);
    this.setSize(680, 680);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setIconImage(
        new ImageIcon("src/img/—Pngtree—modern abstract 3d logo_4092287.png").getImage());
    this.setVisible(true);


  }
}
