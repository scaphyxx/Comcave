package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
  public MainFrame() {
    // 5 buttons that change Background on click
    JButton red = new JButton("Red");
    JButton blue = new JButton("Blue");
    JButton green = new JButton("Green");
    JButton yellow = new JButton("Yellow");
    JButton orange = new JButton("Orange");

    // 2 panels
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    // add buttons to panel1
    panel1.add(red);
    panel1.add(blue);
    panel1.add(green);
    panel1.add(yellow);
    panel1.add(orange);

    // add panel1 to panel2
    panel2.add(panel1);

    // add panel2 to frame
    add(panel2);

    // add action listener to buttons
    red.addActionListener(
        new ActionListener() {

          public void actionPerformed(ActionEvent e) {
            panel1.setBackground(Color.red);
            panel2.setBackground(Color.red);
          }
        });

    blue.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            panel1.setBackground(Color.blue);
            panel2.setBackground(Color.blue);
          }
        });

    green.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            panel1.setBackground(Color.green);
            panel2.setBackground(Color.green);
          }
        });

    yellow.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            panel1.setBackground(Color.yellow);
            panel2.setBackground(Color.yellow);
          }
        });

    orange.addActionListener(
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
}
