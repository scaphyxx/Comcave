package aufgaben;

import java.lang.Math;

public class Quadratgleichung {

	  public static void main(String[] args) {
		    System.out.println(qGleichung(4));
		    System.out.println(qGleichung(2));
		    System.out.println(qGleichung(2.0/3));
		    System.out.println(qGleichung(0));
		  }

		  private static String qGleichung(double x) {
		    double quad = Math.pow(x, 2);
		    double ergebnis = 3 * quad - 8 * x + 4;
		    return "x = " + x + ": Ergebnis = " + ergebnis;
		  }

}
