package com.scaphyxx;

public class Main {

  public static void main(String[] args) {
    int start = 1;
    int end = 0;
    int counter = 0;
    boolean isPrime = false;

    System.out.println("Primzahlenbereich");
    System.out.println("Von: ");
    start = new java.util.Scanner(System.in).nextInt();
    System.out.println("Bis: ");
    end = new java.util.Scanner(System.in).nextInt();
    System.out.println();

    for (int i = start; i <= end; i++) {
      isPrime = true;
      int j;
      for (j = 2; j < i / 2; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.print(counter == 0 ? i : ", " + i);
        counter++;
      }
    }
    System.out.println();
    System.out.println("Es wurden " + counter + " Primzahlen gefunden");
  }
}
