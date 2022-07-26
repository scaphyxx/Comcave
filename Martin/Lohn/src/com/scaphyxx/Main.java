package com.scaphyxx;

/** main */
public class Main {

  public static void main(String[] args) {
    int Stundenzahl = 40;
    double Stundenlohn = 9.80;
    double Steuersatz = 0.1;
    double Bruttolohn = Stundenzahl * Stundenlohn;
    double Steuer = (Stundenzahl * Stundenlohn) * Steuersatz;
    double Netto = Bruttolohn - Steuer;

    System.out.println("Stundenzahl: " + Stundenzahl);
    System.out.println("Stunenlohn: " + Stundenlohn);
    System.out.println("Steuersatz: " + Steuersatz);
    System.out.println();
    System.out.println("Bruttolohn: " + Bruttolohn);
    System.out.println("Steuer: " + Steuer);
    System.out.println("Netto: " + Netto);
  }
}
