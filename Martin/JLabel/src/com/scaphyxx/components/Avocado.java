package com.scaphyxx.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Avocado {
  private final String QUOTE = "If life gives you avocados, make guacamole!";
  private final BufferedImage BUFFERED_IMAGE = new BufferedImage(1, 1, 1);
  private final File INPUT = new File("src/img/avocado-gb38d4f136_640.jpg");
  private final JLabel jl = new JLabel();

  public Avocado() {

    BufferedImage image = BUFFERED_IMAGE;
    try {
      image = ImageIO.read(INPUT);
    } catch (Exception e) {
      System.err.println("Date nicht gefunden");
      e.printStackTrace();
    }
    ImageIcon img = new ImageIcon(image);

    jl.setIcon(img);
    jl.setBackground(new Color(0x96ccf1));
    jl.setOpaque(true);
    jl.setText(QUOTE);
    jl.setFont(new Font("Serif", Font.BOLD, 32));
    jl.setHorizontalAlignment(JLabel.CENTER);
    jl.setVerticalAlignment(JLabel.CENTER);
    jl.setHorizontalTextPosition(JLabel.CENTER);
    jl.setVerticalTextPosition(JLabel.BOTTOM);
  }

  public JLabel getJl() {
    return this.jl;
  }
}
