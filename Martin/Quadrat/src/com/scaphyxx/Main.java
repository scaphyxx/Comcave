package com.scaphyxx;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    char escCodeCursorJump = 0x1B;

    Scanner s = new Scanner(System.in);

    System.out.print("Groesse des Quadrats: ");
    int in = s.nextInt();
    s.close();

    System.out.print("\033[H\033[2J");
    System.out.flush();


    while (true) {
      for (int i = 0; i < in; i++) {
        for (int j = 0; j < in; j++) {
          if (i == 0 || i == in - 1 || j == 0 || j == in - 1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
        Thread.sleep(30L);
      }

      for (int i = in; i > 0; i--) {
        for (int j = in; j > 0; j--) {
          int row = i;
          int column = j;
          System.out.print(String.format("%c[%d;%df", escCodeCursorJump, row, column));
          System.out.print(" ");
        }
        if (i != 1) {
          System.out.println();
        }
        Thread.sleep(30L);
        System.out.print(String.format("%c[%d;%df", escCodeCursorJump, 0, 0));
      }
    }
  }
}
