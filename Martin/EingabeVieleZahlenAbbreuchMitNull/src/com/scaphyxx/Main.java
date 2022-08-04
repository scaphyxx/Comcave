package com.scaphyxx;

import java.util.Scanner;

/** main */
public class Main {

  public static void main(String[] args) {
    System.out.println("Gib Zahlen > 1 ein" + "\n0 zum Beenden");
    Scanner scanner = new Scanner(System.in);
    String zahlen = "";
    String input = "";
    while (true) {
      input = scanner.nextLine();
      if (isInteger(input)) {
        if (input.equals("0")) {
          zahlen += input;
          break;
        }
        zahlen += input + " ";
      }
    }

    int[] zahlenArray = new int[zahlen.split(" ").length];

    int sum = 0;
    for (int i = 0; i < zahlen.split(" ").length; i++) {
      zahlenArray[i] = Integer.parseInt(zahlen.split(" ")[i]);
      System.out.println("Eingabe" + (i + 1) + ". Zahl: " + zahlen.split(" ")[i]);
    }

    System.out.println();

    for (int i = 0; i < zahlenArray.length - 1; i++) {
      sum += zahlenArray[i];
      if (i == zahlenArray.length - 2) {
        System.out.print(zahlenArray[i] + " = " + sum);
        break;
      }
      System.out.print(zahlenArray[i] + " + ");
    }
  }

  public static boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException ex) {
      System.out.println("Das war keine Zahl");
    }
    return false;
  }
}
