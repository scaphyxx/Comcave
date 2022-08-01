package com.scaphyxx;

import java.util.Scanner;

/** main */
public class Main {

  private static int coins = 10;
  private static int bet;
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // Slotmachine
    boolean quit = false;
    System.out.println("Welcome to Slutty - the nicest slotmachine in the world!");
    printMenu();
    while (!quit) {
      switch (sc.nextLine()) {
        case "":
          System.out.println(printResult(roll()));
          sc.nextLine();
          printMenu();
          break;
        default:
          quit = true;
          System.out.println("\nTschuesssss...");
          System.exit(0);
      }
    }
  }

  public static void printMenu() {
    System.out.println("\nDruecke...");
    System.out.println("Alles andere - Exit");
    System.out.println("Enter - Einmal Rollen");
  }

  public static int[] roll() {
    System.out.println("Wie viel willst du setzen?");
    bet = sc.nextInt();
    int[] slots = new int[3];
    if (coins < 1) {
      return null;
    } else if (bet > coins) {
      System.out.println("\nZu viel gesetzt!");
      return null;
    } else {
      coins -= bet;
      System.out.println("\nAm Rollen...");
      for (int i = 0; i < slots.length; i++) {
        slots[i] = random();
      }
    }
    return slots;
  }

  public static int random() {
    return (int) (Math.random() * 9) + 1;
  }

  public static int checkSlutty(int[] slots) {
    int result = 0;
    for (int i = 0; slots != null && i < slots.length; i++) {
      for (int j = slots.length - 1; j > i; j--) {
        if (slots[i] == slots[j]) {
          result++;
        }
      }
      if (result == 2) {
        return result;
      }
    }
    return result;
  }

  public static String printResult(int[] slots) {
    String result = "";
    for (int i = 0; slots != null && i < slots.length; i++) {
      result += slots[i] + " ";
    }
    int matches = checkSlutty(slots);
    switch (matches) {
      case 0:
      if (coins == 0) {
        System.out.println(result += "\n\nGAME OVER");
        System.exit(0);
      }
        result += "- leider verloren, Guthaben " + coins + " Coins";
        break;
      case 1:
        coins += 3 * bet;
        result += "- " + bet * 3 + " Coins gewonnen, Guthaben " + coins + " Coins";
        break;
      case 2:
        coins += 10 * bet;
        result += "- " + bet * 10 + " Coins gewonnen, Guthaben " + coins + " Coins";
        break;
    }
    return result;
  }
}
