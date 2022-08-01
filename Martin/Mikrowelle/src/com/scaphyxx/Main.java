package com.scaphyxx;

import java.util.Scanner;

/** main */
public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean quit = false;

    System.out.println("Was willst du tun?");
    printInstructions();
    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch (action) {
        case 0:
          System.out.println("Verlasse...");
          quit = true;
          break;
        case 1:
          printTime();
          printInstructions();
          break;
      }
    }
  }

  private static void printTime() {
    System.out.println("Wie viele Portionen?");
    int portions = scanner.nextInt();
    System.out.println("Wie lange?");
    int time = scanner.nextInt();

    switch (portions) {
      case 0:
        System.out.println("Keine Portionen");
        break;
      case 1:
        System.out.println("1 Portion: " + time + " Minuten");
        break;
      case 2:
        System.out.println("2 Portionen: " + time * 1.5 + " Minuten");
        break;
      case 3:
        System.out.println("3 Portionen: " + time * 2 + " Minuten");
        break;
      default:
        System.out.println("Zu viele Portionen");
        break;
    }
  }

  public static void printInstructions() {
    System.out.println("0: Verlassen");
    System.out.println("1: Zeit");
  }
}
