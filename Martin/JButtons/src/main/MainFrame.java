package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

  private JButton red;
  private JButton blue;
  private JButton green;
  private JButton yellow;
  private JButton orange;

  public MainFrame() {
    // 5 buttons that change Background on click
    this.red = new JButton("Red");
    this.blue = new JButton("Blue"); // 2 panels
    this.green = new JButton("Green");
    this.yellow = new JButton("Yellow");
    this.orange = new JButton("Orange");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    // add buttons to panel1
    panel1.add(this.red);
    panel1.add(this.blue);
    panel1.add(this.green);
    panel1.add(this.yellow);
    panel1.add(this.orange);

    // add panel1 to panel2
    panel2.add(panel1);

    // add panel2 to frame
    add(panel2);

    // add action listener to buttons
    this.red.addActionListener(
        new ActionListener() {

          public void actionPerformed(ActionEvent e) {
            panel1.setBackground(Color.red);
            panel2.setBackground(Color.red);
          }
        });

    this.blue.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            panel1.setBackground(Color.blue);
            panel2.setBackground(Color.blue);
          }
        });

    this.green.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            panel1.setBackground(Color.green);
            panel2.setBackground(Color.green);
          }
        });

    this.yellow.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            panel1.setBackground(Color.yellow);
            panel2.setBackground(Color.yellow);
          }
        });

    this.orange.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            panel1.setBackground(Color.orange);
            panel2.setBackground(Color.orange);
          }
        });

    setTitle("Change Background Color");
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }

  public JButton getRed() {
    return red;
  }

  public void setRed(JButton red) {
    this.red = red;
  }

  public JButton getBlue() {
    return blue;
  }

  public void setBlue(JButton blue) {
    this.blue = blue;
  }

  public JButton getGreen() {
    return green;
  }

  public void setGreen(JButton green) {
    this.green = green;
  }

  public JButton getYellow() {
    return yellow;
  }

  public void setYellow(JButton yellow) {
    this.yellow = yellow;
  }

  public JButton getOrange() {
    return orange;
  }

  public void setOrange(JButton orange) {
    this.orange = orange;
  }
}
