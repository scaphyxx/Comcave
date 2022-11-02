package com.scaphyxx;

public class Main {

  public static void main(String[] args) {
    int[] gezogen = new int[6];
    int[] meineZahlen = {32, 15, 12, 32, 45, 42};
    int counter = 0;

    for (int i = 0; i < gezogen.length; i++) {
      while (true) {
        int zahl = (int) (Math.random() * 49 + 1);
        boolean exists = false;

        for (int j = 0; j < gezogen.length; j++) {
          if (gezogen[j] == zahl) {
            exists = true;
            break;
          }
        }

        if (!exists) {
          gezogen[i] = zahl;
          break;
        }
      }
    }

    for (int i = 0; i < gezogen.length; i++) {
      if (gezogen[i] == meineZahlen[i]) {
        counter++;
      }
    }

    System.out.println("Deine Zahlen: " + meineZahlen[0] + ", " + meineZahlen[1] + ", " + meineZahlen[2] + ", " + meineZahlen[3] + ", " + meineZahlen[4] + ", " + meineZahlen[5]);
    System.out.println("Gezogen: " + gezogen[0] + ", " + gezogen[1] + ", " + gezogen[2] + ", " + gezogen[3] + ", " + gezogen[4] + ", " + gezogen[5]);
    System.out.println(counter == 1 ? "Du hast " + counter + " richtige Zahl" : "Du hast " + counter + " richtige Zahlen");
  }
}
