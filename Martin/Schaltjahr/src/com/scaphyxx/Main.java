package com.scaphyxx;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int year = 1;
    while (year != 0) {
      System.out.print("Gib ein Jahr ein (0 zum beenden): ");
      year = scanner.nextInt();
      if (year != 0) {
        if (year % 4 == 0) {
          System.out.println(year + " ist ein Schaltjahr\n");
        } else {
          System.out.println(year + " ist kein Schaltjahr\n");
        }
      }
    }
    scanner.close();
  }
}
