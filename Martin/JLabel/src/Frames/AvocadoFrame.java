package Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AvocadoFrame {
  private static final String QUOTE = "If life gives you avocados, make guacamole!";
  private static final BufferedImage BUFFERED_IMAGE = new BufferedImage(1, 1, 1);
  private static final File INPUT = new File("src/img/avocado-gb38d4f136_640.jpg");
  private static final int height = 680;
  private static final int width = 680;

  public AvocadoFrame() {
    JFrame jf = new JFrame("Avocado");
    jf.setSize(width, height);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    BufferedImage image = BUFFERED_IMAGE;
    try {
      image = ImageIO.read(INPUT);
    } catch (Exception e) {
      System.err.println("Date nicht gefunden");
      e.printStackTrace();
    }
    ImageIcon img = new ImageIcon(image);

    JLabel jl = new JLabel();

    jl.setIcon(img);
    jl.setBackground(new Color(0x96ccf1));
    jl.setOpaque(true);
    jl.setText(QUOTE);
    jl.setFont(new Font("Serif", Font.BOLD, 32));
    jl.setHorizontalAlignment(JLabel.CENTER);
    jl.setVerticalAlignment(JLabel.CENTER);
    jl.setHorizontalTextPosition(JLabel.CENTER);
    jl.setVerticalTextPosition(JLabel.BOTTOM);

    jf.add(jl);
  }
}
