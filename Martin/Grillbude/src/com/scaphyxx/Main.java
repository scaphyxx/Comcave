package com.scaphyxx;

import java.util.Scanner;

/** main */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean quit = false;
    String bestellung = "";
    System.out.println(
        "Speisekarte:"
            + "\n1. Doener"
            + "\n2. Currywurst"
            + "\n3. Pommes"
            + "\n4. Schaschlik"
            + "\n5. Haenchen "
            + "\n6. Beenden");

    while (!quit) {
      System.out.println("Welche Speise wollen Sie bestellen?");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Doener");
          bestellung += "Doener ";
          break;
        case 2:
          System.out.println("Currywurst");
          bestellung += "Currywurst ";
          break;
        case 3:
          System.out.println("Pommes");
          bestellung += "Pommes ";
          break;
        case 4:
          System.out.println("Schaschlik");
          bestellung += "Schaschlik ";
          break;
        case 5:
          System.out.println("Haenchen");
          bestellung += "Haenchen ";
          break;
        case 6:
          quit = true;
          System.out.println("Tschau");
          if (!bestellung.equals("")) {
            String[] bestellungArray = bestellung.split(" ");
            System.out.println("Ihre Bestellung:");
            for (int i = 0; i < bestellungArray.length; i++) {
              System.out.println(i+1 + ". " + bestellungArray[i]);
            }
            break;
          } else {
            System.out.println("Du hast nichts bestellt");
            break;
          }
        default:
          System.out.println("Ungueltige Eingabe");
      }
    }
  }
}
