package com.scaphyxx;

import java.util.Scanner;

/** main */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Bei Bruchrechnung auf zwei Stellen runden" + "\nEnter druecken zum beenden");
    char[] operators = new char[] {'+', '-', '*', '/', '%'};
    int richtig = 0;
    int falsch = 0;
    double avr = 0;
    while (true) {
      boolean repeat = true;
      double beginn, ende;
      beginn = System.currentTimeMillis();
      int randOp = (int) (Math.random() * 5);
      int rand1 = zahlenBis(100);
      int rand2 = 0;
      switch (randOp) {
        case 0:
          rand2 = zahlenBis(100);
          break;
        case 1:
          rand2 = zahlenBis(100);
          break;
        case 2:
          rand2 = zahlenBis(10);
          break;
        case 3:
          while (rand2 == 0) rand2 = zahlenBis(9) + 1;
          break;
        case 4:
          while (rand2 == 0) rand2 = zahlenBis(9) + 1;
          break;
      }

      while (repeat) {
        try {
          System.out.print(rand1 + " " + operators[randOp] + " " + rand2 + " = ");

          String input = scanner.nextLine();
          if (input.toLowerCase().equals("")) {
            System.out.println(
                "\nIch hoffe du hattest Spass beim Rechnen!"
                    + "\nDu hattest "
                    + richtig
                    + " Aufgabe(n) richtig"
                    + " und "
                    + falsch
                    + " Aufgabe(n) falsch" + 
              "\nDurchschnittliche Zeit pro Aufgabe: " + Math.round(avr/(richtig + falsch) * 100) /100.0);
            return;
          } else {

            switch (randOp) {
              case 0:
                if (Integer.parseInt(input) == rand1 + rand2) {
                  System.out.println("Richtig!");
                  richtig++;
                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
                  break;
                } else {
                  falsch++;
                  System.out.println("Falsch!");
                  System.out.println("Richtig wäre: " + (rand1 + rand2));
                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
                  break;
                }
              case 1:
                if (Integer.parseInt(input) == rand1 - rand2) {
                  System.out.println("Richtig!");
                  richtig++;
                  break;
                } else {
                  falsch++;
                  System.out.println("Falsch!");
                  System.out.println("Richtig wäre: " + (rand1 - rand2));
                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
                  break;
                }
              case 2:
                if (Integer.parseInt(input) == rand1 * rand2) {
                  System.out.println("Richtig!");
                  richtig++;
                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
                  break;
                } else {
                  falsch++;
                  System.out.println("Falsch!");
                  System.out.println("Richtig wäre: " + (rand1 * rand2));
                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
                  break;
                }
              case 3:
                if (Double.parseDouble(input)
                    == Math.round(((double) rand1 / rand2) * 100) / 100.0) {
                  System.out.println("Richtig!");
                  richtig++;
                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
                  break;
                } else {
                  falsch++;
                  System.out.println("Falsch!");
                  System.out.println(
                      "Richtig wäre: " + Math.round(((double) rand1 / rand2) * 100) / 100.0);
                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
                  break;
                }
              case 4:
                if (Integer.parseInt(input) == (rand1 % rand2)) {
                  System.out.println("Richtig!");
                  richtig++;
                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
                  break;
                } else {
                  falsch++;
                  System.out.println("Falsch!");
                  System.out.println("Richtig wäre: " + (rand1 % rand2));
                  avr += (System.currentTimeMillis() - beginn) / 1000.0;
                  break;
                }
            }

            ende = System.currentTimeMillis();
            System.out.println("Zeit: " + Math.round(((ende - beginn) / 1000) * 100) /100.0 + " Sekunden.");
            repeat = false;
          }
        } catch (Exception e) {
          System.out.println("Falsche Eingabe!");
          repeat = true;
        }
      }
    }
  }

  public static int zahlenBis(int wert) {
    return (int) (Math.random() * wert + 1);
  }
}
