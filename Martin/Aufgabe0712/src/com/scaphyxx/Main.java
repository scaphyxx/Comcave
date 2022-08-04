package com.scaphyxx;

import java.util.Arrays;
import java.util.Scanner;

/** main */
public class Main {

  private static int coins = 10;
  private static int bet;

  private static String choice;
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // Slotmachine
    boolean quit = false;
    System.out.println(
        "- Welcome to Slutty - "
            + "\nThe nicest Slutmachine in the World!"
            + "\nDu startest mit 10 Coins");
    printStartMenu();
    while (!quit) {
      choice = sc.nextLine();
      switch (choice) {
        case "":
          if (bet != 0) {
            System.out.println(printResult(roll(choice)));
            printGameMenu();
            break;
          } else {
            System.out.println(printResult(roll()));
            sc.nextLine();
            printGameMenu();
            break;
          }
        case "c":
          System.out.println(printResult(roll()));
          sc.nextLine();
          printGameMenu();
          break;
        default:
          quit = true;
          if (10 - coins == 1) {
            System.out.println("LOSER!!! DU HAST 1 COIN VERLOREN!!!");
            System.exit(0);
          } else if (coins < 10) {
            System.out.println("LOSER!!! DU HAST " + (10 - coins) + " COINS VERLOREN!!!");
            System.exit(0);
          }
          System.out.println("\nSuper! DU HAST " + coins + " COINS GEWONNEN");
          System.exit(0);
      }
    }
  }

  public static void printStartMenu() {
    System.out.println("\nDruecke...");
    System.out.println("Enter\t\t - Einmal rollen");
    System.out.println("Alles andere\t - Exit");
  }

  public static void printGameMenu() {
    System.out.println("\nDruecke...");
    System.out.println("Enter\t\t - Noch Einmal mit dem gleichen Betrag rollen");
    System.out.println("C\t\t - Mit einem neuen Betrag rollen");
    System.out.println("Alles andere\t - Exit");
  }

  public static int[] roll() {
    System.out.println("Wie viel willst du setzen?");
    bet = sc.nextInt();
    int[] slots = new int[3];
    if (bet > coins) {
      return new int[] {-1, -1, 0};
    } else {
      coins -= bet;
      System.out.println("\nAm Rollen...");
      for (int i = 0; i < slots.length; i++) {
        slots[i] = random();
      }
    }
    return slots;
  }

  public static int[] roll(String choice) {
    int[] slots = new int[3];
    if (bet > coins) {
      return new int[] {-1, -1, 0};
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
    if (Arrays.toString(slots).equals(Arrays.toString((new int[] {-1, -1, 0})))) {
      return "Du hast nicht genug Coins!";
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
