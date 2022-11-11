package main;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
  public MainFrame() {
    super();
    setSize(new Dimension(640, 860));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);

    JPanel panel1 = new JPanel();
    MyFrame panel2 = new MyFrame();

    panel1.add(panel2);
  }
}
