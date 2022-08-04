package com.scaphyxx;

/** main */
public class Main {

  public static void main(String[] args) {
    int[] fibonacci = new int[30];
    for (int i = 0; i < fibonacci.length; i++) {
      fibonacci[i] = fibonacci(i);
    }
    for (int i = 0; i < fibonacci.length; i++) {
      if (i == fibonacci.length - 1) {
        System.out.print(fibonacci[i]);
        break;
      }
      System.out.print(fibonacci[i] + ", ");
    }
  }

  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
