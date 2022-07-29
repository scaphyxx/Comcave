package com.scaphyxx;

import java.util.Scanner;

/** main */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean quit = false;
    String bestellung = "";
    print();

    while (!quit) {
      System.out.println("Welche Speise wollen Sie bestellen?");
      try {
        int eingabe = sc.nextInt();
        switch (eingabe) {
          case 1:
            bestellung = bestellung + "Doener ";
            break;
          case 2:
            bestellung = bestellung + "Currywurst ";
            break;
          case 3:
            bestellung = bestellung + "Pommes ";
            break;
          case 4:
            bestellung = bestellung + "Schaschlik ";
            break;
          case 5:
            bestellung = bestellung + "Haenchen ";
            break;
          case 6:
            quit = true;
            System.out.println("Tschau");
            if (!bestellung.equals("")) {
              String[] bestellungArray = bestellung.split(" ");
              System.out.println("Ihre Bestellung:");
              for (int i = 0; i < bestellungArray.length; i++) {
                System.out.println(i + 1 + ". " + bestellungArray[i]);
              }
              break;
            } else {
              System.out.println("Du hast nichts bestellt");
              break;
            }
          default:
            System.out.println("Ungueltige Eingabe");
            break;
        }
      } catch (Exception e) {
        System.out.println("Ungueltige Eingabe");
        print();
        sc.nextLine();
      }
    }
    sc.close();
  }

  public static void print() {
        System.out.println(
        "Speisekarte:"
            + "\n1. Doener"
            + "\n2. Currywurst"
            + "\n3. Pommes"
            + "\n4. Schaschlik"
            + "\n5. Haenchen "
            + "\n6. Beenden");
  }
}
