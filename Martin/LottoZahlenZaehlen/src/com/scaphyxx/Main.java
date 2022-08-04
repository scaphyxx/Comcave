package com.scaphyxx;

import java.util.Arrays;

/**
 * main
 */
public class Main {

  public static void main(String[] args) {
    int[] gezogeneZahlen = new int[10000]; 

    for (int i = 0; i < gezogeneZahlen.length; i++) {
      gezogeneZahlen[i] = lottoZahlGenerieren();
    }

    int[] zaehler = new int[49];
    for (int i = 0; i < zaehler.length; i++) {
      zaehler[i] = 0;
    }

    for (int zahl : gezogeneZahlen) {
      zaehler[zahl - 1]++;
    }

    int counter = 1;
    for (int zahl : zaehler) {
      System.out.println(counter++ + " = "+ zahl);
    }
  }

  // Lotto-Zahl zwischen 1 und 49
  public static int lottoZahlGenerieren() {
    return (int) (Math.random() * 49 + 1);
  }
}
