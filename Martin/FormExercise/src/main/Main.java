package main;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main {

  public static void main(String[] args) {
    JFrame f = new JFrame("Alter bestätigen");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(550, 200);
    f.setLocationRelativeTo(null);

    JPanel formContainer = new JPanel();
    JPanel root = new JPanel();
    JPanel genderRadioContainer = new JPanel(new GridLayout());
    JLabel lFirstName = new JLabel("Vorname");
    JTextField iFirstName = new JTextField(20);
    JLabel lLastName = new JLabel("Nachname");
    JTextField iLastName = new JTextField(20);
    JLabel jGender = new JLabel("Geschlecht");
    JRadioButton rGender1 = new JRadioButton("Männlich");
    JRadioButton rGender2 = new JRadioButton("Weiblich");
    ButtonGroup bgGender = new ButtonGroup();
    bgGender.add(rGender1);
    bgGender.add(rGender2);
    JLabel lAge = new JLabel("Age");
    JTextField iAge = new JTextField(5);

    formContainer.setLayout(new GridLayout(5, 1));
    formContainer.add(lFirstName);
    formContainer.add(iFirstName);
    formContainer.add(lLastName);
    formContainer.add(iLastName);
    formContainer.add(lAge);
    formContainer.add(iAge);
    formContainer.add(jGender);
    genderRadioContainer.add(rGender1);
    genderRadioContainer.add(rGender2);
    formContainer.add(genderRadioContainer);
    JButton submit = new JButton("Submit");
    formContainer.add(submit);
    root.add(formContainer);
    f.add(root);
    f.setVisible(true);
    System.out.println("RUNNING...");

    submit.addActionListener(
        e -> {
          JOptionPane.showMessageDialog(
              f,
              (iLastName.getText().hashCode() == 0
                      || iFirstName.getText().hashCode() == 0
                      || iAge.getText().hashCode() == 0
                      || (!rGender1.isSelected() && !rGender2.isSelected()))
                  ? "Bitte fülle alle Felder aus."
                  : !isParsable(iAge.getText())
                      ? "Das Alter muss eine Zahl sein"
                      : ((Integer.parseInt(iAge.getText())) < 18)
                          ? "Du bist zu Jung!"
                          : "Hallo "
                              + (rGender1.isSelected() ? "Herr" : "Frau")
                              + " "
                              + iFirstName.getText()
                              + " "
                              + iLastName.getText()
                              + ". ");
        });
  }

  public static boolean isParsable(String input) {
    try {
      Integer.parseInt(input);
      return true;
    } catch (final NumberFormatException e) {
      return false;
    }
  }
}
