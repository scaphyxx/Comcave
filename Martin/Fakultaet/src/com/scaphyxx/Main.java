package com.scaphyxx;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 5! = 1 * 2 * 3 * 4 * 5
    System.out.println(factorial(new Scanner(System.in).nextInt()));
  }

  static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
